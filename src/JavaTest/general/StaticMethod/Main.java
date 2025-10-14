package JavaTest.general.StaticMethod;

class Calculator {
    static int add(int a, int b) {
        return a + b;
    }
     int sub(int a, int b) {
        return a - b;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println(Calculator.add(10, 20));   //static ethod dont need to create object to access it is belongs to class not the object

        Calculator calculator = new Calculator();
        System.out.println(calculator.sub(10, 20));

    }
}
