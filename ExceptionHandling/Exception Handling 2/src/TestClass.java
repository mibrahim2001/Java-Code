import java.io.IOException;

public class TestClass {
    public static void main(String[] args) {

        try {
            throw new ExceptionA("Exception A thrown");
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            throw new ExceptionB("Exception B thrown");
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            throw new NullPointerException("Exception NPE thrown");
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            throw new IOException("Exception IO thrown");
        }catch (IOException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
