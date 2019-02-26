package Polymorphism;

public class Owner extends Vehicle{
    private String name;
    private int drivinglic;
    Owner(String name,int drivinglic){
        this.name=name;
        this.drivinglic=drivinglic;
    }
    Owner(){

    }
    public void setName(String name){
        this.name=name;
    }
    public void setDrivinglic(int drivinglic) {
        this.drivinglic = drivinglic;
    }
    public String getName() {
        return name;
    }
    public int getDrivinglic() {
        return drivinglic;
    }

}
