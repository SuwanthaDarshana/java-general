package JavaTest.devstack.polymorphism.overloading;


class Cal{
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(double a, double b){
        System.out.println(a+b);
    }
}


public class Main {
    public static void main(String[] args) {
        Cal cal = new Cal();
        cal.add(1,2);
        cal.add(2.4,3.5);
    }
}
