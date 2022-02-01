import java.util.Scanner;

public class RethrowingExceptions {
    public static void someMethod1(){
        throw new IllegalArgumentException();}
    public static void someMethod2(){
        try {
            someMethod1();
        }catch (IllegalArgumentException e){
            System.out.println("Catched at someMethod 2");
            throw e;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner()
        try {
            someMethod2();
        }catch (IllegalArgumentException e){
            System.out.println("Cathced in main");
            e.printStackTrace();
        }

        System.out.println("This statement is executed after the try block");
    }
}
