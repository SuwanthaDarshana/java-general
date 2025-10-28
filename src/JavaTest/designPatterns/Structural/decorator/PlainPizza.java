package JavaTest.designPatterns.Structural.decorator;

public class PlainPizza implements  Pizza {


    @Override
    public double getCost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }
}
