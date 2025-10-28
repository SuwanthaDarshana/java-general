package JavaTest.designPatterns.Behavioral.observer;

public class EmailService implements  OrderObserver {
    @Override
    public void update(String status) {
        System.out.println("EmailService: Order status updated to " + status);
    }
}
