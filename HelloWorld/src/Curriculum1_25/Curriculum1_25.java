package Curriculum1_25;

// Scannerクラスをインポート
import java.util.Scanner;

import Curriculum1_25_2.Curriculum1_25_1;
// Curriculum1_25_2クラスのインポート
import Curriculum1_25_2.Curriculum1_25_2;

public class Curriculum1_25 {

	public static void main(String[] args) {

		/*
		
		 名前を入力したら下記がコンソールに出力されるように作ってください
			条件：数値は毎回変わるように作ってください
			 	 サブクラスを使用してください
				 スーパークラスを使用してください
				 getterとsetterを使用してください
				 packageを2つ作ってメインと処理を分けてください
				 命名する場合は規則にのっとってください
				 コンストラクタを使用してください
		
			こんにちは 「 名前 」 さん
			ステータス
			HP：849
			MP：862
			攻撃力：375
			素早さ：937
			防御力：24
		
			さあ冒険に出かけよう！
		
		 */

		// Scannerオブジェクトを作成
		Scanner scanner = new Scanner(System.in);

		// コンソールに入力
		System.out.print("名前を入力してください: ");

		// 入力した文字を受け取る
		String name = scanner.nextLine();

		// Scannerクラスを閉じる
		scanner.close();

		// Curriculum1_25_1クラスのインスタンスを作成し、ステータスを生成
		Curriculum1_25_1 generator = new Curriculum1_25_1();

		// ユーザーの入力した名前を格納
		Curriculum1_25_2 Curriculum1_25_2 = generator.status(name);

		// nullでない場合ゲッターで取得し以下を表示
		if (Curriculum1_25_2 != null) {

			System.out.println("こんにちは、" + Curriculum1_25_2.getName() + "さん");

			System.out.println("ステータス");

			System.out.println("HP: " + Curriculum1_25_2.getHp());

			System.out.println("MP: " + Curriculum1_25_2.getMp());

			System.out.println("攻撃力: " + Curriculum1_25_2.getAttack());

			System.out.println("素早さ: " + Curriculum1_25_2.getAgility());

			System.out.println("防御力: " + Curriculum1_25_2.getDefense());

		}

		// コンソールに出力
		System.out.println("さあ冒険に出かけよう！");

	}
}