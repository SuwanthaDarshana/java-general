package JavaTest.solidprinciples.ocp;

public class PaymentProcessor {
    public void process(String type) {
        if (type.equals("credit")) {
            System.out.println("Processing credit card");
        } else if (type.equals("paypal")) {
            System.out.println("Processing PayPal");
        }
    }
}



/*

interface Payment {
    void pay();
}

class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Paid via Credit Card");
    }
}

class PayPalPayment implements Payment {
    public void pay() {
        System.out.println("Paid via PayPal");
    }
}

class PaymentProcessor {
    public void process(Payment payment) {
        payment.pay(); // no need to modify this class
    }
}


 */