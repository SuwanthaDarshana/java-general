package JavaTest.general.Method;

import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {

        System.out.println("Result is : "+ addSum(2,3));

        multiply();

    }

    public static int addSum(int num1, int num2){
//        int sum = 0;
//        sum = num1 + num2;
//        return sum;
        return num1 + num2;
    }

    public static void multiply(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num3 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num4 = scanner.nextInt();
        int product = num3 * num4;
        System.out.println("Product is: " + product);
    }
}
