package JavaTest.designPatterns.Creational.factory.example1;

public class PhoneFactory {
    public Phone getPhone(String type){
        if(type.equals("iPhone")){
            return new Iphone();
        }else if(type.equals("samsung")){
            return new Samsung();
        }
        return null;
    }
}
