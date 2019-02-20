package Polymorphism;

public class Vehicle {
    private String color;
    private int regNo;

    Vehicle(String color,int regNo){
        this.color=color;
        this.regNo=regNo;
    }
    Vehicle(String Color){
        this.color=Color;
    }
    Vehicle(int regNo){
        this.regNo=regNo;
    }
    Vehicle(){
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getRegNo() {
        return regNo;
    }

    Owner owner1 = new Owner("Duang",110);
}

class Car {
    private int numDoors;
    Car(int numDoors){
        this.numDoors=numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }
    public void setNumDoors(int numDoors){
        this.numDoors=numDoors;
    }

}



class Truck {
    private int loads;
    Truck(int loads){
        this.loads=loads;
    }

    public int getLoads() {
        return loads;
    }

    public void setLoads(int loads) {
        this.loads = loads;
    }
}



class Bus{
    private int numPeople;
    Bus(int numPeople){
        this.numPeople=numPeople;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }
}



class Motorbike{
    private String category;

    Motorbike(String category){
        this.category=category; //Standard,Cruiser,sports bike,touring, sport touring, dual-sport
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}