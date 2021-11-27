public class Rectangle extends Shape{

    //variables for rectangle
    private double width;
    private double length;

    //constructors
    public Rectangle(){}

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }


    //getter setter methods

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //method to get area of rectangle
    public double getArea(){
        return getLength()*getWidth();
    }

    //method to get perimeter of rectangle
    public double getPerimeter(){
        return 2*(getLength()+getWidth());
    }

    //overriding computeArea method that we declared in interface
    @Override
    public double computeArea() {
        return getArea();
    }

    //overriding the reset method that we declared in interface
    @Override
    public void reset() {
        setLength(0);
        setWidth(0);
    }

    //toString method

    public String toString(){
        return String.format("%n<------Rectangle------>%nLength: %s%nWidth: %s",getLength(),getWidth());
    }
}
