package JavaTest.designPatterns.Creational.factory.example1;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone phone = phoneFactory.getPhone("iPhone");
        phone.showSpec();

    }
}
