package JavaTest.designPatterns.Creational;

public class Singleton {

    private Singleton() {
    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("Singleton instance is doing something");
    }




    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();

    }

}


