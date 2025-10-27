package JavaTest.designPatterns.Creational.factory.example2;

public class Main {
    public static void main(String[] args) {

       PaymentFactory paymentFactory = new PaymentFactory();
       Payments payments = paymentFactory.getPayment("creditCard");
       payments.pay();

       payments = paymentFactory.getPayment("PayPal");
       payments.pay();



    }
}
