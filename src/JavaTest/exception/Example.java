package JavaTest.exception;

public class Example {
    public static void main(String[] args) {
        int num = 0;
        try {
            int result = 10/num;
            System.out.println(result);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("End of the program");


    }
}
