package Inheritence;

 class Rectangle extends Shape{
        private double height;
        private double width;
        public Rectangle (double h,double w){
            height = h;
            width = w;
        }
        public void setHeight(double height){
            this.height=height;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public double getWidth() {
            return width;
        }

        public double getArea() {
            return width*height;
        }

}
