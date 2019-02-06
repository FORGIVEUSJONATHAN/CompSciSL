package GetterSetter;

public class Student {
    public static String name;
    private static int CandidateNo= 0420;
    private static int IBtotal=45;

    public static int getIBtotal(int No) {
            if (No==CandidateNo) {
                return IBtotal;
            }
            else {
                return -1;
            }
    }
    public static String setName(String S,int No){
        if(No==CandidateNo) {
            name = S;
            return name;
        }
        else{
            return "Invalid";
        }
    }
}
