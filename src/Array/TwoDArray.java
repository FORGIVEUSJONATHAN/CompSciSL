package array;
import java.util.Scanner;

public class TwoDArray {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] Weather = new int[7][4];
        for (int i = 0; i<7;i++){
            System.out.println(" please enter the hours in the" + i+1 +"day ");
            for (int j = 0; j<4; j++){
                System.out.println("please enter the "+ j+1 +" record of the day ");
                Weather[i][j]= input.nextInt();
            }
        }
    }

    public static void TempRecOutput(int[][] x){
        System.out.println("Which day you would like to search ");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        System.out.println("Which time intervel ");

    }
}
