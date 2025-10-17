package JavaTest.oop.Polimorphism.OverLoading;


class Maths{

    // Same method name, different parameters

    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }

}


public class Main {
    public static void main(String[] args) {

        Maths maths = new Maths();
        System.out.println(maths.add(10, 20));
        System.out.println(maths.add(10.5, 20.5));

    }
}
