package DiceGame;

import java.util.Scanner;

public class DiceGame7 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        PairofDice Player1 = new PairofDice();
        PairofDice Player2 = new PairofDice();
        PairofDice Player3 = new PairofDice();
        while(Player1.Roll2Dice("Jonathan",0120) == false){
            System.out.println("the number of the count is "+Player1.GetCount());
        }


    }


}
