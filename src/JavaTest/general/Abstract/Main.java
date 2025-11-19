package JavaTest.general.Abstract;

abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Animal sleeps");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    @Override
    void sleep() {
        System.out.println("Dog sleeps");
    }
}


public class Main {

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
        animal.sleep();
    }
}
