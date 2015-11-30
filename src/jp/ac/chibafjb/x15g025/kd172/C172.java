package jp.ac.chibafjb.x15g025.kd172;

public class C172 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x[] = { 1, 2, 3 };
		int y[] = { 7, 8 };
		int z[] = new int[5];
		int m = 3;
		int n = 2;
		int i;
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
