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
        Animal myAnimal = new Dog();   // Reference type = Animal, Object type = Dog
        myAnimal.sound();              // Calls Dog's sound()

        myAnimal = new Cat();          // Now it's a Cat
        myAnimal.sound();              // Calls Cat's sound()
    }
}

