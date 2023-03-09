package Project;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
	static int i = 1;
	public static void main(String[] args) {
		System.out.println("--------WELCOME--------");
		System.out.println("Name : Hithesh G Raj\nRole : Technical Trainee\n");
		try (Scanner inp = new Scanner(System.in)) {
			System.out.println("Select 1 -> Display Files\n" + "Select 2 -> To Perform File operations\n"
					+ "Select 3 -> Exit menu");
			int input = inp.nextInt();
			TerminateOrContinue terminateOrContinue = new TerminateOrContinue();
			switch (input) {
			case 1:
				new DisplayFile().sort();
				terminateOrContinue.terminateOrContinue();
				break;
			case 2:
				new FileOperations().fileOperations();
				;
			case 3:
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
			System.out.println("Input in form of Integer Only :" + e.getMessage());}
		  catch (Exception e) {
			e.printStackTrace();}
	}
}