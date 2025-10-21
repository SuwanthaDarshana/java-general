package JavaTest.oop.Inheritence;

public class Car extends Vehicle{

    private int doors;
    private String brand;

    public Car(String type, int speed, int doors, String brand) {
        super(type, speed);
        this.doors = doors;
        this.brand = brand;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public  void move(){
        System.out.println("Car is moving");
    }

    @Override
    public void stop(){
        super.stop();
        System.out.println("Car is stopped");
    }



}
