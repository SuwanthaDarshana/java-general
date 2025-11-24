package JavaTest.questions.q1;


//Given an array of integers and a target number (e.g., 8), find two numbers in the array that add up to the target.

public class Example1 {


    public static void main(String[] args) {
        int[] arr = {2, 7, 11,3,6,-2, 15,7};
        int target = 9;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("The tow numbers that equel to target value are:  " + arr[i] + " " + arr[j]);
                    found = true;
                }
            }

        }
        if (!found) {
            System.out.println("No tow numbers that equel to target value");
        }


    }


}
