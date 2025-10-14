package JavaTest;

public class PrimeNumberCheck {

    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i = i + 2) { //check for odd devisor
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int number1 = 33;
        int number2 = 29;
        int number3 = 2;
        int number4 = 1;
        int number5 = -1;


        System.out.println("Number " + number1 + " is prime - " + checkPrime(number1));
        System.out.println("Number " + number2 + " is prime - " + checkPrime(number2));
        System.out.println("Number " + number3 + " is prime - " + checkPrime(number3));
        System.out.println("Number " + number4 + " is prime - " + checkPrime(number4));
        System.out.println("Number " + number5 + " is prime - " + checkPrime(number5));


    }


}

