package curriculum1_11;

public class curriculum1_11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		問題．switch文を使用し、以下のプログラムを作成してください。
				変数に数値を代入
				
			①2の場合は、「（変数）月は28日です。」
				出力結果：2月は28日です。
				
			②4，6，9，11の場合は、「（変数）月は30日です。」
				出力例：4月は30日です。
				
			③その他の場合は、「（変数）月は31日です。」
				出力例：1月は31日です。
	*/
		//int変数に4を代入
		int month = 4;
		
		//monthが2の時に
		switch(month){
		  case 2:
			  
			  //2月は28日です。を表示
		    System.out.println(month + "月は28日です。");
		    
		    //終了
		    break;
		    
		    //monthが4,6,9,11の時に
		  case 4:
		  case 6:
		  case 9:
		  case 11:
			  
			  //(変数)月は30日です。を表示
			  System.out.println(month + "月は30日です。");
			  
			  //終了
		    break;
		    
		    //monthがそれ以外の数字の時
		  default:
			  
			  //(変数)月は31日です。を表示
		    System.out.println(month + "月は31日です。");
		    
		}
	}
}
