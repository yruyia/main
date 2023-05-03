package Curriculum1_23;

public class Curriculum1_23 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		
		下記がコンソールに出力されるように作成してください
		※thisとsetterとgetterとフィールドを使ってください
		
		動物名：ライオン
		体長：2.1m
		速度：80km/h
		
		*/
		// インスタンスを生成
		Currirulum1_23_2 lion = new Currirulum1_23_2();

		// 名前を設定
		lion.setName("ライオン");

		// 体長を設定
		lion.setLength(2.1);

		// 速度を設定
		lion.setSpeed(80);

		// コンソールに出力
		System.out.println("動物名：" + lion.getName());

		// コンソールに出力
		System.out.println("体長：" + lion.getLength() + "m");

		// コンソールに出力
		System.out.println("速度：" + lion.getSpeed() + "km/h");

	}
}