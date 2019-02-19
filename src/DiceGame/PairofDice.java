package DiceGame;

public class PairofDice {
    private int Dice1;
    private int Dice2;
    private int Count=0;
    public PairofDice(){
         Dice1=(int) (Math.random()*6)+1;
         Dice2=(int) (Math.random()*6)+1;

    }
    public int  Roll2Dice(){
         Dice1=(int) (Math.random()*6)+1;
         Dice2=(int) (Math.random()*6)+1;
         int Sum = Dice1+Dice2;
         Count = Count+1;
         return Sum;
    }
    public int GetCount(){
        return Count;
    }

}
