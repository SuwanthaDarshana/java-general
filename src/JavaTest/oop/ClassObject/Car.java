package JavaTest.oop.ClassObject;

public class Car {

    String brand;
    int year;
    String color;

    public Car(String brandName, int yearMade, String colorBody) {
        brand = brandName;
        year = yearMade;
        color = colorBody;

        //If we used same name for varibles in parameter use "this" keyword to refer to the instance variables
       //If parameter names are the same as the class variables, you must use this to distinguish them.

    }

    public void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }

}

