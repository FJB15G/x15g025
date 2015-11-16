package jp.ac.chibafjb.x15g025.kd161;

public class C161 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
int test[] = new int[2];
test[0] = 10;
test[1] = 20;
int work;
work = test[0];
test[0] = test[1];
test[1] = work;
int i;
for(i=0;i<2;i++){
System.out.println("test["+i+"] = "+test[i]);
}
	}

}
