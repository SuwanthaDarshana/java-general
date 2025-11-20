package JavaTest.general.Collectionframework.list;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("c++");
        list.add("javascript");
        list.add("c");
        list.add("c#");
        System.out.println(list);
        System.out.println("-----------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-----------------");

        list.remove("c");
        System.out.println(list);

        System.out.println("-----------------");

        for (String temp : list) {
            System.out.println(temp);
        }
        System.out.println("-----------------");

        System.out.println(list.get(0));


    }
}
