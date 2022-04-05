package JavaStart.Chapter05;

public class training101 {
	
	public static double getTriangleArea(double height, double base) {
		return (height * base) / 2;
	}
	public static void main(String[] args) {
		double triangleArea = getTriangleArea(10.0, 2.0);
		System.out.println("三角形の面積は" + triangleArea);
	}

}
