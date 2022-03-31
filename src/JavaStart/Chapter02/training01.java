package JavaStart.Chapter02;

public class training01 {
	
	public static void main(String[] args) {
		
		// 「ようこそ占いの館へ」を表示
		System.out.println("ようこそ占いの館へ");
		
		// 「あなたの名前を入力してください」と表示
		System.out.println("あなたの名前を入力してください");
		
		// キーボードから文字の入力を受け付け、String型のnameに格納
		String name = new java.util.Scanner(System.in).nextLine();
		
		// 「あなたの年齢を入力してください」と表示
		System.out.println("あなたの年齢を入力してください");
		
		// キーボードから文字入力を受け付け、String型のageStringに格納
		String ageString = new java.util.Scanner(System.in).nextLine();
		
		//　ageStringの内容をint型に変換、int型のageに格納
		int age = Integer.parseInt(ageString);
		
		//　0から3までの乱数を生成、int型のfortuneに代入
		int fortune = new java.util.Random().nextInt(4);
		
		// fortuneの数値をインクリメントで１増やし１から４の乱数にする
		fortune++;
		
		// 「占いの結果が出ました」と表示
		System.out.println("占いの結果が出ました");
		
		/* 「（年齢）歳の（名前）さん、あなたの運気番号は（乱数）です」と表示
		 *  年齢にはage、名前にはname、乱数にはfoutune
		 */
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
		
		//　「１：大吉 ２；中吉 ３：吉 ４：凶」と表示
		System.out.println("１:大吉 ２:中吉 ３:吉 ４:凶");
	}
}
