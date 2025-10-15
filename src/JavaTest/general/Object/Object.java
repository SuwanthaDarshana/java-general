package JavaTest.general.Object;

public class Object {
    public static void main(String[] args) {

        // Using default constructor + setters
        CalArea calArea = new CalArea();
        calArea.setA(10);
        calArea.setB(20);
        System.out.println("Area is: " + (calArea.getA() * calArea.getB()));

        // Using parameterized constructor
        CalArea calArea2 = new CalArea(2, 3);
        System.out.println("Area is: " + (calArea2.getA() * calArea2.getB()));
    }
}
