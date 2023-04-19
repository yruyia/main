package curriculum1_7;

public class curriculum1_7 {

	public static void main(String[] args) {
		
//				問１）
//				以下のプログラムを作成してください。
//				①int型変数 i に 3 を代入する。
		int i = 3;
		
//				②double型変数 d に i を代入する。
		double d = i;
		
//				③変数 i と変数 d の値をそれぞれコンソールに表示する。
		//変数iの表示
		System.out.println(i);
		
		//変数dの表示
		System.out.println(d);
				
//				問２）
//				以下のプログラムを作成してください。
//				①double型変数 pi に数値「3.14」を代入して下さい。。
		double pi = 3.14;
		
//				②変数 pi に「3」を掛けた値をコンソールに出力して下さい。
		System.out.println(pi * 3);
		
//				④int型の変数 integer を宣言し、変数 pi を int型に型変換しコンソールに出力して下さい。
		int integer = (int)pi;
		
		//コンソールに出力
		System.out.println(integer);
				
//				問３）
//				①double型の変数を定義し、「2 + 6.0」を代入して下さい。
		double kasan = 2 + 6.0;
		
//				　double型の変数をコンソールに出力して下さい。
		System.out.println(kasan);
		
//				②int型の変数を定義し、double型の変数をint型に型変換して代入下さい。
		int kazu = (int)kasan;
		
//				　int型の変数をコンソールに出力して下さい。
		System.out.println(kazu);
		
//				③String型の変数を定義し、int型の変数をString型に型変換して代入して下さい。
		String mozi = String.valueOf(kazu);
		
//				　String型の変数をコンソールに出力して下さい。
				System.out.println(mozi);
				
//				④「②」で定義したint型変数に、String型の変数をint型に型変換して代入して下さい。
//				　int型の変数をコンソールに出力して下さい。
				//String型の変数をint型変数に変換
				kazu = Integer.parseInt(mozi);
				
				//int型の変数を出力
				System.out.println(kazu);
			}
	}

