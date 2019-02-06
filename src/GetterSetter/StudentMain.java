package GetterSetter;

public class StudentMain {
    public static void main(String[] args) {
        Student Jonathan = new Student();
        int IBtotal = Student.getIBtotal(12321);
        if (IBtotal==-1){
            System.out.println("there's an error");
        }
        else{
            System.out.println("you score will be "+IBtotal);
        }
        String NewName=Student.setName("Jason",213123);
        if (NewName=="Invalid"){
            System.out.println("Your ID is invalid");
        }
        else{
            System.out.println("your new name is " +NewName);
        }
    }
}