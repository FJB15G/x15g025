package jp.ac.chibafjb.x15g025.kdT142;

import java.util.Scanner;

public class C142 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		System.out.println("整数aの入力");		
		int a = sin.nextInt();    //整数値の入力
		System.out.println("整数bの入力");
		int b = sin.nextInt(); 
		sin.close();
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
	}

}
