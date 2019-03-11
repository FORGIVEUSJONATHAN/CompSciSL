package JavaBasic;

import java.util.Scanner;

public class Xshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		for (int a = 0; a<number;a++) {
			for(int b = 0; b<number;b++) {
				if (a+b==number-1||a==b) {
					System.out.print("x");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
