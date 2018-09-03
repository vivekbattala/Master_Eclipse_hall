package abc;

import java.util.Scanner;

public class Scan extends operations {

	/*****
	 * Global declaration could help other methods to access these variable.
	 *********/
	static Scanner sc;
	static int user_input_num;       // variable for int user values
	static String user_input_string; // variable for char user values
	static String send; 
	// converted string variable to return to main function.

	public String fetch(String send) {
		// TODO Auto-generated constructor stub
		sc = new Scanner(System.in);
		if (sc.hasNextInt()) { // hasNextInt to return boolean.
			user_input_num = sc.nextInt();
			send = String.valueOf(user_input_num);
			// xxx System.out.println("It is an Interger Value");
		} else {
			user_input_string = sc.next();
			send = user_input_string;
			// xxx System.out.println("It is a String Value");
		}
		//sc.close();

		return send;
	}
	public void closeScan() {
		// TODO Auto-generated method stub
		sc.close();
	}

}
