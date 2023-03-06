package Project;

import java.util.Scanner;

public class Addmultiplefile {
	int Number_of_file;

	public Addmultiplefile(int number_of_file) {
		Scanner inp = new Scanner(System.in);
		for (int i = 1; i <= number_of_file; i++) {
			System.out.println("Enter " + i + " File:");
			Listoffiles.add(inp.next());
		}
		System.out.println("All files added Successfully");
		new Terminate_or_continue().terminateOrContinue();
	}
}
