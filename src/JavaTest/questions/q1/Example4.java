package JavaTest.questions.q1;

import java.util.HashSet;

public class Example4 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int target = 8;
        HashSet<Integer> set = new HashSet<>();
        boolean found = false;

        for (int num: arr){
            int required = target -num;

            if(set.contains(required)){
                System.out.println(required + ", " + num);
                found = true;
            }
            set.add(num);
        }
        if(!found){
            System.out.println("No pair found");
        }

    }
}
