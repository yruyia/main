package Curriculum1_25_2;

// ランダムクラスのインポート
import java.util.Random;

public class Curriculum1_25_1 {

	// statusメソッドの定義
	public Curriculum1_25_2 status(String name) {

		// 乱数生成
		Random random = new Random();

		// ステータスを0から999の範囲でランダムに生成
		int hp = random.nextInt(1000);

		int mp = random.nextInt(1000);

		int attack = random.nextInt(1000);

		int agility = random.nextInt(1000);

		int defense = random.nextInt(1000);

		// Characterインスタンスを作成し、名前とステータスを設定
		Curriculum1_25_2 Character = new Curriculum1_25_2(name, hp, mp, attack, agility, defense);

		// 呼び出し元に返す
		return Character;
	}
}