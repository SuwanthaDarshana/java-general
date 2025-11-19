package JavaTest.devstack.polymorphism.overriding;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();     // method overriding -- dynamic dispatch -- super class reference but sub class object
        animal.sound();
    }
}
