package JavaTest.designPatterns.Behavioral.strategy;

public class CreditCardStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid with credit card " + amount);
    }
}
