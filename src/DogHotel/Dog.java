package DogHotel;

public class Dog {
    private String Name;
    private char Gender;
    private int Age;
    private String Owner;

    public Dog(String N){
        Name=N;

    }
    public Dog(char G,int A,String O){
        Gender=G;
        Age=A;
        Owner=O;
    }

    public Dog(){

    }


    public String getName(){
        return Name;
    }


    public void giveFood(int W){
        int spoonNum;
        if(W<=100){
            spoonNum=1;
        }
        else{
            spoonNum=2;
        }
        System.out.println("Spoon number is "+spoonNum);
    }

    public void walkDog(int T){
        if(T==1930){
            System.out.println("Please walk the dog");
        }
    }


}
