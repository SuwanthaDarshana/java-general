package JavaTest.devstack.inheritence;

class Animal {
    public void makeNoise() {
        System.out.println("Animal makes a noise");
    }
}

class Dog extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("Dog barks");
    }
}

class  Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Cat meows");
    }
}

class Fish extends Animal {

}

public class Example  {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();
        dog.makeNoise();
        cat.makeNoise();
        fish.makeNoise();


        Animal animal = new Dog(); //Dynamic method dispatch (Runtime Polymorphism)
        animal.makeNoise();
    }
}

