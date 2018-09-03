package coreJava;

public class Validation extends Scanner1 {

	void validate() {
		// TODO Auto-generated constructor stub
		if (scan.hasNextInt()) {
			System.out.println(" You Have Entered Integer Value ");
			num = scan.nextInt();
			System.out.println("And the Value is" + num);

		} else {
			System.out.println(" You Have Entered String  ");
			userInput = scan.nextLine();
			System.out.println("And the Value is" + " " + userInput);

		}
	}
}
