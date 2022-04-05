package JavaStart.Chapter05;

public class training02 {
	
	public static void main(String[] args) {
		String title = "こんにちは";
		String address = "東京";
		String text = "Hello";
		email(title, address, text);
	}
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名；" + title);
		System.out.println("本文；" + text);
	}

}
