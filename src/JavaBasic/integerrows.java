package JavaBasic;

import java.util.Scanner;

public class integerrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a number");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		for(int i = 1; i<=number;i++) {
			System.out.println("");
			for (int a = 0; a<i;a++) {
				System.out.print(i);
			}
		}
	}

}
