package JavaBasic;

import java.util.Scanner;

public class DrawaXgraph {

	public static void main(String[] args) {
	/// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int number = input.nextInt();
		
			System.out.println(" ");
			for (int x = 1; x<=number/2; x++) {
					System.out.println("x");
				}
			if (number%2==1) {
				System.out.println("x");
			}
			for (int a = 1; a<=number/2; a++) {
				System.out.println("x");
			
			}
		
		
		
	
	}
}
