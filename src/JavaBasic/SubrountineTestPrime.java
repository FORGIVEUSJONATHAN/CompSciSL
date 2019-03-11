package JavaBasic;

import java.util.Scanner;

public class SubrountineTestPrime {
	
	public static boolean TestingPrimeNum(int N) {
	
		for (int i=2;;i++) {
			if(i == 1 || (i % 2 == 0 && i != 2 ) )  continue;
			for (int j= 2;j< (int)Math.sqrt(i);j++)
			if (i%j==0||i==N) {
				System.out.println(N);
				return true;
			}
			else {
				System.out.println(N);
				return false;
			}
		}
	}
	 /** public static void TestingPrimeNum(int n ,int m){  
          for (int i = n; i < m; i++) {  
              int temp = (int)Math.sqrt(i);  
              if(i<=3){  
                  System.out.println(i);  
              }  
              for (int j = 2; j <= temp; j++) {  
                  if(i%j==0){  
                      break;  
                  }  
                  if(j>=temp){  
                      System.out.println(i);  
                  }  
              }  
          }  
      } */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a number");
		boolean output = TestingPrimeNum(19753);
		System.out.println(output);
	}
	  /**public static boolean isPrime(int num) {
	        if (num == 2 || num == 3)
	            return true;
	        if (num % 6 != 1 && num % 6 != 5)
	            return false;
	        int temp = (int) Math.sqrt(num);
	        for (int i = 5; i <= temp; i += 6) {
	            if (num % i == 0 || num % (i + 2) == 0)
	                return false;
	        }
	 
	        return true;
	    }

	    public static void main(String[] args) {
	        int i = 2;
	        while (i < 10000) {
	            boolean is = SubrountineTestPrime.isPrime(i);
	            if (is) {
	                System.out.println(i);
	            }
	            i++;
	        }
	 
	    }*/
	 
	}

