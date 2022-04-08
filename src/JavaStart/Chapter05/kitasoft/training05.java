package JavaStart.Chapter05.kitasoft;

public class training05 {
	
	public static void triangle(int size, char letter) {
		for (int i = 0; i <= size; i++) {
			for (int j = 0; j <= i; j++) {
					System.out.print(letter);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		triangle(3, '%');
		System.out.println();
		triangle(4, '&');
		System.out.println();
		triangle(5, '$');
		System.out.println();
		
	}

}
