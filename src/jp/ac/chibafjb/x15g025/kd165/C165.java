package jp.ac.chibafjb.x15g025.kd165;

public class C165 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a[] = { 5, 10, 15 };
		int b[] = new int[3];

		int m;
		m = 3;
		for (int i = 0; i < m; i++) {
			b[i] = a[m - i - 1];
			System.out.println("b[" + i + "] = " + b[i]);
		}

	}

}
