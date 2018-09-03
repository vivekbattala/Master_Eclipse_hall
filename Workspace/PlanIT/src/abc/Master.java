package abc;

public class Master extends Scan {

	static String scan;
	static String optVal;

	public static void main(String[] args) {
		Master master = new Master();
		master.operation(); // this method has got operations to display.
		// I separately write the Scanner function in a separate class.
		// WE get the user values converted to string and saved in "scan" global variable.
		scan = master.fetch(send);		
		master.validate(); // this method validates the user value and calls the operations.java class
	}

	public String validate() {

		Master master = new Master();

		switch (scan) {
		case "1":			
			System.out.println("*** You Have Entered The Fibonacci Operation ***\nPlease Enter a Value to Execute.");
			fibo=master.operationVal(user_input_num);			
			master.fibonacci(fibo);
			break;
		case "2":
			System.out.println("*** You Have Entered Natural Number Operation ***\nPlease Enter a Value to Execute.");
			naturalnum=master.operationVal(user_input_num);			
			master.naturalNum(naturalnum);			
			break;
		default:
			System.out.println("**Error**");
		}
		return null;
	}

	public void operation() {
		System.out.println("Hi there, Please Select the operation from below..??\n");
		System.out.println("Press 1. For Fibonacci Operations \nPress 2. For Natural Numbers.");

	}
	public int operationVal(int num)
	{
		Master master=new Master();
		optVal=master.fetch(send);
		num=Integer.parseInt(optVal);		
		return num;

		
	}
}
