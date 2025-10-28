package JavaTest.designPatterns.Behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new PayPalStrategy());
        paymentService.processOrder(1000);

        paymentService = new PaymentService(new CreditCardStrategy());
        paymentService.processOrder(3000);
    }

}
