package JavaTest.general.AnnonymousInnerClass.classwithinterface;

interface Animal{
    void makeNoise();
}

public class Example {
    public static void main(String[] args) {

        Animal dog = new Animal() {
            @Override
            public void makeNoise() {
                System.out.println("Dog bark");
            }
        };

        dog.makeNoise();


    }
}
