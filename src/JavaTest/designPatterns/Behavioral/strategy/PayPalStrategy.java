package JavaTest.designPatterns.Behavioral.strategy;

public class PayPalStrategy implements  PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid with paypal " + amount);
    }
}
