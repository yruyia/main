package curriculum1_16;

public class curriculum1_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1：「A」という文字列を変数に代入してコンソールに出力してください。
		
		//「A」という文字列を変数に代入
		String a = "A";
		
		//コンソールに出力
		System.out.println(a);

				// Q2：「Hello Java」という文字列を変数に代入してコンソールに出力してください。
		//「Hello Java」という文字列を変数に代入
		String bb = "Hello Java";
		
		//コンソールに出力
		System.out.println(bb);
					
				// Q3：富士山の標高を整数で変数に代入してコンソールに出力してください。
		//富士山の標高を整数で変数に代入
		int c = 3776;
		
		//コンソールに出力
		System.out.println(c);
		

				// Q4：円周率を小数点第二位まで変数に代入してコンソールに出力してください。
		//円周率を小数点第二位まで変数に代入
		double d = 3.14;
		
		//コンソールに出力
		System.out.println(d);
		
				// Q5：変数numsに「10, 100, 1000」が格納された配列を代入して、コンソールにメモリの番地が1のデータを出力してください。
		//変数numsに「10, 100, 1000」が格納された配列を代入
		int nums[] = {10, 100, 1000};
		
		//コンソールにメモリの番地が1のデータを出力
		System.out.println(nums[1]);
		

				// Q6：Q5で作成した変数numsを変数bに代入し、その後変数bのメモリの番地が1のデータを「8」に上書きさせて
				//     コンソールに変数numsと変数bのメモリの番地が1のデータを出力させて、変数nums値が変わることを確認してください。
		
		//Q5で作成した変数numsを変数bに代入
		int[] b = nums;
		
		//変数bのメモリの番地が1のデータを「8」に上書き
		b[1] = 8;
		
		//変数numsを出力
		System.out.println(nums[1]);
		
		//変数bを出力
		System.out.println(b[1]);

	}
}
