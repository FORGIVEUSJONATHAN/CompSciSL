package JavaBasic;

import java.util.Scanner;

public class Testonequestionfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 int N = input.nextInt();
		 int sum = 0;
		 for(int i=1; i<=N;i++) {
			 Scanner input2 = new Scanner(System.in);
			 int number = input.nextInt();
			 sum = sum + number;
		 }
		 System.out.println("the average of all you inputs is "+ sum/N);
	}

}
