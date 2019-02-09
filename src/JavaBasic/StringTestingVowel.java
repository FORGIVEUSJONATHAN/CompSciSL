package JavaBasic;

import java.util.Scanner;
import java.lang.String;

public class StringTestingVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please input a sentence,it will check the number of vowels for you");
		char[] arr = {'a','e','i','i','u','A','E','I','O','U'};
		int count = 0;
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		for (int i = 0; i<sentence.length();i++) {
			for(int j= 0;j<arr.length;j++) {
				if (arr[j]==sentence.charAt(i)) {
					count =count +1;
				}
			}
		}
		System.out.println("there are "+count+" vowels in your sentence");
	}

}
