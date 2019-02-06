package Classeg;

public class Dog {
    public String name;
    private int age;
    String dogDaddy;

    public void Bark(){
        String BarkSound="汪汪汪汪汪";
        System.out.println(BarkSound);
    }

    public static void CountNum(int x){
        for (int i=1;i<=x; i++) {
            System.out.print(i+" ");
        }
    }
}

