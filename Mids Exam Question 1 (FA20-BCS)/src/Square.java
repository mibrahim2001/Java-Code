
public class Square extends Rectangle{
    private double side;

    //constructors
    public Square(){}; //default constructor

    public Square(double side){
        this.side = side;
    }

    public Square(String color, boolean filled, double width, double length, double side) {
        super(color, filled, width, length);
        this.side = side;
    }

    //getter setter
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {

    }

    //computeArea method
    @Override
    public double computeArea() {
        return side*side;
    }

    //toString method
    public String toString(){
        return String.format("%n<------Square------>%nSide: %s",getSide());
    }
}
