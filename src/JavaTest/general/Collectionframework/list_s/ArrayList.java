package JavaTest.general.Collectionframework.list;

import java.util.Collections;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("c++");
        list.add("javascript");
        list.add("c");
        list.add("c#");
        System.out.println(list);
        System.out.println("-----------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-----------------");

        list.remove("c");
        System.out.println(list);

        System.out.println("-----------------");

        for (String temp : list) {
            System.out.println(temp);
        }
        System.out.println("-----------------");

        System.out.println(list.get(0));  //accessing element
        System.out.println("-----------------");
        System.out.println(list.set(0, "Ruby")); //updating element
        System.out.println(list);
        System.out.println("-----------------");

        Collections.sort(list);
        System.out.println(list);
        System.out.println("-----------------");
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("-----------------");
        Collections.shuffle(list);
        System.out.println(list);


    }
}
