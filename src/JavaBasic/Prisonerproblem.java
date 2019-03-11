package JavaBasic;

public class Prisonerproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**boolean arr[] = new ArrayList;
		boolean length = isLength(0,1000000);
		boolean door = false;
		for (int i = 0; i<1000000;i++) {
			if (door=true) {
				door = false;
			}
		}
	}

	private static boolean isLength(int i, int j) {
		// TODO Auto-generated method stub
		return false;
	}*/
		double x = Math.sqrt(1000000);
		int number = 0;
		for (int i = 1;i<x;i++) {
			if (i*i<1000000) {
				number = number +1;
			}
		}
		System.out.println("the number of prisoner is "+number);
	}
}