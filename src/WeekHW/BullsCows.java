package WeekHW;

import java.util.Random;
import java.util.Scanner;

public class BullsCows {
    public static void main(String[] args) {
        int[]u= new int[4];
        int[] a = new int[4];
        Random random = new Random();
        int count = 0;
        while(count < a.length){
            boolean flag = true;
            int ran = random.nextInt(10);
            for(int i=0;i<a.length;i++){
                if(ran == a[i]){
                    flag = false;
                    break;
                }
            }
            if(flag) {
                a[count] = ran;
                System.out.print(ran);//Test for random number
                count++;
            }
        }
        System.out.println();
        u=SetU(u);
        while(CowBull(u,a)==false){
            SetU(u);
        }
        System.out.println("congratulation");
    }

    public static boolean CowBull(int[]x,int[]y){
        int cow = 0;
        int bull = 0;
        if (bull!=4) {
            for (int i = 0; i < x.length; i++) {
                for (int k = 0; k < y.length; k++) {
                    if (x[i] == y[k] && i != k) {
                        cow = cow + 1;
                    }
                    if (x[i] == y[k] && i == k) {
                        bull = bull + 1;
                    }
                }
            }
            System.out.println("there are "+cow+" cow and "+ bull +" bull");
        }
        if(bull==4){
            return true;
        }
        else {
            return false;
        }

    }
    public static int[] SetU(int[]u){
        System.out.println("please guess a four digit number, each of them is not repeatable");
        Scanner input = new Scanner(System.in);
        String userinput = input.nextLine();

        for (int i=0;i<4;i++){
            u[i]=Integer.parseInt(userinput.substring(i,i+1));
        }
        for(int i:u) {
            System.out.print(i );//Test for user input
        }
        System.out.println();//space line
        return u;
    }
}

