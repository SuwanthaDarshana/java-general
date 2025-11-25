package JavaTest.general.Collectionframework.map.hashmap;

import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(6,"Java");
        map.put(2,"Python");
        map.put(3,"C++");
        map.put(5,"C");
        map.put(4,"C#");
        map.put(1,"JavaScript");
        map.put(3,"Ruby");
        System.out.println(map);
    }
}
