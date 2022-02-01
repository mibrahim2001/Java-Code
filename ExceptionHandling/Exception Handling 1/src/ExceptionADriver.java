public class ExceptionADriver {
    public static void getExceptionB() throws ExceptionB{
        throw new ExceptionB("Exception B thrown!");
    }

    public static void getExceptionC() throws ExceptionC{
        throw new ExceptionC("Exception C thrown!");
    }
    public static void main(String[] args){
        try {
            getExceptionB();
        }
        catch (ExceptionA e){
            e.printStackTrace();
        }

        try {
            getExceptionC();
        }
        catch (ExceptionA e){
            e.printStackTrace();
        }

    }
}

