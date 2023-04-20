package curriculum1_12;

public class curriculum1_12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		問題．while文を使用し、以下のプログラムを作成してください。
			・1～100を出力
			・奇数の数字に「〇は奇数です」と出力
			・偶数の数字に「○は偶数です」と出力
			  出力結果  1は奇数です
						2は偶数です
						3は奇数です
						4は偶数です
							・
							・
							・
						100は偶数です
	*/
		//iに1を代入
			int i = 1;
			
			//iが100以下の場合
			while (i <= 100) {
				
				//iを表示
			    System.out.print(i);
			    
			    //iが偶数の時
			    if (i % 2 == 0) { 
			    	
			    	//iは偶数ですを表示
			        System.out.println("は偶数です");
			        
			        //iが偶数でないとき
			    } else { 
			    	
			    	//iは奇数ですを表示
			        System.out.println("は奇数です"); 
			    }
			    
			    //iに1を足す
			    i++; 
			    
			}
		}
	}
