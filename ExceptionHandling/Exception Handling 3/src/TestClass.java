import java.awt.desktop.SystemEventListener;

public class TestClass {
    public static void main(String[] args) {
        int i = -2;
        try{
        SomeClass obj = new SomeClass(i);}
        catch (Exception e){
            System.err.println("Age can't be less than zero");
        }
    }
}
