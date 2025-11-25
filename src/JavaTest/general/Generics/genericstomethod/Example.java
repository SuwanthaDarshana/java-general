package JavaTest.general.Generics.genericstomethod;

class PrintUtil{
    public static <T> void printArray(T[] array){
        for(T num : array){
            System.out.print(num+ ", ");
        }
        System.out.println();
    }

}


public class Example {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C", "D", "E"};

        PrintUtil.printArray(intArray);
        PrintUtil.printArray(strArray);
    }
}
