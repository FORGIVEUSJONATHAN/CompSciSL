package Classeg;

import java.util.Scanner;

public class ClassEg {
    public static void main(String[] args){
        Dog Rex= new Dog();
        Rex.name="小明";
        Rex.dogDaddy="小明他爸";
        System.out.print("the dogs name will be "+Rex.name);

        Rex.Bark();

        System.out.println("how many numbers do you want Rex to count");
        Scanner input = new Scanner(System.in);
        int Num = input.nextInt();
        Rex.CountNum(Num);

    }
}
