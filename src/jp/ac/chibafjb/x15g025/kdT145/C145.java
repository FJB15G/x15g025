package jp.ac.chibafjb.x15g025.kdT145;

import java.util.Scanner;

public class C145 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		System.out.println("aの入力");		
		float a = sin.nextFloat();    //整数値の入力
		System.out.println("bの入力");
		float b = sin.nextFloat(); 
	    System.out.format("%f + %f = "+(a+b)+"\n",a,b);
	    System.out.format("%f - %f = "+(a-b)+"\n",a,b);
	    System.out.format("%f * %f = "+(a*b)+"\n",a,b);
	    System.out.format("%f / %f = "+(a/b),a,b);

		sin.close();
	}

}
