package JavaBasic;

import java.util.Scanner;

public class StringOutputName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("please input your name by starting with your first name");
		String name = input.nextLine();
		System.out.println("please input your birthday in terms of DD MM YYYY");
		String Birthday = input.nextLine();
		System.out.println(LastNameBirthdate(name,Birthday));
		}
	public static String LastNameBirthdate (String x, String y) {
			
	
			for (int i=0;i<x.length();i++) {
				if (x.charAt(i)==' ') {
					for (int j=i;j<=i+4;j++){
						System.out.print(x.charAt(j));	
					}
					i = x.length();
				}
			}
			
			for (int i = 6;i<=9;i++) {
				System.out.print(y.charAt(i));
			}
			
			return LastNameBirthdate(x,y);
	}
	
}
