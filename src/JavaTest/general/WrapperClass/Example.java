package JavaTest.general.WrapperClass;

public class Example {

    public static void main(String[] args) {
        int x =10;
        Integer y = x;   //autoboxing

        Integer z = 20;
        int w = z;       //unboxing

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
    }

}
