package ArrayClass;

public class Student {
    private String name;
    private int[] score= new int[5];
    public  Student (String name){
        this.name=name;
        for(int i=0;i<5;i++) {
            this.score[i]=(int) (Math.random() * 7) + 1;
        }
    }
    public String getName(){
        return this.name;
    }
    public int getScore(int x){
        return this.score[x];
    }
    public int[]getScore(){
        return score;
    }
    public void setScore(int[]x){
        score=x;
    }
    public void score(int s, int i){
        score[i]=s;
    }
}
