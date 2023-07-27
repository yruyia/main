/*
 	
 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"
 	
 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください
   	
   	例:
   	8,5,9,.....
   	と入力された場合（昇順）
   	
   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2
   	
   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2
	
 */

package curriculum29_1;

// Scannerクラスのインポート
import java.util.Scanner;

// curriculum29_2.AscendingSorterクラスのインポート
import curriculum29_2.AscendingSorter;
// curriculum29_2.DescendingSorterクラスのインポート
import curriculum29_2.DescendingSorter;
// curriculum29_2.Prefectureクラスのインポート
import curriculum29_2.Prefecture;

public class Main {

	public static void main(String[] args) {

		// 都道府県の配列生成
		Prefecture[] prefectures = {

				// 各都道府県の情報を配列に格納
				new Prefecture("北海道", "札幌市", 83424),
				
				new Prefecture("青森県", "青森市", 9646),
				
				new Prefecture("岩手県", "盛岡市", 15275),
				
				new Prefecture("宮城県", "仙台市", 7282),
				
				new Prefecture("秋田県", "秋田市", 11638),
				
				new Prefecture("山形県", "山形市", 9323),
				
				new Prefecture("福島県", "福島市", 13784),
				
				new Prefecture("茨城県", "水戸市", 6097),
				
				new Prefecture("栃木県", "宇都宮市", 6408),
				
				new Prefecture("群馬県", "前橋市", 6362),
				
				new Prefecture("埼玉県", "さいたま市", 3798)
		};

		// ユーザーの入力を受け取る
		Scanner scanner = new Scanner(System.in);

		// コンソールに出力
		System.out.print("都道府県の番号: ");

		// 入力された文字列をinputに格納
		String input = scanner.nextLine();

		// 入力された文字列をカンマで区切り,indexStrings配列に格納
		String[] indexStrings = input.split(",");

		// 都道府県番号を格納する配列を作成
		int[] indices = new int[indexStrings.length];

		// indexStrings配列をループ
		for (int i = 0; i < indexStrings.length; i++) {

			// 文字列から整数に変換し、indices配列に格納
			indices[i] = Integer.parseInt(indexStrings[i].trim());

		}

		// コンソールに出力
		System.out.print("昇順 or 降順: ");

		//  ユーザーが入力した選択を読み取り、sortOrderInput変数に格納
		String sortOrderInput = scanner.nextLine();

		// ユーザーの入力をisAscendingSort変数に格納
		boolean isAscendingSort = sortOrderInput.equalsIgnoreCase("昇順");

		// isAscendingSortがtrueなら
		if (isAscendingSort) {

			// AscendingSorter.sortPrefecturesメソッドで都道府県情報を昇順でソートした結果を取得
			for (Prefecture prefecture : AscendingSorter.sortPrefectures(prefectures, indices)) {

				//  都道府県情報を表示
				System.out.println(prefecture);

				// 改行
				System.out.println();

			}

			// folseなら
		} else {

			// DescendingSorter.sortPrefecturesメソッドで都道府県情報を降順でソートした結果を取得
			for (Prefecture prefecture : DescendingSorter.sortPrefectures(prefectures, indices)) {

				// 都道府県情報を表示
				System.out.println(prefecture);

				// 改行
				System.out.println();

			}
		}

		// Scannerクラスを閉じる
		scanner.close();

	}
}