package coreJava;

import java.util.Scanner;

public class Scanner1 {

	static int num;
	static String userInput;
	static Scanner scan;

	static void scan() {
		scan = new Scanner(System.in);

		System.out.println("Enter Something");
		// To check what input class has given

		if (scan.hasNextInt()) {
			System.out.println(" You Have Entered Integer Value ");
			num = scan.nextInt();
			System.out.println("And the Value is" + num);

		} else {
			System.out.println(" You Have Entered String  ");
			userInput = scan.nextLine();
			System.out.println("And the Value is" + " " + userInput);
		}
		/*
		 * userInput = scan.nextLine(); here. Object value=userInput.getClass();
		 * //if() //String[] value1 =value.trim().split(".");
		 * System.out.println(value);
		 */
		close();
	}

	public static void close() {
		// TODO Auto-generated method stub
		scan.close();
	}

}
