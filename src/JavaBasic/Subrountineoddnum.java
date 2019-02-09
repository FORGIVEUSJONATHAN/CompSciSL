package JavaBasic;

public class Subrountineoddnum {
	public static void PrintOddNum(int N) {
		for (int i = N; i >= 0; i--) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintOddNum(10);
	}

}
