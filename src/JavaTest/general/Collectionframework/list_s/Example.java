package JavaTest.general.Collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
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


    }
}
