package DogHotel;

import java.util.Scanner;

public class DogMain{

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("please input dog name 1");
        Dog Dog1 = new Dog(in.next());
        System.out.println("please input dog name 2");
        Dog Dog2 = new Dog(in.next());
        System.out.println("please input dog name 3");
        Dog Dog3 = new Dog(in.next());

        String dog1Name = Dog1.getName();
        String dog2Name = Dog2.getName();
        String dog3Name = Dog3.getName();
        System.out.println("the name of Dog1 is "+ dog1Name);
        System.out.println("the name of Dog2 is "+ dog2Name);
        System.out.println("the name of Dog3 is "+ dog3Name);

    }
}
