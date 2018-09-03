package corejava;

public class HelloWorldNew {

	static int first, second, res;

	public static void main(String args[]) {
		first = 2;
		second = 3;

		HelloWorldNew add = new HelloWorldNew();
		add.addMethod();
		add.decimal();

	}

	public void addMethod() {
		// TODO Auto-generated method stub
		float dec;
		int count=1; 
		res = first + second;
		if (res == 5) {
		for (res = 0; res < 9; res++) {
			System.out.println("First Method 'For'"+" "+ count+ " " +res  );
			count ++;
		}
		
			dec = first % second;
			System.out.println("First Method 'Dividend' IF " + " " + dec);
		}
	}

	void decimal() {
		double first = 2.5;
		float second = (float) 1.0;

		double multiply = first * second;
		System.out.println(multiply + " " + "Second Decimal Method");

	}

}
