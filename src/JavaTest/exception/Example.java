package JavaTest.exception;

public class Example {
    public static void main(String[] args) {
        int num = 0;
        try {
            int result = 10/num;
            System.out.println(result);
            int[] arr = new int[5];
            arr[20] = 10;
        }catch (NullPointerException | ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("Finally run");
        }
        System.out.println("End of the program");


    }
}
