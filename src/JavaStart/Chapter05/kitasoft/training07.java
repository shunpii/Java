package JavaStart.Chapter05.kitasoft;

public class training07 {
	
	public static boolean PrimeNumber(int num) {
		if (num <= 3) {
			return true;
		}
		for (int i = 2; i <= (num / 2); i++) {
			if ((num % i) == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		for (int n = 10000; n < 10100; n++) {
			if (PrimeNumber(n)) {
				System.out.print(n + " ");
			}
		}
	}
}
