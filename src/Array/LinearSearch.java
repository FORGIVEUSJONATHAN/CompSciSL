package array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int num[]= new int[20];
	    for (int i = 0; i < num.length; i++) {
	        num[i] = (int) (Math.random() * 31)-15; 
	      }
		System.out.println("Plz input a number for searching");
		int S = input.nextInt();
	    System.out.println(Search(num,S));
	}
	public static int Search(int[]x,int y) {
		int index = -1;
		for (int i =0;i<x.length;i++) {
			if (x[i]==y) {
				index=i;
				break;
			}
		}
		return index;
	}
}
