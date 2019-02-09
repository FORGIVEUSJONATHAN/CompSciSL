package JavaBasic;

import java.util.Scanner;

public class RunsandScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Score = 0;
		int count = 1;
		while (count>0) {
			Scanner input = new Scanner(System.in);
			int RUNS = input.nextInt();
			if (RUNS>0) {
				Score = Score+RUNS;
			}
			else {
				System.out.println(Score);
				count = 0;
			}
		}
	}
	
}
