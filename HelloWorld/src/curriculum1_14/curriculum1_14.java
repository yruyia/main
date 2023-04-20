package curriculum1_14;

public class curriculum1_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		string型の配列を作成し、アルファベットa～jまでを格納してください。
//		brake文を使用し、a～dまで表示してください。
	//	
//		 出力結果：a
//		           b
//		           c
//		           d
//		          
//		cotinue文を使用し、i以外を表示してください。
	//	
//		 出力結果：a
//		           b
//		           c
//		           d
//		           e
//		           f
//		           g
//		           h
//		           j
		
		// string型の配列を作成し、アルファベットa～jまでを格納
		String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

	    // abcの要素の数だけiに1を足していく
	    for (int i = 0; i < abc.length; i++) {
	    	
	    	// abcがeの時
	        if (abc[i].equals("e")) {
	        	
	        	// 繰り返し処理を終了
	            break;
	        }
	        
	        // abcを表示
	        System.out.println(abc[i]);
	    }
	    
	    //改行
	    System.out.println();

	    // abcの要素の数だけiに1を足していく
	    for (int i = 0; i < abc.length; i++) {
	    	
	    	// abcがiの時に
	        if (abc[i].equals("i")) {
	        	
	        	// iを飛ばす
	            continue;
	        }
	        
	        //abcを表示
	        System.out.println(abc[i]);
            
        }
	}
}
