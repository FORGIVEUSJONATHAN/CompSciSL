package JavaBasic;

public class switchcaseconditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int x = 1, y = 2;
		    char ch = '*';
		    switch (ch) {
		        case '+':
		            System.out.println("x*y=" + (x + y));
		            break;
		        case '-':
		            System.out.println("x-y="+(x-y));
		            break;
		        case '*':
		            System.out.println("x*y="+(x*y));
		            break;
		        case '/':
		            System.out.println("x/y="+(x/y));
		            break;
		        default:
		            System.out.println("error");    
		    }
	}

}
