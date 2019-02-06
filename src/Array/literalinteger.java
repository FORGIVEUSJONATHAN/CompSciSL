package array;

import java.util.Scanner;

public class literalinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("How many numbers you would like to input in the array, please type");
		int j = input.nextInt();
		int [] num =new int[j];
		for (int i= 0;i<j;i++) {
			num[i]= input.nextInt();
		}
		nonconsecutive(num);
	}
	public static  void nonconsecutive(int[]x) {
		int i;
		for ( i=0;i<x.length-1;i++) {
			if (x[i]+1 != x[i+1]) {
				System.out.println(x[i+1]);
				break;
			}
		}
		if(i==x.length-1) System.out.println("null");
		return ;
	}
}
