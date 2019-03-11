package JavaBasic;

public class sumofseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1;
		int sum = i*(i+1)*(i+1);
		while (sum<1000000){
			i=i+1;
			sum = sum + i*(i+1)*(i+1);
		}
		System.out.println("The last term is "+(i-1)+" square");
	}
}
