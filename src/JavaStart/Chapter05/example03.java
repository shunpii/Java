package JavaStart.Chapter05;

public class example03 {
	
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("湊");
		hello("明日香");
		hello("菅原");
		System.out.println("メソッドの呼び出しが終わりました");
	}
	
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}

}
