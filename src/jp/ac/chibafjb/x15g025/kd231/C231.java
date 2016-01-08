package jp.ac.chibafjb.x15g025.kd231;

import java.util.Scanner;

public class C231 {

	public static void main(String[] args) {
		int data[] = {15,20,30,55,60};
		Scanner sin = new Scanner(System.in);
		System.out.println("探索値を入力してください。");
		int s_int = sin.nextInt();
		int a;
		a = ArrayProc.binarySearch1(data,s_int);
		if(a==-1){
		System.out.println("探索値"+s_int+"は配列Data[]に存在しません。");
		}
		else{
		System.out.println("探索値"+s_int+"は配列Data["+a+"]に存在します。");
		}
	}

}
class ArrayProc{
	public static int binarySearch1(int[] data,int s){
		int l = 0;
		int h = 4;
		int m =(l+h)/2;
		for(l=l;l<=h&data[m]!=s;l=l){
			if(data[m] < s){
				l = l + 1;
			}
			else{
				h = h - 1;
			}
			m = (l + h) / 2;
		}
		if(l <= h){
		return m;
		}
		else{
			return (-1);
		}
		
		
	}
}