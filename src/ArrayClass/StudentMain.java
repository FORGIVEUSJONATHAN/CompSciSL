package ArrayClass;

import java.util.Scanner;

public class StudentMain {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        Student[] Studs =  new Student[5];


        for(int i=0;i<5;i++){
            System.out.println("please input name and score for student " + (i+1));
            Studs[i]=new Student(in.next(),in.nextInt());
        }
        for (int i= 0; i<5;i++){
            System.out.println("the name of the student is "+Studs[i].getName());
            System.out.println("the score of the student is "+Studs[i].getScore());

        }
    }
}
