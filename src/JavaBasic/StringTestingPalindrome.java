package JavaBasic;

import java.util.Scanner;
public class StringTestingPalindrome {
	public static boolean isPalindrome(String x){
		boolean isPalindrome =true;
		int j = 0;
		for (int i = x.length()-1; i>=0;i--) {
			j = x.length()-1-i;
			if (x.charAt(j)!=x.charAt(i)) {
				isPalindrome= false;
			}
		}
		return isPalindrome;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter a word, the system will help you checkq the Palindrome");
		Scanner input = new Scanner(System.in);
		String Word = input.nextLine();
		System.out.println("the number is Palindrome or not " + isPalindrome(Word));
		
	}

}
