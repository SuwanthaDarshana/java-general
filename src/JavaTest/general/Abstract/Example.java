package JavaTest.general.Abstract;

abstract class SamanPhone{
    void call(){    //concrete method
        System.out.println("calling");
    }

    abstract void message(); //abstract method
}

class NimalPhone extends  SamanPhone{

    @Override
    void message() {
        System.out.println("sending message");
    }
}


public class Example {
    public static void main(String[] args) {
        NimalPhone nimalPhone = new NimalPhone();
        nimalPhone.call();
        nimalPhone.message();

    }
}
