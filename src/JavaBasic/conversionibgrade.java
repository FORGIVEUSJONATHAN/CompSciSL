package JavaBasic;

import java.util.Scanner;

public class conversionibgrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		int scoreafterconversion;
		if (score>=80) {
			scoreafterconversion = 7;
		}
		else if (score>=70) {
			scoreafterconversion = 6;
		}
		else if (score>=60) {
			scoreafterconversion = 5;
		}
		else if (score>=45) {
			scoreafterconversion = 4;
		}
		else if (score>=30) {
			scoreafterconversion = 3;
		}
		else if (score>=20) {
			scoreafterconversion = 2;
		}
		else {
			scoreafterconversion = 1;
		}
		System.out.println("Your original score is "+ score +" Your score after conversion is "+ scoreafterconversion);
	}

}
