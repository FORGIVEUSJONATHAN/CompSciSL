package JavaBasic;

import java.util.Scanner;

public class guessingquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("you have 9 chances to guess, otherwise you lose the game");
		for (int i=0;i<10;i++) {
			Scanner input = new Scanner(System.in);
			System.out.println("please input the Value of A");
			int A = input.nextInt();
			System.out.println("please input the Value of B");
			int B = input.nextInt();
			if (A+B==18 && A*B==65) {
				System.out.println("You are right");
				i=10;
			}
			else {
				System.out.println("enter A and B again");
			}
		}
		
	}

}
