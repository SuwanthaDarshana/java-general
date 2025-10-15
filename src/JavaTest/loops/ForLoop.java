package JavaTest.loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a Number: ");
            int num = scanner.nextInt();
            sum += num;

        }
        System.out.println("Sum is: " + sum);
    }
}
