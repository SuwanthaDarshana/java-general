package JavaTest.general.Interface;


interface Vehicle {
    public void start();
    public void stop();

}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}


public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(); // dynamic dispatch -- super class reference but sub class object --Method Overriding
        vehicle.start();
        vehicle.stop();
    }

}
