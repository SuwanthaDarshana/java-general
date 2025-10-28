package JavaTest.designPatterns.Behavioral.observer;

public class Main {
    public static void main(String[] args) {

        Order order = new Order();
        order.addObserver(new EmailService());
        order.addObserver(new WarehouseService());

        order.setStatus("Processing");
//        order.setStatus("Shipped");
//        order.setStatus("Delivered");

    }
}
