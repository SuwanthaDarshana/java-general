package JavaTest.oop.Inheritence;

public class Vehicle {

    private String type;
    private int speed;

    public Vehicle(String type, int speed) {
        this.type = type;
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.println("Vehicle is moving");
    }

    public void stop() {
        System.out.println("Vehicle is stopped");
    }

}
