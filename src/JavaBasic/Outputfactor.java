package JavaBasic;

import java.util.Scanner;

public class Outputfactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please input an integer > 1");
		Scanner input = new Scanner(System.in);
		int integer = input.nextInt();// The user's input
		for (int i=1; i<=integer;i++) {// loop for checking the factor of the user input
			if (integer%i==0) { // factor must be divided without a remainder
				System.out.println(i);// print out the factor
			}
		}
	}
}
