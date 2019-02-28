package M16;


public class Client {
    private int customerID;
    private String name;
    private Dates arrive;
    private Dates leave;
    private Room bedroom;
    public Client (int id, String c, Dates dateIn, Dates dateOut, Room r){
        setCustomerID(id);
        setArrive(dateIn);
        setLeave(dateOut);
        setBedroom(r);
        setName(c);
    }
    public void setCustomerID(int id){
        customerID=id;
    }

    public void setName(String c) {
        this.name = c;
    }
    public void setArrive(Dates dateIn){
        arrive=dateIn;
    }

    public void setLeave(Dates dateOut) {
        leave=dateOut;
    }

    public void setBedroom(Room r) {
    bedroom=r;
    }

    public int getCustomerID() {
        return customerID;
    }
    public String getName(){
        return name;
    }
    public  Dates getArrive(){
        return arrive;
    }
    public  Dates getLeave(){
        return leave;
    }
    public Room getBedroom(){
        return bedroom;
    }
}


class Dates{
    private int day;
    private int month;
    private int year;
    public Dates(int day, int month, int year){
        this.day= day;
        this.month= month;
        this.year= year;
    }
    public int getDay(){
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }


}