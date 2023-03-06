package Project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static int i = 1;

	public static void main(String[] args) {
		System.out.println("--------WELCOME--------");
		System.out.println("Name : Hithesh G Raj");
		try (Scanner inp = new Scanner(System.in)) {
			System.out.println("Select 1 -> Display Files\n" + "Select 2 -> Add Files\n" + "Select 3 -> Delete Files\n" + "Select 4 -> Search File\n"
					+ "Select 5 -> Exit menu");
			int input = inp.nextInt();
			Terminate_or_continue terminateOrContinue = new Terminate_or_continue();
			switch (input) {
			case 1:
				System.out.println(Listoffiles.list);
				terminateOrContinue.terminateOrContinue();
				break;
			case 2:
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
			case 3:
				System.out.println("Enter the File to Remove");
				try {
					String file = inp.next();
					new Deletefile(file);
					terminateOrContinue.terminateOrContinue();
					break;
				} catch (Exception e) {
					e.printStackTrace();
				}
			case 4:
				System.out.println("Enter the File to Search");
				String searchf = inp.next();
				new Search_file(searchf);

			case 5:
				return;

			default:
				while (i < 3) {
					System.out.println("Attempt " + i + " Failed Invalid Input\n");
					i++;
					new Main();
					Main.main(null);
				}
			}

		} catch (InputMismatchException e) {
			System.out.println("Input in form of Integer Only :" + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}