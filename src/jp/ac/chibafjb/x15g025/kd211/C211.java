package jp.ac.chibafjb.x15g025.kd211;

public class C211 {

	public static void main(String[] args) {
	int a;
	a = 3;
	int num[] = new int[a];
	num[0] = 15;
	num[1] = 3;
	num[2] = 9;
	System.out.println("配列num[]の最大値は、"+ArrayProc.maxFind1(num,a)+"です。");
	System.out.println("配列num[]の最大値は、"+ArrayProc.maxFind2(num,a)+"です。");
	}

}
class ArrayProc{
	public static int maxFind1(int[] num,int o){
		int i;
		int b;
		b = 0;
		for(i=0;i<o;i++){
			if(num[i] > b){
				b = num[i];
			}
		}
		return b;
	}
	public static int maxFind2(int[] num,int t){
		int i;
		int b;
		b = num[0];
		for(i=1;i<t;i++){
			if(num[i] > b){
				b = num[i];
			}
		}
		return b;
	}
	
}
