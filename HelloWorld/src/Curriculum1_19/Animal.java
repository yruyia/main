package Curriculum1_19;

// SimpleDateFormatをインポート
import java.text.SimpleDateFormat;
// Calendarクラスをインポート
import java.util.Calendar;

public class Animal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		// Dogクラスのインスタンス生成
		Dog dog1 = new Dog("犬");

		// メソッドを呼び出す
		dog1.printName();

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		// Dogクラスのインスタンス生成
		Dog dog2 = new Dog(5);

		// メソッドを呼び出す
		dog2.printCount();

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// カレンダーオブジェクトの生成
		Calendar cl = Calendar.getInstance();

		// SimpleDateFormatクラスでフォーマットパターンを設定する
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");

		// 出力する
		System.out.println(sdf.format(cl.getTime()));

	}
}