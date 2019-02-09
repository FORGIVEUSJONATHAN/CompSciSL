package JavaBasic;

import java.util.Scanner;

public class SubrountineAge {
	public static void Fatheragetwice() {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter father's age");
		int fatherage = input.nextInt();
		System.out.println("please enter son's age");
		int sonage = input.nextInt();
		int Nyear = 0;
		System.out.println(fatherage+" "+sonage);
		for (int i=1;i<sonage;i++) {
			if(fatherage - i== (sonage-i)*2) {
				Nyear =i;
			}
		}
		System.out.println(Nyear+" years ago father was twice as old as his son");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fatheragetwice();
	}
}
