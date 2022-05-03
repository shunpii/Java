package Algorithm;

public class Q001 {
	
	public static void main(String[] args) {
/*		問題
		リンゴが5個あり、みかんがN個あります。
		整数Nが与えられるので、リンゴとミカンを合わせて何個あるかを出力するプログラムを作成しなさい。
*/
		int apple = 5;
		
		System.out.println("みかんの数を入力してください");
		int mikan = new java.util.Scanner(System.in).nextInt();
		
		
		System.out.println("合計個数は" + (apple + mikan) + "です");
	}

}
