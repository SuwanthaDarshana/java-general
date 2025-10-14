package JavaTest;

import java.util.LinkedList;

public class LinkedListExamples {
    public static void main(String[] args) {
        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("orange");

        System.out.println(shoppingList);

        shoppingList.add(1, "milk");
        System.out.println(shoppingList);

        shoppingList.remove("orange");
        System.out.println(shoppingList);

        shoppingList.remove(1);
        System.out.println(shoppingList);

        shoppingList.set(1, "grapes");
        System.out.println(shoppingList);

        System.out.println(shoppingList.get(1));

        System.out.println(shoppingList.size());

        shoppingList.add("Bread");
        shoppingList.add("Butter");
        shoppingList.add("Cheese");
        shoppingList.add("Mushrooms");

        System.out.println(shoppingList);

        shoppingList.removeFirst();
        System.out.println(shoppingList);


        System.out.println(shoppingList.isEmpty());
        shoppingList.clear();

        System.out.println(shoppingList.isEmpty());




    }
}

