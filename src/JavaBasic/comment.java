package JavaBasic;

public class comment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 注释内容
		/*... 注释内容....*/
		/**.. 注释内容....*/
		int N=9;
		for (int i=1;i<N;i++) {
			for (int j= 2;j< Math.sqrt(i);j++)
			if (i%j!=0) {
				System.out.println(i);
			}
		}
	}

}
