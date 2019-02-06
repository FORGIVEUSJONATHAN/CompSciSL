package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Loadeddice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr =NumFreq();
		Arrays.sort(arr);
		if(arr[arr.length-1]-arr[0]>20) {
			System.out.println("the dice is biased");
		}
		else {
			System.out.println("unbiased");
		}
	}
	
	public static int DieRoll(){
			int num = (int) (Math.random()*6)+1;
		return num;
	}
	public static int[] NumFreq(){// number of people and the times of rolling
		int Num1=0;
		int Num2=0;
		int Num3=0;
		int Num4=0;
		int Num5=0;
		
		int Num6=0;
		for (int i=0; i<6;i++) {
			for (int j = 0; j<100;j++) {
				int d =DieRoll();
				if(d==1) {
					Num1= Num1+1;
				}
				else if(d==2) {
					Num2= Num2+1;

				}
				else if(d==3) {
					Num3= Num3+1;

				}
				else if(d==4) {
					Num4= Num4+1;

				}
				else if(d==5) {
					Num5= Num5+1;
				}
				else {
					Num6= Num6+1;
				}
			}
		}
		int [] arr= {Num1,Num2,Num3,Num4,Num5,Num6};
		return arr;
	}
}
