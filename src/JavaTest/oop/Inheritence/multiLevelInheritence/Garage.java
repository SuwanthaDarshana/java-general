package JavaTest.oop.Inheritence.multiLevelInheritence;

public class Garage {
    public static void main(String[] args) {
        Lancer lancer = new Lancer();
        lancer.setColor("Red");

        System.out.println(
                String.format("My Lancer Color is %s and it has %d doors" , lancer.getColor(),lancer.getDoors())
        );
    }
}
