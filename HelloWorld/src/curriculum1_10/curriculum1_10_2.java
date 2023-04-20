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
		//i初期値1,iが9以下の時に一を足していく
		for (int i = 1; i <= 9; i++) {
			
			//j初期値1,jが9以下の時に1を足していく
		    for (int j = 1; j <= 9; j++) {
		    	
		    	//i*jをresultに代入
		        int result = i * j;
		        
		        //i * j = resultを表示,タブ文字を挿入
		        System.out.print(i + "×" + j + "=" + result + "\t");
		    }
		    
		    //改行
		    System.out.println();
		    
		}
	}
}
