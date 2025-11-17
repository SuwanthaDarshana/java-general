package JavaTest.devstack;

public class Main {
    public static void main(String[] args) {
        Example example = new Example("John", 30, "123 Main St");
//        System.out.println(example.getName());
//        System.out.println(example.getAge());
//        System.out.println(example.getAddress());
        example.printData();
    }
}
