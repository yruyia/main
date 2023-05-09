package Curriculum1_25_2;

public class Curriculum1_25_1 {

	// 変数宣言
	private int hp;

	// 変数宣言
	private int mp;

	// 変数宣言
	private int attack;

	// 変数宣言
	private int agility;

	// 変数宣言
	private int defense;

	// コンストラクタの定義
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

	// getterの定義
	public int getHp() {

		// hpを返す
		return hp;

	}

	// setterの定義
	public void setHp(int hp) {

		// このクラスで定義された「hp」に、引数として渡された値「hp」をセット
		this.hp = hp;

	}

	// getterの定義
	public int getMp() {

		// mpを返す
		return mp;

	}

	// setterの定義
	public void setMp(int mp) {

		// このクラスで定義された「mp」に、引数として渡された値「mp」をセット
		this.mp = mp;

	}

	// getterの定義
	public int getAttack() {

		// attackを返す
		return attack;

	}

	// setterの定義
	public void setAttack(int attack) {

		// このクラスで定義された「attack」に、引数として渡された値「attack」をセット
		this.attack = attack;

	}

	// getterの定義
	public int getAgility() {

		// agilityを返す
		return agility;

	}

	// setterの定義
	public void setAgility(int agility) {

		// このクラスで定義された「agility」に、引数として渡された値「agility」をセット
		this.agility = agility;

	}

	// getterの定義
	public int getDefense() {

		// defenseを返す
		return defense;

	}

	// setterの定義
	public void setDefense(int defense) {

		// このクラスで定義された「defense」に、引数として渡された値「defense」をセット
		this.defense = defense;

	}
}