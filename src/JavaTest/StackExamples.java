package JavaTest;

import java.util.Stack;

public class StackExamples {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("A");    //add item
        stack.push("B");
        stack.push("C");


        System.out.println(stack);

//        if(!stack.isEmpty()) {
//            stack.set(0,"X");
//        }
//        System.out.println(stack);


        System.out.println(stack.pop()); //Last in first ot (LIFO)
        System.out.println(stack);

        System.out.println(stack.peek()); //View top


    }
}
