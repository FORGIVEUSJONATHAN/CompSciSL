package Inheritence;


class Shape {

    public String color;
    public  void setColor(String Color){
        color=Color;
    }
    public String getColor(){
        return color;
    }
    public  double getArea(){
        return -1;
    }
    public static void main(String arg[]){
         Circle C1 = new Circle(5.0);
         C1.setColor("blue");
         Rectangle R1 = new Rectangle(5,8);
         R1.setColor("green");
         System.out.println("the color of the circle is "+ C1.getColor());
         System.out.println("the area of the circle is "+ C1.getArea());
         System.out.println("the color of the rectangle is "+ R1.getColor());
         System.out.println("the area of the rectangle is "+ R1.getArea());

    }
}



