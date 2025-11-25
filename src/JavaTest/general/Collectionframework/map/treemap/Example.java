package JavaTest.general.Collectionframework.map.treemap;

import java.util.TreeMap;

public class Example {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(6,"Java");
        map.put(2,"Python");
        map.put(3,"C++");
        map.put(5,"C");
        map.put(4,"C#");
        map.put(1,"JavaScript");
        map.put(3,"Ruby");
//        System.out.println(map);

        for(int i : map.keySet()){
            System.out.println(map.get(i));
        }
    }


}
