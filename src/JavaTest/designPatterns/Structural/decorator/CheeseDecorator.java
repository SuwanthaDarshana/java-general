package JavaTest.designPatterns.Structural.decorator;

public class CheeseDecorator implements Pizza{

    private Pizza pizza;

    public CheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 50;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Chesse";
    }
}
