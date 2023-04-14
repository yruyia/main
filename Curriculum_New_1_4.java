package curriculum_New_question;

public class Curriculum_New_1_4 {
	static byte aByte;
	   //短整数型
	    static short aShort;
	    //整数型
	    static int aInt;
	    //長整数型
	    static long aLong;
	    //単精度浮動小数点型
	    static float aFloat;
	    //倍精度浮動小数点型
	    static double aDouble;
	    //文字型
	    static char aChar;
	    //文字列型
	    static String aString;
	    //ブーリアン型
	    static boolean aBoolean;
     public static void main(String[] args) {
    	 
    	 aByte = 0;
		 //短整数型
		     aShort = 0;
		    //整数型
		   aInt = 0;
		    //長整数型
		     aLong = 0L;
		    //単精度浮動小数点型
		     aFloat = 0.0f;
		    //倍精度浮動小数点型
		     aDouble = 0.0;
		    //文字型
		     aChar = '\u0000';
		    //文字列型
		 aString = null;
		    //ブーリアン型
		     aBoolean = false;
		    
		 // ・バイト型                 10
   	 aByte = 10;
	     // ・短整数型                 100
   	 aShort = 100;
	     // ・整数型                	 1000
   		 aInt = 1000;
	     // ・長整数型                 10000
   		 aLong = 10000L;
	     // ・単精度浮動小数点数型   	 9.5
   		 aFloat = 9.5f;
	     // ・倍精度浮動小数点数型		 10.5
   		 aDouble = 10.5;
	     // ・文字型                   a
    aChar = 'a';
	     // ・文字列型              	 ハロー
   		 aString = "ハロー";
	     // ・ブーリアン型          	 true
   	 aBoolean = true;
   		 
	     // Q1 下記9個をクラス変数として宣言のみしてください
	     //		・バイト型・短整数型・整数型・長整数型
	     // 	・単精度浮動小数点数型・倍精度浮動小数点数型
	     //   	・文字型・文字列型
	     //	 	・ブーリアン型 
    	 
    	 //クラス変数として宣言
     		 //バイト型
    		    
    

    	 
	     // Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
    	 
    	 //それぞれのクラス変数をローカル内でそれぞれの初期値を代入
  

	     // Q3 初期化をしたそれぞれの変数に下記の値を代入してください
    	 //代入処理
 
	     
	    	 
	     // Q4 下記の通りにコンソール出力されるようにしてください
	     // 必ず変数を使用すること
	     // 11110
    			 System.out.println(aByte + aShort + aInt + aLong);
	     // 20.0
    			 System.out.println(aDouble + aFloat);
	     // a ハロー true
    			 System.out.println(aChar + " " + aString + " " + aBoolean);
	     // 11130.0                    数字を全て足す
    			 System.out.println(aByte + aShort + aInt + aLong + aFloat + aDouble);
	     // 10000000000                小数点以外の数字を全てかける
    			 System.out.println(aByte * aShort * aInt * aLong);
	     // 0.105                      10.5割る100をする
    			 System.out.println(aDouble / 100);
	     // -90                        10引く100をする
    			 System.out.println(aByte - aInt);
    		 
    	 
    	// Q5 
    	// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
    	//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
 		String num = "20";
 		int num1 = 23;
 		System.out.println("ハローJAVA" + (num + String.valueOf(num1)));
     }
 }

