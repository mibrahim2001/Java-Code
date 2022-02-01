public class SomeClass {
    int age;

    public SomeClass(int age) throws ArithmeticException{
        if(age<0)
            throw new ArithmeticException("Age cant be zero.");
        else
            this.age = age;
    }
}
