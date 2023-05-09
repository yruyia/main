package Curriculum1_25;

// Randomクラスのインポート
import java.util.Random;

// Curriculum1_25_2のインポート
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

		// Randomクラスのインスタンスを作成
		Random random = new Random();

		// hpを宣言し0~999までの乱数を代入
		int hp = random.nextInt(1000);

		// mpを宣言し0~999までの乱数を代入
		int mp = random.nextInt(1000);
		
		// attackを宣言し0~999までの乱数を代入
		int attack = random.nextInt(1000);
		
		// agilityを宣言し0~999までの乱数を代入
		int agility = random.nextInt(1000);
		
		// defenseを宣言し0~999までの乱数を代入
		int defense = random.nextInt(1000);

		// Curriculum1_25_2クラスのインスタンス生成しyusha変数に代入しステータスを引数で受け取る
		Curriculum1_25_2 yusha = new Curriculum1_25_2(hp, mp, attack, agility, defense);

		// nameを「名前」で初期化
		String name = "「名前」";
		
		// コンソールに出力
		System.out.println("こんにちは " + name + " さん");
		
		// ゲッターで取得しコンソールに出力
		System.out.println("HP：" + yusha.getHp());
		
		// ゲッターで取得しコンソールに出力
		System.out.println("MP：" + yusha.getMp());
		
		// ゲッターで取得しコンソールに出力
		System.out.println("攻撃力：" + yusha.getAttack());
		
		// ゲッターで取得しコンソールに出力
		System.out.println("素早さ：" + yusha.getAgility());
		
		// ゲッターで取得しコンソールに出力
		System.out.println("防御力：" + yusha.getDefense());
		
		// コンソールに出力
		System.out.println("さあ冒険に出かけよう！");

	}
}