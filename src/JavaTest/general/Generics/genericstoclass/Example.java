package JavaTest.general.Generics.genericstoclass;

//Generic Class Example

class OlBox<T>{
    private T item;
    public void setItem(T item){
        this.item = item;
    }
    public T getItem(){
        return this.item;
    }
}

public class Example {
    public static void main(String[] args) {
        OlBox<String> stringOlBox = new OlBox();
        stringOlBox.setItem("Java");

        OlBox<Integer> integerOlBox = new OlBox();
        integerOlBox.setItem(150);

        String str1 = (String) stringOlBox.getItem();
        Integer str2 = (Integer) integerOlBox.getItem();

        System.out.println(str1);
        System.out.println(str2);
    }
}
