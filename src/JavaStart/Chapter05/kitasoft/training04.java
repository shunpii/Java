package JavaStart.Chapter05.kitasoft;

public class training04 {
	
	public static void DrowTriangle(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("&");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		DrowTriangle(3);
		System.out.println();
		DrowTriangle(4);
		System.out.println();
		DrowTriangle(5);
		System.out.println();
	}
}
