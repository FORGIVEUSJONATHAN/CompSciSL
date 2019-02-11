package DiceGame;

import java.util.Scanner;

public class DiceGame7 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        PairofDice Player1 = new PairofDice();
        PairofDice Player2 = new PairofDice();

        while(Player1.Roll2Dice()!=7){
        }
        System.out.println("the number of the count for player 1 is "+Player1.GetCount());

        while(Player2.Roll2Dice()!=7){
        }
        System.out.println("the number of the count for player 2 is "+Player2.GetCount());

        if(Player1.GetCount()>Player2.GetCount()){
            System.out.println("Player2 wins");
        }
        else if(Player1.GetCount()<Player2.GetCount()){
            System.out.println("Player1 wins");
        }
        else {
            System.out.println("Both win");
        }
    }

}
