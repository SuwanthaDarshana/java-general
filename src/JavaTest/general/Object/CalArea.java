package JavaTest.general.Object;

public class CalArea {

    private int a;
    private int b;

    // Default constructor
    public CalArea() {
    }

    // Parameterized constructor
    public CalArea(int a, int b) {
        this.a = a;  // assign values to instance variables
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
