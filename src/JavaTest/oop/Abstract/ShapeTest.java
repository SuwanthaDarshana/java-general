package JavaTest.oop.Abstract;

public class ShapeTest {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        rectangle.print();
        System.out.println("Area: " + rectangle.calculate());
    }
}
