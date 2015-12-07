package jp.ac.chibafjb.x15g025.kd221;


public class C221 {

	public static void main(String[] args) {
		int i;
		int score[] = new int[101];
		for(i=0;i<100;i++){
			score[i] = (int)(Math.random()*1000000)%1000;
		}
		score[100] = 999;
		int a;
		a = ArrayProc.linerSearch1(score,50);
		if(a!=-1){
			System.out.println("探索値50は、配列score["+a+"]に存在します");
		}
		else{
			System.out.println("探索値50は、配列score[]に存在しません");
		}
		a = ArrayProc.linerSearch2(score,50);
		if(a!=-1){
			System.out.println("探索値50は、配列score["+a+"]に存在します");
		}
		else{
			System.out.println("探索値50は、配列score[]に存在しません");
		}
	}
	

}
class ArrayProc{
	public static int linerSearch1(int[] s,int o){
		int i;
		for(i=0;s[i]!=999;i++){
			if(s[i]==o){
				return i;
			}
		}
		return -1;
	}
	public static int linerSearch2(int[] s,int o){
		int i;
		for(i=99;i>=0;i--){
			if(s[i]==o){
				return i;
			}
		}
		return -1;
	}
}
