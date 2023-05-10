package Curriculum1_25;

// Randomクラスのインポート
import java.util.Random;
// Scannerクラスをインポート
import java.util.Scanner;

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

		// 入力した文字を受け取る
		String name = scanner.nextLine();

		// Scannerクラスを閉じる
		scanner.close();

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

		// hpをセット
		yusha.setHp(hp);

		// mpをセット
		yusha.setMp(mp);

		// attackをセット
		yusha.setAttack(attack);

		// agilityをセット
		yusha.setAgility(agility);

		// defenseをセット
		yusha.setDefense(defense);

		// コンソールに文字列とnameを出力
		System.out.println("こんにちは 「" + name + "」 さん");
		
		// コンソールに文字列を出力
		System.out.println("ステータス");

		// ゲッターでhpを取得しコンソールに出力
		System.out.println("HP：" + yusha.getHp());

		// ゲッターでmpを取得しコンソールに出力
		System.out.println("MP：" + yusha.getMp());

		// ゲッターでattackを取得しコンソールに出力
		System.out.println("攻撃力：" + yusha.getAttack());

		// ゲッターでagilityを取得しコンソールに出力
		System.out.println("素早さ：" + yusha.getAgility());

		// ゲッターでdefenseを取得しコンソールに出力
		System.out.println("防御力：" + yusha.getDefense());
		
		// 改行
		System.out.println();
		
		// コンソールに文字列を出力
		System.out.println("さあ冒険に出かけよう！");

	}
}