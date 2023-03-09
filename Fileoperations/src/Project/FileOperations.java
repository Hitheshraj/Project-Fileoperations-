package Project;
import java.util.InputMismatchException;
import java.util.Scanner;
public class FileOperations {
	static int i = 1;
	Scanner inp = new Scanner(System.in);
	public void fileOperations() {
		System.out.println("--------File Operations--------");
		System.out.println("Select 1 -> To Add File\n" + "Select 2 -> To Remove File\n" + "Select 3 -> To Search File\n"
				+ "Select 4 -> Return to Menu");
		try {
			int choice = inp.nextInt();
			TerminateOrContinue terminateOrContinue = new TerminateOrContinue();
			switch (choice) {
			case 1:
				System.out.println("Press s : To Enter Single File\n" + "Press m :To Enter Multiple File");
				String n = inp.next();
				try {
					if (n.equals("s")) {
						System.out.println("Enter the file name :");
						new AddFile(inp.next());
						break;
					}
					if (n.equals("m")) {
						System.out.println("Enter the Number of Files to Enter :");
						int nofile = inp.nextInt();
						new AddMultiplefile(nofile);
						break;
					}
				} catch (InputMismatchException e) {
					e.getMessage();

				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Invalid Input Going Back to Main menu :");
				new Main().main(null);
			case 2:
				System.out.println("Enter the File to Remove");
				try {
					String file = inp.next();
					new DeleteFile(file);
					terminateOrContinue.terminateOrContinue();
					break;
				} catch (Exception e) {
					e.printStackTrace();
				}
			case 3:
				System.out.println("Enter the File to Search");
				String searchf = inp.next();
				new Search_file(searchf);
				break;
			case 4:
				new Main().main(null);
				break;
			default:
				while (i < 3) {
					System.out.println("Attempt " + i + " Failed Invalid Input\n");
					i++;
					new FileOperations().fileOperations();
				}
			}
		} catch (InputMismatchException e) {
			e.getMessage();
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
