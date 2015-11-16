package jp.ac.chibafjb.x15g025.kdT21;

import java.util.Scanner;

public class T21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		System.out.println("ハンバーガーの個数");		
		int h = sin.nextInt(); 
		System.out.println("フライドポテトの個数");		
		int f = sin.nextInt();
		System.out.println("ハンバーガーの代金 = "+(h*100)+"円");
		System.out.println("フライドポテトの代金 = "+(f*180)+"円");
		System.out.println("小計 = "+(h*100+f*180)+"円");
		int a;
		a =  (int) ((h*100+f*180)*0.08);
		System.out.println("消費税 = "+a+"円");
		System.out.println("合計金額 = "+((h*100+f*180)+a)+"円");
		System.out.println("受取金額");
		int u = sin.nextInt();
		System.out.println("つり銭 = "+(u-((h*100+f*180)+a))+"円");
		
		
	}

}
