package JavaTest.general.Collectionframework.set.linkedhashset;

import java.util.LinkedHashSet;

public class Example {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Ruby");
        linkedHashSet.add("Python");
        linkedHashSet.add("Java");
        linkedHashSet.add("C++");
        linkedHashSet.add("JavaScript");
        linkedHashSet.add("C");
        linkedHashSet.add("C#");
        linkedHashSet.add("Ruby");
        System.out.println(linkedHashSet);
    }
}
