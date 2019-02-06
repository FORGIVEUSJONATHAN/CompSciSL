package array;

import java.util.Scanner;

public class SumPositiveNum {
	public static int SumPositive(int[]x) {
		int Sum =0;
		 for (int i=0;i<x.length;i++) {
			 if (x[i]>0) {
				 Sum = Sum +x[i];
			 }
		 }
		 return Sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("How many numbers you would like to input in the array, please type");
		int j = input.nextInt();
		int [] num =new int[j];
		for (int i= 0;i<j;i++) {
			num[i]= input.nextInt();
		}
		System.out.println("the sum of the positive number is "+ SumPositive(num));
	}

}
