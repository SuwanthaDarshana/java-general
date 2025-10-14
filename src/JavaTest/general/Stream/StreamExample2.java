package JavaTest.general.Stream;

import java.util.List;

public class StreamExample2 {
    public static void main(String[] args) {
        List<String> fruits = List.of("Zucchini", "Lemon","Apple","Banana","Cherry","Mango","Orange","Papaya");
        fruits.stream().filter(fruit -> fruit.startsWith("A")).forEach(System.out::println);

//        fruits.stream().anyMatch(fruit -> fruit.contains("Banana"));
        System.out.println(fruits.stream().anyMatch(fruit -> fruit.contains("Banana")));

        boolean allmatch = fruits.stream().anyMatch(fruit -> fruit.startsWith("B"));
        System.out.println(allmatch);

        fruits.stream()
                .filter(fruit -> fruit.contains("B"))
                .forEach(System.out::println);


    }
}
