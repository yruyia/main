package Curriculum1_25_2;

public class Curriculum1_25_2 {

	// フィールドを宣言
	private String name;

	private int hp;

	private int mp;

	private int attack;

	private int agility;

	private int defense;

	// コンストラクタの定義
	public Curriculum1_25_2(String name, int hp, int mp, int attack, int agility, int defense) {

		// 引数として渡された値をこのクラスの変数に代入
		this.name = name;

		this.hp = hp;

		this.mp = mp;

		this.attack = attack;

		this.agility = agility;

		this.defense = defense;
	}

	// 名前を取得するゲッターメソッド
	public String getName() {

		// nameを返す
		return name;

	}

	// 名前を設定するセッターメソッド
	public void setName(String name) {

		// このクラスの変数に代入
		this.name = name;

	}

	// HPを取得するゲッターメソッド
	public int getHp() {

		// hpを返す
		return hp;

	}

	// HPを設定するセッターメソッド
	public void setHp(int hp) {

		// このクラスの変数に代入
		this.hp = hp;

	}

	// MPを取得するゲッターメソッド
	public int getMp() {

		// MPを返す
		return mp;

	}

	// MPを設定するセッターメソッド
	public void setMp(int mp) {

		// このクラスの変数に代入
		this.mp = mp;

	}

	// 攻撃力を取得するゲッターメソッド
	public int getAttack() {

		// attackを返す
		return attack;
	}

	// 攻撃力を設定するセッターメソッド
	public void setAttack(int attack) {

		// このクラスの変数に代入
		this.attack = attack;

	}

	// 素早さを取得するゲッターメソッド
	public int getAgility() {

		// agilityを返す
		return agility;

	}

	// 素早さを設定するセッターメソッド
	public void setAgility(int agility) {

		// このクラスの変数に代入
		this.agility = agility;

	}

	// 防御力を取得するゲッターメソッド
	public int getDefense() {

		// defenseを返す
		return defense;

	}

	// 防御力を設定するセッターメソッド
	public void setDefense(int defense) {

		// このクラスの変数に代入
		this.defense = defense;

	}
}