package array;

public class twentyinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= new int[20];
		for (int i=0;i<=19;i++) {
			num[i]=(i+1)*(i+1);
		}
		for (int element:num) {
			System.out.print(element+" ");
		}
		for(int j =10; j<num.length;j++) {
			System.out.print(num);
		}
	}

}
