package curriculum1_15;

public class curriculum1_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		①配列int test[][]に以下の成績を格納し、表示してください。
			出力結果：生徒1：国語64点、数学73点、英語69点
					  生徒2：国語58点、数学81点、英語75点
					  生徒3：国語86点、数学68点、英語79点
					  生徒4：国語72点、数学55点、英語80点
			
		②それぞれの教科の平均点を表示してください。
			出力結果：国語の平均点は○○点です。
					  数学の平均点は○○点です。
					  英語の平均点は○○点です。
		*/
		// 配列int test[][]に成績を格納
		int test[][] = { 
				{ 64, 73, 69 },
				{ 58, 81, 75 },
				{ 86, 68, 79 },
				{ 72, 55, 80 } };
		
		// iを0にし、テスト配列より少ないとき1を足し続ける
		for (int i = 0; i < test.length; i++) {
			
			// 生徒,教科ごとの成績を表示
			System.out.println("生徒" + (i + 1) + "：国語" + test[i][0] + "点、数学" + test[i][1] + "点、英語" + test[i][2] + "点");
		}
		
		// 改行
		System.out.println();
		
		// 教科ごとの合計点数の変数を作成
		int sumKokugo = 0;
		int sumSugaku = 0;
		int sumEigo = 0;

		// iを0にし、テスト配列より少ないとき1を足し続ける
		for (int i = 0; i < test.length; i++) {
			
			// 教科ごとに合計点を算出
		    sumKokugo += test[i][0];
		    sumSugaku += test[i][1];
		    sumEigo += test[i][2];
		}

		// intをdoubleに変換し教科ごとの平均点を算出
		int avgKokugo = sumKokugo / test.length;
		int avgSugaku = sumSugaku / test.length;
		int avgEigo = sumEigo / test.length;

		// 結果を出力
		System.out.println("国語の平均点は" + avgKokugo + "点です。");
		System.out.println("数学の平均点は" + avgSugaku + "点です。");
		System.out.println("英語の平均点は" + avgEigo + "点です。");
		
	}
}
