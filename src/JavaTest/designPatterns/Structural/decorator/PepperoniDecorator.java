package JavaTest.designPatterns.Structural.decorator;

public class PepperoniDecorator implements Pizza {

    private Pizza pizza;

    public PepperoniDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 75;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni";
    }
}
