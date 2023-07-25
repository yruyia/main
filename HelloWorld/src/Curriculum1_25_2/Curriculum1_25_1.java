package Curriculum1_25_2;

// ランダムクラスのインポート
import java.util.Random;

// Curriculum1_25_2をCurriculum1_25_1に継承
public class Curriculum1_25_1 extends Curriculum1_25_2 {

	// コンストラクタの定義
	public Curriculum1_25_1(String name, int hp, int mp, int attack, int agility, int defense) {

		// スーパークラスのコンストラクタを呼び出す
		super(name, hp, mp, attack, agility, defense);
	}

	// ランダムなステータスを生成するメソッドの定義
	public static Curriculum1_25_1 status(String name) {

		// 乱数生成
		Random random = new Random();

		// ステータスを0から999の範囲でランダムに生成
		int hp = random.nextInt(1000);

		int mp = random.nextInt(1000);

		int attack = random.nextInt(1000);

		int agility = random.nextInt(1000);

		int defense = random.nextInt(1000);

		// ステータスを持つインスタンスを生成し返す
		return new Curriculum1_25_1(name, hp, mp, attack, agility, defense);
	}
}