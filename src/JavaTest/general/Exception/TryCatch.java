package JavaTest.general.Exception;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a/b;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(" ");
            System.out.println(e);
            e.printStackTrace();
        }//finally {
           // System.out.println("Finally block");
        //}
    }
}
