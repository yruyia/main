package curriculum29_2;

// ArrayListクラスをインポート
import java.util.ArrayList;
// Collectionsクラスをインポート
import java.util.Collections;
// Listクラスをインポート
import java.util.List;

public class AscendingSorter {

	// 昇順でソートするメソッドの定義
	public static List<Prefecture> sortPrefectures(Prefecture[] prefectures, int[] indices) {

		// 都道府県の情報を格納するリスト生成
		List<Prefecture> sortedPrefectures = new ArrayList<>();

		// indices配列の要素を順番に取り出すループ
		for (int index : indices) {

			// indicesから取り出した番号でprefectures配列から都道府県情報を取得し、sortedPrefecturesリストに追加
			sortedPrefectures.add(prefectures[index]);

		}

		// sortedPrefecturesリストを昇順でソート
		Collections.sort(sortedPrefectures, (p1, p2) -> p1.getName().compareTo(p2.getName()));

		// sortedPrefecturesを返す
		return sortedPrefectures;

	}
}