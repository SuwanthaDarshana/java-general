package JavaTest.designPatterns.Creational.factory.example2;

public class Paypal implements Payments{
    @Override
    public void pay() {
        System.out.println("Paid with paypal");
    }
}
