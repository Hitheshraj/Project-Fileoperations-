package Project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Terminate_or_continue {

	public void terminateOrContinue() {
		System.out.println("Select 1 : TO Go Back to main menu\n" + "Select 2 : TO Exit");
		try {
			Scanner inp = new Scanner(System.in);
			int n = inp.nextInt();
			if (n == 1) {
				new Main();
				Main.main(null);
			}
			if (n == 2) {
				return;
			}
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
