package jp.ac.chibafjb.x15g025.kd144;

import java.util.Scanner;

public class C144 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		System.out.println("住所の入力");		
		String a = sin.next();    //整数値の入力
		System.out.println("氏名の入力");
		String b = sin.next(); 
		System.out.println("電話番号の入力");
		String c = sin.next(); 
		System.out.println("<確認>住所："+a);
		System.out.println("氏名："+b);
		System.out.println("電話番号："+c);

		sin.close();
	}

}
