package Curriculum1_25_2;

public class Curriculum1_25_1 {

	// ステータスのhp
	private int hp;

	// ステータスのmp
	private int mp;

	// ステータスのattack
	private int attack;

	// ステータスのagility
	private int agility;

	// ステータスのdefense
	private int defense;

	// 5つの整数を引数で受けとるコンストラクタの定義
	public Curriculum1_25_1(int hp, int mp, int attack, int agility, int defense) {

		// コンストラクタが受け取ったhpの値をこのクラスのインスタンス変数であるhpに代入
		this.hp = hp;

		// コンストラクタが受け取ったmpの値をこのクラスのインスタンス変数であるmpに代入
		this.mp = mp;

		// コンストラクタが受け取ったattackの値をこのクラスのインスタンス変数であるattackに代入
		this.attack = attack;

		// コンストラクタが受け取ったagilityの値をこのクラスのインスタンス変数であるagilityに代入
		this.agility = agility;

		// コンストラクタが受け取ったdefenseの値をこのクラスのインスタンス変数であるdefenseに代入
		this.defense = defense;

	}

	// hpを取得するgetterの定義
	public int getHp() {

		// hpを返す
		return hp;

	}

	// hpを設定するsetterの定義
	public void setHp(int hp) {

		// このクラスで定義された「hp」に、引数として渡された値「hp」をセット
		this.hp = hp;

	}

	// mpを取得するgetterの定義
	public int getMp() {

		// mpを返す
		return mp;

	}

	// mpを設定するsetterの定義
	public void setMp(int mp) {

		// このクラスで定義された「mp」に、引数として渡された値「mp」をセット
		this.mp = mp;

	}

	// attackを取得するgetterの定義
	public int getAttack() {

		// attackを返す
		return attack;

	}

	// attackを設定するsetterの定義
	public void setAttack(int attack) {

		// このクラスで定義された「attack」に、引数として渡された値「attack」をセット
		this.attack = attack;

	}

	// agilityを取得するgetterの定義
	public int getAgility() {

		// agilityを返す
		return agility;

	}

	// agilityを設定するsetterの定義
	public void setAgility(int agility) {

		// このクラスで定義された「agility」に、引数として渡された値「agility」をセット
		this.agility = agility;

	}

	// defenseを取得するgetterの定義
	public int getDefense() {

		// defenseを返す
		return defense;

	}

	// defenseを設定するsetterの定義
	public void setDefense(int defense) {

		// このクラスで定義された「defense」に、引数として渡された値「defense」をセット
		this.defense = defense;

	}
}