package JavaTest.devstack.inheritence;

public class Animal {
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

