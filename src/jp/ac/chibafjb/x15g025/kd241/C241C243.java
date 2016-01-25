package jp.ac.chibafjb.x15g025.kd241;

public class C241C243 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
int num[] =  {2,3,1,5,4};
System.out.println("num[] = "+num[0]+","+num[1]+","+num[2]+","+num[3]+","+num[4]);
ArrayProc.bubbleSort1(num);
System.out.println("num[] = "+num[0]+","+num[1]+","+num[2]+","+num[3]+","+num[4]);
ArrayProc.bubbleSort2(num);
System.out.println("num[] = "+num[0]+","+num[1]+","+num[2]+","+num[3]+","+num[4]);
	}
}

class ArrayProc{
	public static int[] bubbleSort1(int[] num){
		int i;
		int j;
		int work;
		for(j=num.length - 1;j>=1;j--){
			for(i=0;i<j;i++){
				if(num[i]>num[i+1]){
					work = num[i];
					num[i] = num[i+1];
					num[i+1] = work;
}
}
}
		return num;
}
	public static int[] bubbleSort2(int[] num){
		int i;
		int j;
		int work;
		for(j=num.length - 1;j>=1;j--){
			for(i=0;i<j;i++){
				if(num[i]<num[i+1]){
					work = num[i];
					num[i] = num[i+1];
					num[i+1] = work;
}
}
}
		return num;
}
}