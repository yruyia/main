package curriculum1_13;

public class curriculum1_13_2 {

	public static void main(String[] args) {
		
		// TODO 自動生成されたメソッド・スタブ
		/*
		①配列aを作成し、1～5を格納してください。
		
		②参照型配列bを作成し、3を表示してください。
			出力結果：3
			
		③配列a[3]を10で上書きし表示してください。
			出力結果：10
			
		④配列aの要素数を「配列aの要素数は、○です。」という形で表示してください。
			出力結果：配列aの要素数は、５です。
	*/
		// ①配列aを作成し、1～5を格納してください。
		int[] a = {1, 2, 3, 4, 5};

        // ②参照型配列bを作成し、3を表示してください。
		// 参照型配列bの作成
        int[] b;
        b = a;
        
        // 3の表示
        System.out.println(b[2]);

        // ③配列a[3]を10で上書きし表示してください。
        // 10で上書き
        a[3] = 10;
        
        // 10を表示
        System.out.println(a[3]);

        // ④配列aの要素数を「配列aの要素数は、○です。」という形で表示してください。
        System.out.println("配列aの要素数は、" + a.length + "です。");

	}
}