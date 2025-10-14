package JavaTest.oop.Intefaces;

public interface Product {
    default double price(){
        return 0;
    }
    default String name(){
        return "";
    }
}
