package JavaTest.general.LambdaExpression;


import java.util.ArrayList;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Fig");
        fruits.add("Grape");
        fruits.add("Kiwi");
        fruits.add("Lemon");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Papaya");
        fruits.add("Quince");
        fruits.add("Raspberry");
        fruits.add("Strawberry");
        fruits.add("Tomato");
        fruits.add("Ugli");
        fruits.add("Watermelon");
        fruits.add("Xigua");
        fruits.add("Yuzu");
        fruits.add("Zucchini");

        fruits.forEach(System.out::println);
//        fruits.forEach(fruit -> System.out.println(fruit));


    }

}
