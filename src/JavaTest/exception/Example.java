package JavaTest.exception;

public class Example {

    public static void m1() throws RuntimeException {
        System.out.println("M1 Start");
        try{
            int num = 0;
            int result = 10 / num;
            System.out.println(result);
        }catch (RuntimeException e){
            throw new MyException(e.getMessage());
        }
        System.out.println("M1 End");
    }

    public static void m2() throws ArithmeticException{
        System.out.println("M2 Start");
        m1();
        System.out.println("M2 End");
    }

    public static void m3() throws ArithmeticException {
        System.out.println("M3 Start");
        m2();
        System.out.println("M3 End");
    }


    public static void main(String[] args) {

        System.out.println("Start Main");
        try {
            m3();
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("End Main");

    }
}
