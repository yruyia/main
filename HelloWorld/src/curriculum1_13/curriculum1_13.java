package curriculum1_13;

public class curriculum1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		int型の配列aを作成してください。
		配列aに1～5の数字を格納してください。
		繰り返し処理を使用し、
		配列aの数字を順番に表示させてください。

		出力結果：1
				  2
				  3
				  4
				  5
	*/
		// 配列aに1～5の数字を格納
		int[] a = {1, 2, 3, 4, 5}; 
		
		// aの要素数分繰り返す
		for (int i = 0; i < a.length; i++) { 
			
			// aの要素を出力
		    System.out.println(a[i]); 
		    
		}
	}
}
