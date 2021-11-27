public abstract class Shape implements Stats{
    private String color;
    private boolean filled;

    //constructors

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //default constructor

    public Shape(){
        this.filled = false;
        this.color = "abc";
    }

    //setter getter methods


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //toString method
    public String toString() {
        return String.format("%nColor: %s%nIs filled?: %s%n", getColor(), isFilled());
    }

}
