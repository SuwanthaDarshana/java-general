package JavaTest.general.Collectionframework.list_s;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();  //var linkedList = new LinkedList<String>();
        linkedList.add("java");
        linkedList.add("python");
        linkedList.add("c++");
        linkedList.add("javascript");
        linkedList.add("c");
        linkedList.add("c#");

        System.out.println(linkedList);

        linkedList.removeFirst();

        System.out.println(linkedList);

        System.out.println("-----------------");

        Collections.sort(linkedList);
        System.out.println(linkedList);

        System.out.println("-----------------");

        for (String temp : linkedList) {
            System.out.println(temp);
        }
        System.out.println("-----------------");
    }

}
