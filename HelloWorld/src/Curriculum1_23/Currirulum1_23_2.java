package Curriculum1_23;

public class Currirulum1_23_2 {

	// インスタンス生成
	private String name;

	// インスタンス生成
	private double length;

	// インスタンス生成
	private double speed;

	// コンストラクター生成
	public Currirulum1_23_2() {}

	// nameをセットするメソッド
	public void setName(String name) {

		// フィールドの値を受け取りインスタンス変数にセット
		this.name = name;
	}

	// lengthをセットするメソッド
	public void setLength(double length) {

		// フィールドの値を受け取りインスタンス変数にセット
		this.length = length;
	}

	// speedをセットするメソッド
	public void setSpeed(double speed) {

		// フィールドの値を受け取りインスタンス変数にセット
		this.speed = speed;
	}

	// nameを取得するメソッド
	public String getName() {

		// nameの値を返す
		return this.name;
	}

	// lengthを取得するメソッド
	public double getLength() {

		// lengthの値を返す
		return this.length;
	}

	// speedを取得するメソッド
	public double getSpeed() {

		// speedの値を返す
		return this.speed;

	}
}