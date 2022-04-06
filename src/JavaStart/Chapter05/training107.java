package JavaStart.Chapter05;

public class training107 {
	
	public static void printRandomMessage(String name) {
		String[] randomMessage = {"こんばんは", "こんにちは", "おはよう"};
		int n = new java.util.Random().nextInt(3);
		System.out.println(randomMessage[n] + name + "さん");
	}
	public static void main(String[] args) {
		printRandomMessage("太郎");
	}

}
