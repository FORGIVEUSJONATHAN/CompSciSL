package JavaBasic;

public class Fibonacci {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		   int[]arr=new int[20];
	        arr[1]=0;
	        arr[2]=1;
	        System.out.print(" "+arr[1]);
	        System.out.print(" "+arr[2]);
	        for(int i=3;i<18;i++){
	        		arr[i]=arr[i-1]+arr[i-2];
		        System.out.print("  "+arr[i]);
	        	
	        }
		
		
		int a = 0;
		int b = 1;
		int c = 0;
		do{
			c=a+b;
				if (c<1000) {
					System.out.println(c);
				}
					b=a;
					a=c;
				
		}while(c<1000);
	}
		
		
	
}