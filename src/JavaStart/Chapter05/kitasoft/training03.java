package JavaStart.Chapter05.kitasoft;

public class training03 {
	
	public static int big(int x, int y) {
		if (x < y) {
			return y;
		}else{
			return x;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(big(5,6));
	}

}
