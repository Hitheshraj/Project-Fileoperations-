package Project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class File_operations {
	static int i = 1;
	Scanner inp = new Scanner(System.in);
	public void file_operations()
	{
		System.out.println("--------File Operations--------");
		System.out.println("Select 1 -> To Add File\n" + "Select 2 -> To Remove File\n" + "Select 3 -> To Search File\n"
				+ "Select 4 -> Return to Menu");
		try{
			int choice = inp.nextInt();
		Terminate_or_continue terminateOrContinue = new Terminate_or_continue();
		switch (choice) {
		case 1:
			System.out.println("Press s : To Enter Single File\n" + "Press m :To Enter Multiple File");
			try {
				String n = inp.next();
				if (n.equals("s")) {
					System.out.println("Enter the file name :");
					new Addfile(inp.next());
					break;
				}
				if (n.equals("m")) {
					System.out.println("Enter the Number of Files to Enter :");
					int nofile = inp.nextInt();
					new Addmultiplefile(nofile);
					break;
				}
			} catch (InputMismatchException e) {
				e.getMessage();

			} catch (Exception e) {
				e.printStackTrace();
			}
		case 2:
			System.out.println("Enter the File to Remove");
			try {
				String file = inp.next();
				new Deletefile(file);
				terminateOrContinue.terminateOrContinue();
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		case 3:
			System.out.println("Enter the File to Search");
			String searchf = inp.next();
			new Search_file(searchf);break;
		case 4:new Main().main(null);break;
		default:
			while (i < 3) {
				System.out.println("Attempt " + i + " Failed Invalid Input\n");
				i++;
				new File_operations().file_operations();
				
			}

		}
	}catch(InputMismatchException e) {
		e.getMessage();
	}catch(Exception e) {
		e.getMessage();
	}
	}

}
