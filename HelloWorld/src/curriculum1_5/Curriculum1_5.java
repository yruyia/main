package curriculum1_5;

public class Curriculum1_5 {
	private static String favoriteFood;

	public static void main(String[] args) {

		// Q1 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		//  好きな食べ物のみインスタンス変数にして、他の項目はローカル変数に代入し○○に入れてください
		// 『山田太郎 18歳 170.5cm 62.2kg 寿司』

		// ↓↓format↓↓
		// 「初めまして○○です」
		// 「年齢は○○歳です」
		// 「身長は○○cmです」
		// 「体重は○○kgです」
		// 「好きな食べ物は○○です」

		// Q1を下記に記載
		//名前の変数生成
		String name = "山田太郎";
		//年齢変数生成
		int age = 18;
		//身長変数生成
		double height = 170.5;
		//体重変数生成
		double weight = 62.2;

		//インスタンス変数生成
		class Sushi {
			String like = "寿司";
		}
		Sushi s = new Sushi();

		// 「初めまして山田太郎です」
		System.out.println("初めまして" + name + "です");
		// 「年齢は18歳です」
		System.out.println("年齢は" + age + "です");
		// 「身長は170.5cmです」
		System.out.println("身長は" + height + "cmです");
		// 「体重は62.2kgです」
		System.out.println("体重は" + weight + "kgです");
		//sushi変数に代入。
		Sushi sushi = new Sushi();

		// 「好きな食べ物は寿司です」
		System.out.println("好きな食べ物は" + s.like + "です");

		// Q2 Q1で作成した自己紹介に続いて、BMIがコンソールに出力されるようにしてください
		// 「BMIは○○です」
		// ただし計算は数値を直書きせず、全て変数を使ってすること

		// Q2を下記に記載
		//mに変換
		double heightMeter = height / 100;
		//bmiの計算
		double bmi = weight / (heightMeter * heightMeter);
		//小数点第二位で四捨五入
		bmi = ((double) Math.round(bmi * 10)) / 10;
		//結果表示
		System.out.println("BMIは" + bmi + "です");

		// Q3 Q1で宣言した変数に再代入し、下記の通りコンソールに出力してください
		// 初めまして鈴木一郎です
		// 年齢は24歳です
		// 身長168.5cmです
		// 体重は64.2kgです
		// 好きな食べ物はオムライスです
		// BMIは22.6です

		// Q3を下記に記載
		//名前変更
		name = "鈴木一郎";
		//年齢変更
		age = 24;
		//        身長変更
		height = 168.5;
		//      体重変更
		weight = 64.2;
		//    好きな食べ物変更
		favoriteFood = "オムライス";
		//初めまして鈴木一郎です
		System.out.println("初めまして" + name + "です");
		//      年齢は24歳です
		System.out.println("年齢は" + age + "歳です");
		//    身長168.5cmです
		System.out.println("身長は" + height + "cmです");
		//  体重は64.2kgです
		System.out.println("体重は" + weight + "kgです");
		//好きな食べ物はオムライスです
		System.out.println("好きな食べ物は" + favoriteFood + "です");
		//mに変換
		heightMeter = height / 100;
		//bmiの計算
		bmi = weight / (heightMeter * heightMeter);

		//小数点第二位で四捨五入
		bmi = ((double) Math.round(bmi * 10)) / 10;
		//      BMIは22.6です
		System.out.println("BMIは" + bmi + "です");
	}

	// ↓↓コンソール最終結果↓↓

	//	初めまして山田太郎です
	//	年齢は18歳です
	//	身長170.5cmです
	//	体重は62.2kgです
	//	好きな食べ物は寿司です
	//	BMIは21.4です
	//	
	//	初めまして鈴木一郎です
	//	年齢は24歳です
	//	身長168.5cmです
	//	体重は64.2kgです
	//	好きな食べ物はオムライスです
	//	BMIは22.6です

}
