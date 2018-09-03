package corejava;

public class AsteriskPyramid {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(" ");
			count++;

			for (int j = i; j < 5; j++) {
				System.out.print("*");

			}

		}
		System.out.println(" ");
		AsteriskPyramid obj = new AsteriskPyramid();

		obj.revers();
	}

	void revers() {

		//for (int i = 5; i >= 0; i--) {
			//System.out.println(" "+i);

			for (int j = 0; j < 5; j++) {
				System.out.println("*"+j);

			}

		//}
	}

}
