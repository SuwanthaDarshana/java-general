package JavaTest.oop.Intefaces;

public class Book implements  Product {
    private double price;
    private String name;

    public Book(double price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public String name() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
