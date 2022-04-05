package JavaStart.Chapter05;

public class training104 {
	
	public static void printRandomMessage() {
		String[] message = { "こんばんは", "こんにちは", "おはよう" };
		int n = new java.util.Random().nextInt(3);
		System.out.println(message[n]);
	}
	public static void main(String[] args) {
		printRandomMessage();
	}

}
