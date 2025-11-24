package JavaTest.questions.q1;

import java.util.HashSet;

public class Example1Optimise {
    public static void findPairs(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int required = target - num;

            if (set.contains(required)) {
                System.out.println(required + " + " + num + " = " + target);
            }

            set.add(num);
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 7, 11,3,6,-2, 15,7};
        findPairs(array, 9);
    }
}
