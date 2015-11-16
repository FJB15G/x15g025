package jp.ac.chibafjb.x15g025.kdT152;

import java.util.Scanner;

public class C152 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		System.out.println("半径rの入力");		
		float r = sin.nextFloat();    //整数値の入力
		System.out.format("円周"+(2*3.14*r)+"\n");
		System.out.format("面積"+(r*r*3.14)+"\n");
		
	}

}
