package JavaTest.designPatterns.Creational.factory.example2;

public class CreditCard implements Payments{
    @Override
    public void pay() {
        System.out.println("Paid with credit card");
    }
}
