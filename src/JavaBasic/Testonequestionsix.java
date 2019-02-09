package JavaBasic;

import java.util.Scanner;

public class Testonequestionsix {
	

	public static void main(String[] args) {
	
		System.out.println("plz enter a value between 1 and 20");
		for(int i=0;i>=0;i++) {
			Scanner input = new Scanner(System.in);
			int N =input.nextInt();
			if (1<=N && N<=20) {
				System.out.println("Congratulation, you entered the correct number" + N);
				for (int j=1; j<=N ;j++) {
					System.out.println("");
					for (int k = 1; k<=N;k++) {
						System.out.print(j*k+" ");
					}
				}
			}
			else {
				System.out.println("plz, enter you number again");
			}
		}
	}
}
