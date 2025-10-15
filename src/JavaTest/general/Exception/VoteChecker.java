package JavaTest.general.Exception;

import java.util.Scanner;

public class VoteChecker {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid to vote");
        } else {
            System.out.println("Age is valid to vote");
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter your age: ");

        Scanner scanner = new Scanner(System.in);
        int age =scanner.nextInt();

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

    }

}
