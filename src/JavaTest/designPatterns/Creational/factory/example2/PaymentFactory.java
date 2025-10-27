package JavaTest.designPatterns.Creational.factory.example2;

public class PaymentFactory {
    public Payments getPayment(String type){
        if(type.equalsIgnoreCase("creditCard")){
            return new CreditCard();
        }else if(type.equalsIgnoreCase("paypal")){
            return new Paypal();
        }
        return null;
    }
}
