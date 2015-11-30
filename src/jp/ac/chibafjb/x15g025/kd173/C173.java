package jp.ac.chibafjb.x15g025.kd173;

import java.util.Scanner;

public class C173 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int m = 3;
		int n =2;
		int x[] = new int [m];
		int y[] = new int [n];
		int a;
		int i;
		int z[] = new int[m+n];
		Scanner sin = new Scanner(System.in);
		System.out.println("x[]の要素入力");
		for(i=0;i<m;i++){
		a = sin.nextInt();
		x[i] = a;
		}
		System.out.println("y[]の要素入力");
		for(i=0;i<n;i++){
		a = sin.nextInt();
		y[i] = a;
		}
		sin.close();
		for (i = 0; i < m; i++) {
			z[i] = x[i];
		}
		for (i = 0; i < n; i++) {
			z[i + m] = y[i];
		}
		System.out.print("z[] = {");
		for (i = 0; i < z.length; i++) {
		if(i == z.length-1)
			System.out.print(z[i]);
		else
			System.out.print(z[i] + ",");
		}
		System.out.print("}");
	}
}