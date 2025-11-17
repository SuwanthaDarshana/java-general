package JavaTest.devstack.inheritence;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new  Calculator();
        calculator.setSize(300,300);
        calculator.setTitle("Calculator");
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setVisible(true);

    }
}
