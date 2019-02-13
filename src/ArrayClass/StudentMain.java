package ArrayClass;

import java.util.Scanner;

public class StudentMain {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        Student[] Studs =  new Student[5];
        String name;
        for(int i=0;i<5;i++){
            System.out.print("please input the name of the student");
            name=in.next();
            for(int j =0;j<5;j++) {
                Studs[i] = new Student(name);
            }
        }
        System.out.println("Name\tScore1\tScore2\tScore3\tScore4\tScore5");

        for (int i= 0; i<5;i++){
            System.out.print(Studs[i].getName()+"\t");
            for (int j= 0; j<5;j++) {
                System.out.print(Studs[i].getScore(j)+"\t");
            }
            System.out.println();
        }
    }
}
