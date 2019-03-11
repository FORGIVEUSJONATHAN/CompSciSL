package JavaBasic;

import java.util.Scanner;

public class Lockeddoor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean locked; 
		System.out.println("please inout the time, then the program will tell you whether the door is locked or not. ");
		for (int i = 0; i<10; i++) {
			Scanner input = new Scanner(System.in);
			int time = input.nextInt();
			if (2300 < time && time < 2400 || 0 < time && time < 500) {
				locked = true;
				System.out.println("the door is locked "+locked);
				break;
			}
			else if (500 < time && time < 2300){
				locked = false; 
				System.out.println("the door is opened "+locked);
				break;
			}
			else {
				System.out.println("please enter the date again");
			}
		}
	}

}
