package JavaTest.designPatterns.Structural.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PepperoniDecorator(new CheeseDecorator(new PlainPizza()));
        System.out.println(pizza.getDescription() + " - Rs. " + pizza.getCost());


        Pizza pizza2 = new PepperoniDecorator(new PlainPizza());
        System.out.println(pizza2.getDescription() + " - Rs. " + pizza2.getCost());

        Pizza pizza3 = new CheeseDecorator(new PlainPizza());
        System.out.println(pizza3.getDescription() + " - Rs. " + pizza3.getCost());

        Pizza pizza4 = new PlainPizza();
        System.out.println(pizza4.getDescription() + " - Rs. " + pizza4.getCost());


//        Plain Pizza, Chesse, Pepperoni - Rs. 325.0
//        Plain Pizza, Pepperoni - Rs. 275.0
//        Plain Pizza, Chesse - Rs. 250.0
//        Plain Pizza - Rs. 200.0

    }
}
