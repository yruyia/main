package curriculum27;

class Curriculum27_2 {

	public void Curriculum27_2(String input) {

		// 入力された文字列をコンマで分割してanimals配列に格納
		String[] animals = input.split(",");

		// animals配列のループ
		for (String animal : animals) {

			// ダブルコロンで分割しanimalInfoに格納
			String[] animalInfo = animal.split(":");

			// 名前を格納
			String name = animalInfo[0];

			// 体長を格納
			String length = animalInfo[1] + "m";

			// 速度を格納
			String speed = animalInfo[2] + "km/h";

			// ゲッターで学名を取得
			String scientificName = getScientificName(name);

			// 値がnullでなければ
			if (name != null && length != null && speed != null && scientificName != null) {

				// コンソールに動物名出力
				System.out.println("動物名：" + name);

				// コンソールに体長出力
				System.out.println("体長：" + length);

				// コンソールに速度出力
				System.out.println("速度：" + speed);

				// コンソールに学名出力
				System.out.println("学名：" + scientificName);

				// 改行
				System.out.println();

			}
		}
	}

	private String getScientificName(String name) {

		// nameが
		switch (name) {

		// ライオンなら
		case "ライオン":

			// パンテラ レオを返す
			return "パンテラ レオ";

		// ゾウなら
		case "ゾウ":

			// ロキソドンタ・サイクロティスを返す
			return "ロキソドンタ・サイクロティス";

		// パンダなら
		case "パンダ":

			// アイルロポダ・メラノレウカを返す
			return "アイルロポダ・メラノレウカ";

		// チンパンジーなら
		case "チンパンジー":

			// パン・トゥログロディテスを返す
			return "パン・トゥログロディテス";

		// シマウマなら
		case "シマウマ":

			// チャップマンシマウマを返す
			return "チャップマンシマウマ";

		// インコなら
		case "インコ":

			// 不明を返す
			return "不明";

		// どれでもなければ
		default:

			// nullを返す
			return null;

		}
	}
}