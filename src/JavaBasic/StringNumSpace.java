package JavaBasic;

import java.util.Scanner;

public class StringNumSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String I = "哈哈哈哈 哈哈哈 哈😂";
		System.out.println(I +" PLEASE INPUT A SENTENCE, it will check the spaces in you sentence!!!");
		Scanner input = new Scanner(System.in);
		String Sentence = input.nextLine();
		StringSpace(Sentence);
	}
	public static String StringSpace (String x) {
		

		int count = 0;
		for (int i=0;i<x.length();i++) {
			if (x.charAt(i)==' ') {
				count = count + 1;
			}
		}
		System.out.println("Your sentence have "+ count +" spaces");
		return StringSpace(x);
	}
}
