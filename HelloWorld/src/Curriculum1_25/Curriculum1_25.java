package Curriculum1_25;

//Scannerクラスをインポート
import java.util.Scanner;

//Curriculum1_25_1クラスのインポート
import Curriculum1_25_2.Curriculum1_25_1;

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

		// コンソールに出力
		System.out.print("名前を入力してください: ");

		// nameの宣言
		String name = scanner.nextLine();

		// Scannerクラスを閉じる
		scanner.close();

		// Curriculum1_25_1クラスのメソッドを使ってランダムなステータスを生成
		Curriculum1_25_1 chara = Curriculum1_25_1.status(name);

		// nullでない場合ゲッターで取得し以下を表示
		if (chara != null) {

			System.out.println("こんにちは、" + chara.getName() + "さん");

			System.out.println("ステータス");

			System.out.println("HP: " + chara.getHp());

			System.out.println("MP: " + chara.getMp());

			System.out.println("攻撃力: " + chara.getAttack());

			System.out.println("素早さ: " + chara.getAgility());

			System.out.println("防御力: " + chara.getDefense());

			// nullなら
		}else {
			
			// コンソールに出力
			System.out.println("名前を入力してください:");
		}

		// コンソールに出力
		System.out.println("さあ冒険に出かけよう！");
	}
}