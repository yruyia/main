package Curriculum1_19;

public class Dog {
	
	// Q1：フィールドに動物の名前の変数を定義してください。
	//　動物の名前の変数を定義
	String name;

	// Q2：フィールドに動物の数の変数を定義してください。
	//　動物の数の変数を定義
	int count;

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	//　コンストラクタ生成
	Dog(String n) {

		//　nをnameに代入
		name = n;
	}

	//　メソッド名
	void printName() {

		//　コンソールに出力
		System.out.println(name);
	}

	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	//　コンストラクタ生成
	Dog(int c) {

		//　cをcountに代入
		count = c;
	}

	//　メソッド名
	void printCount() {

		//　コンソールに出力
		System.out.println(count);
	}

}