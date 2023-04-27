package curriculum1_18;

import java.util.Random;

public class curriculum1_18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
		//メソッド名q1に引数に「Hello JavaSE 11」を渡す
		q1("Hello JavaSE", 11);

		// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
		//メソッド名q2に引数に「9,4」を渡す
		q2(9, 4);

		// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
		//q33の配列を作る
		int[] q33 = { 4, 7, 1 };

		//メソッド名q3に引数に配列を渡す
		q3(q33);

		// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		//q2の引数に渡す
		q2(3.2, 4.5);

		// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
		// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
		// ※0は出力＆格納しないようにしてください。
		//配列を作る
		int[] numbers = ransu(3);

		//配列の要素をnumberに代入していく
		for (int number : numbers) {

			//コンソールに出力
			System.out.println(number);

		}

		// Q6：引数にQ5で作成したメソッドの戻り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
		// ※小数点以下も表示されるようにしてください。
		//メソッドの戻り値を代入
		double average = result(numbers);

		//コンソールに出力
		System.out.println(average);

		// Q7：引数にQ6で作成したメソッドの戻り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
		//メソッドの戻り値を代入
		boolean is50 = Over50(numbers);

		//コンソールに出力
		System.out.println(is50);

	}

	//q1の引数としてmoziをkazuを受け取る
	public static void q1(String mozi, int kazu) {

		//コンソールに出力
		System.out.println(mozi + " " + kazu);

	}

	//q2の9と4を受け取る
	public static void q2(int a, int b) {

		//掛け算をする
		int result = a * b;

		//コンソールに出力
		System.out.println(result);

	}

	//q3の配列を受け取る
	public static void q3(int[] q33) {

		//iが配列数より少ないとき1を足していく
		for (int i = 0; i < q33.length; i++) {

			//コンソールに出力
			System.out.println(q33[i]);

		}

	}

	//q4：double型として受け取る
	public static void q2(double a, double b) {

		//足し算
		double result = a + b;

		//コンソールに出力
		System.out.println(result);

	}

	//q5メソッドの宣言
	public static int[] ransu(int count) {

		//ランダムクラス生成
		Random random = new Random();

		//長さがcountのint型の配列を生成
		int[] numbers = new int[count];

		//countの回数ループする
		for (int i = 0; i < count; i++) {

			//1-100までのランダムな整数を得る
			int number = random.nextInt(100) + 1;

			//numbersのi番目の要素に、変数numberの値を代入
			numbers[i] = number;

		}

		//戻り値としてnumbersを返す
		return numbers;

	}

	//q6メソッドの宣言
	public static double result(int[] numbers) {

		//初期値を0
		int sum = 0;

		//numbersの各要素に対して繰り返し処理を行う
		for (int number : numbers) {

			//sumとnumberの値を加算
			sum += number;

		}

		//結果を戻り値として返す
		return (double) sum / numbers.length;

	}

	//メソッドの定義
	public static boolean Over50(int[] numbers) {

		//resultの戻り値をavgに代入
		double avg = result(numbers);

		//50以上ならtrue
		return avg >= 50;

	}

}
