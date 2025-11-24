package JavaTest.general.Collectionframework.set.hashset;

import java.util.Collections;
import java.util.HashSet;

public class Example {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Ruby");
        set.add("Python");
        set.add("Java");
        set.add("C++");
        set.add("JavaScript");
        set.add("C");
        set.add("C#");
        set.add("Ruby");
        System.out.println(set);

        String check = "C";

        if (set.contains(check)) {
            System.out.println(check + " is present in the set");
        }else  {
            System.out.println(check + " is not present in the set");
        }

    }
}
