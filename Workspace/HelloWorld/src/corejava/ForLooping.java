package corejava;

public class ForLooping {

	int count = 1;

	void loop() {
		for (int a = 0; a < 58; a++) {
			System.out.println("We are in the for Loop" + " " + count);
			count++;
		}
	}

	public static void main(String[] args) {

		ForLooping obj = new ForLooping();
		obj.loop();

	}
}
