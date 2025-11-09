package JavaTest.datastructure;

import java.util.HashMap;

public class HashMapExamples {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Banana", 100);
        map.put("Apple",300);
        map.put("Guawa",200);

        System.out.println(map.get("Guawa"));
    }
}
