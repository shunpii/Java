package JavaStart.Chapter05;

public class training110 {
	
	public static void printMaxValue(double a, double b, double c) {
		if ((a > b) && (a > c)) {
			System.out.println(a);
		} else if ((b > a) && (b > c)) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		printMaxValue(8.5, 3.6, 1.0);
	}

}
