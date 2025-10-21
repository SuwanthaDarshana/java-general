package JavaTest.oop.Polimorphism.OverRiding;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.sound();


        Animal myAnimal = new Dog();   // Reference type = Animal, Object type = Dog
        myAnimal.sound();              // Calls Dog's sound()

       Animal myAnimal2 = new Cat();
        myAnimal2.sound();              // Calls Cat's sound()
    }
}

