package JavaTest.oop.Inheritence;

public class Drive {
    public static void main(String[] args) {
        Car car = new Car("SUV", 200, 4, "Toyota");
        car.move();
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getType());
        System.out.println("Color: " + car.getDoors());
        System.out.println("Speed: " + car.getSpeed());

        Vehicle vehicle = new Vehicle("SUV", 200);
        vehicle.move();
        System.out.println("Type: " + vehicle.getType());
        System.out.println("Speed: " + vehicle.getSpeed());

        System.out.println(" ");
        car.stop();
        System.out.println(" ");
        vehicle.stop();

    }
}
