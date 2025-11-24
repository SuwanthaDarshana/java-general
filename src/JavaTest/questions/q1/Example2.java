package JavaTest.questions.q1;

//Given an array of integers and a target number (e.g., 8), find two numbers in the array that add up to the target.
//Time complexity: O(n^2)

public class Example2 {
    public static int[] findTwoNumbers(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; i < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{arr[i], arr[j]};
                }
            }

        }
        return new int[]{};

    }

    public static void main(String[] args) {
        int[] result = findTwoNumbers(new int[]{1,2,3,4,5,6,7}, 23);
        if (result.length > 0) {
            System.out.println(result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found");
        }
    }
}
