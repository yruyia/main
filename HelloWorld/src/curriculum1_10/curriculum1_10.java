package curriculum1_10;

public class curriculum1_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		問題.for文を使用し、以下のプログラムを作成してください。
			①変数iに1を代入
			②変数iに2ずつ足す処理を10回繰り返す。
				出力結果：  3
							5
							7
							9
							・
							・
							・
							21
							*/
		//変数iに1を代入
		int i = 1;
		
		//変数iに2ずつ足す処理を10回繰り返す。
		for(i = 1; i < 21; i+=2){
			
			//3から表示する
			System.out.println(i + 2);
			
		}
	}
}