package array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("output the num you need to search");
		int num = input.nextInt();
		int x[] =new int [100];
		for(int i=0; i<x.length;i++) {
			x[i]= (int)(Math.random()*500)+1;
		}
		Arrays.sort(x);
		System.out.println(BinSearch(x,0,100,num));
	}
	
	public static int BinSearch(int[]x,int lowb, int highb,int y) {
		  while (lowb <= highb) {
	            int mid = (lowb + highb) / 2;
	            if (y == x[mid]) {
	                return mid;
	            } else if (y > x[mid]) {
	                lowb = mid + 1;
	            } else {
	                highb = mid - 1;
	            }
	        }
	    	return -1;
	}
	
	   
}
