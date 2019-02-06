package array;


import java.util.Scanner;
public class nonDuplicate {
    public static String[] NoDup(String[] A) {
        for (int i=0; i<A.length-1; i++) {//第一组数据
            for (int j=i+1; j<A.length; j++) {//第二组数据
                if (A[i].equals(A[j]))  A[j]="";
            }
        }
        return A;
    }
     public static void printArr(String[] A) {
        for (int j=0; j<A.length; j++) {
            System.out.print(A[j]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many elements in your array?");
        int L = in.nextInt();
        String[] arr = new String[L];
        for (int j=0; j<L; j++) {
            System.out.println("Enter String number "+ (j+1));
            arr[j] = in.next();
        }
        printArr(arr);
        arr = NoDup(arr);
        printArr(arr);
    }
}
