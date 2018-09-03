package corejava;

public class ByteDatatype {

	byte a = 50;
	byte b = 80;
	static int c;

	void add() {

		c = a + b;

	}

	public static void main(String args[]) {

		ByteDatatype obj = new ByteDatatype();

		obj.add();
		
		System.out.println("The Byte Value is : " + c);
	}
}