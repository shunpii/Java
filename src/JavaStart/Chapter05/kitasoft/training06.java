package JavaStart.Chapter05.kitasoft;

public class training06 {
	
	public static void kuku(int n) {
		int num = 9;
		for (int i = 1; i <= num; i++) { 
			int ans = n * i;
			if (ans <= 9) {
				System.out.print(ans + "  ");
			} else {
				System.out.print(ans + " ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			kuku(i);
		}
		
	}

}
