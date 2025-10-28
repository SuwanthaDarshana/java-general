package JavaTest.designPatterns.Behavioral.observer;

public class WarehouseService implements  OrderObserver {
    @Override
    public void update(String status) {
        System.out.println("WarehouseService: Order status updated to " + status);
    }
}
