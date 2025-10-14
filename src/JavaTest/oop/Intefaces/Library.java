package JavaTest.oop.Intefaces;

public class Library {
    public static void main(String[] args) {

        Product book = new Book(100, "Java");
        System.out.println(book.price());
        System.out.println(book.name());

    }
}
