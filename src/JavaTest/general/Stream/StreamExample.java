package JavaTest.general.Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

        list.stream().map(i -> i * 2).forEach(System.out::println);

        list.stream().sorted().forEach(System.out::println);

        list.stream().distinct().forEach(System.out::println);



    }
}
