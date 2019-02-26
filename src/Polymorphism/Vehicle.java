package Polymorphism;
import java.util.Scanner;

public class Vehicle {
    private String color;
    private int regNo;

    Vehicle(String color,int regNo){
        this.color=color;
        this.regNo=regNo;
    }
    Vehicle(String color){
        this.color=color;
    }
    Vehicle(int regNo){
        this.regNo=regNo;
    }

    Vehicle(){}

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getRegNo() {
        return regNo;
    }

    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        Vehicle[] V =  new Vehicle[10];
        Owner[] O = new Owner[10];
        boolean x =true;
            for (int i = 0; i < 10; i++) {
                while (x) {
                    O[i]= new Owner(in.next(),in.nextInt());
                    System.out.println("plz input the type of car");
                    switch (in.nextInt()) {
                        case 1:
                            V[i] = new Car(in.next(), in.nextInt(), in.nextInt());
                            break;
                        case 2:
                            V[i] = new Truck(in.next(), in.nextInt(), in.nextInt());
                            break;
                        case 3:
                            V[i] = new Bus(in.next(), in.nextInt(), in.nextInt());
                            break;
                        case 4:
                            V[i] = new Motorbike(in.next(), in.nextInt(), in.nextBoolean());
                            break;
                        default:
                            x = false;
                            break;
                    }
                }
            }
    }

}


class Car extends Vehicle{
    private int numDoors;
    Car(){}
    Car(String color, int regNo,int numDoors){
        super(color,regNo);
        this.numDoors=numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }
    public void setNumDoors(int numDoors){
        this.numDoors=numDoors;
    }
}



class Truck extends Vehicle{
    private int loads;
    Truck(){}
    Truck(String color, int regNo,int loads){
        super(color,regNo);
        this.loads=loads;
    }
    public int getLoads() {
        return loads;
    }
    public void setLoads(int loads) {
        this.loads = loads;
    }
}



class Bus extends Vehicle{
    private int numPeople;
    Bus(){}
    Bus(String color, int regNo,int numPeople){
        super(color, regNo);
        this.numPeople=numPeople;
    }
    public int getNumPeople() {
        return numPeople;
    }
    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }
}



class Motorbike extends Vehicle{
    private String category;
    private Boolean isElectric;

    Motorbike(){}
    Motorbike(String color, int regNo, boolean isElectric,String category){
        super(color,regNo);
        this.category=category; //Standard,Cruiser,sports bike,touring, sport touring, dual-sport
        this.isElectric=isElectric;
    }
    Motorbike(String color, int regNo, boolean isElectric){
        super(color,regNo);
        this.isElectric=isElectric;
    }

    public Boolean getElectric() {
        return isElectric;
    }
    public Boolean getIsElectric(boolean isElectric){
        this.isElectric=isElectric;
        return isElectric;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

}