package jp.ac.chibafjb.x15g025.kd222;


public class C222 {

	public static void main(String[] args) {
		double i;
		double score[] = new double[101];
		for(i=0;i<100;i++){
			score[(int) i] =Math.random()*1000000%1000;
		}
		score[100] = 999;
		double a;
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
	public static double linerSearch1(double[] s,double o){
		double i;
		for(i=0;s[(int) i]!=999;i++){
			if(s[(int) i]==o){
				return i;
			}
		}
		return -1;
	}
	public static double linerSearch2(double[] s,double o){
		double i;
		for(i=99;i>=0;i--){
			if(s[(int) i]==o){
				return i;
			}
		}
		return -1;
	}

}
