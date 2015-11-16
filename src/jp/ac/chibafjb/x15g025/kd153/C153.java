package jp.ac.chibafjb.x15g025.kd153;

import java.util.Scanner;

public class C153 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		System.out.println("半径rの入力");		
		float r = sin.nextFloat();    //整数値の入力
		System.out.format("円周"+Math.round(2*3.14*r*10)/10.0+"\n");
		System.out.format("面積"+Math.round(r*3.14*r*10)/10.0+"\n");
	}

}
