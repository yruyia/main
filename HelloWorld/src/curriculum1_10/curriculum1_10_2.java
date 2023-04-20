package curriculum1_10;

public class curriculum1_10_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*	
		問題.for文を使用して九九の計算を出力してください。
			※出力例 	1×1=1 1×2=2…1×9=9
						2×1=2 2×2=4…2×9=18
								・
								・
								・
						9×1=9 9×2=18…9×9=81
						*/
		for (int i = 1; i <= 9; i++) {
		    for (int j = 1; j <= 9; j++) {
		        int result = i * j;
		        System.out.print(i + "×" + j + "=" + result + "\t");
		    }
		    System.out.println();
		}
	}
}
