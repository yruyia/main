package Curriculum1_22_2;

//　SimpleDateFormatをインポート
import java.text.SimpleDateFormat;
// Calendarクラスをインポート
import java.util.Calendar;

public class Curriculum1_22_2 {

	// 1行目の変数を生成
	String aisatu;

	// 2行目の変数を生成
	String azi;

	// 3行目の変数を生成
	String shurui;

	// コンストラクターの定義
	public Curriculum1_22_2() {

		// 1行目の初期値の設定
		this.aisatu = "こんにちは！ここは日本です！";

		// 2行目の初期値の設定
		this.azi = "この寿司はうまい";

		// 3行目の初期値の設定
		this.shurui = "寿司は和食です";

		// this.aisatuを表示
		System.out.println(this.aisatu);

		// this.aziを表示
		System.out.println(this.azi);

		// this.shuruiを表示
		System.out.println(this.shurui);

		// カレンダーオブジェクトの生成
		Calendar cl = Calendar.getInstance();

		// SimpleDateFormatクラスでフォーマットパターンを設定する
		SimpleDateFormat sdf = new SimpleDateFormat("今の現在日時はyyyy/MM/dd H:m:sです");

		// 出力する
		System.out.println(sdf.format(cl.getTime()));

	}
}