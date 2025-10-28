package JavaTest.designPatterns.Behavioral.strategy;

public class PaymentService {

    private PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder(double amount){
        paymentStrategy.pay(amount);
    }

}
