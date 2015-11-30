package jp.ac.chibafjb.x15g025.kd171;

public class C171 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
int data[] = {100,200,300,0};
int k;
k = 3;
int i;
for(i = 0;i<k;i++){
	data[k-i] = data[k-1-i];
}
for(i=0;i<data.length;i++){
System.out.println("data["+i+"] = "+data[i]);
	}

}
}
