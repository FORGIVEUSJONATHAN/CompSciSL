package array;

import java.util.Arrays;

public class randomnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= new int[25];
	    for (int i = 0; i < num.length; i++) {
	        num[i] = (int) (Math.random() * 1000000); 
	      }
	    Arrays.sort(num);
	   // for(int element:num) {
	 //   	System.out.print(element+"  ");
	  //  }
	    System.out.println("the smallest number is "+ num[0]+" the largerest number in the array is "+ num[24]);
	}

}
