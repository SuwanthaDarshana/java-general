package JavaTest.questions.q1;


import java.util.HashSet;

//Time complexity: O(n)

public class Example3 {

    public static int[] findTwoNumbers(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();


        for (int num : arr) {
            int complement = target - num;

            if (set.contains(complement)) {
                return new int[]{complement, num};
            }

            set.add(num);
        }

        return new int[]{};

    }


    public static void main(String[] args) {
        int[] result = findTwoNumbers(new int[]{1, 2, 3, 4, 5, 6, 7}, 8);
        if (result.length > 0) {
            System.out.println(result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found");
        }
    }
}

