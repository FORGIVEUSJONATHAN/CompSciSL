package Inheritence;

 class Circle extends Shape{
     private double radius;
     public Circle (double r){
         radius=r;
     }
     public void setRadius(double r){
            radius=r;
     }
     public double getRadius(){
            return radius;
     }
     public double getArea(){
            double area = radius*radius*3.14;
            return area;
     }


}
