package JavaTest.general.stringApi;

public class Example {
    public static void main(String[] args) {
        String s1 = "Hello";                      //literal object
        String s2 = new String("World");   // object
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.equals(s2));

        System.out.println("---------------------------------");

        String s = "Java,Python,C++";                 //split()
        String[] langs = s.split(",");
        for (String lang : langs) {
            System.out.println(lang);
        }

        System.out.println("---------------------------------");

        String s3 = "java programming";
        System.out.println(s3.contains("java"));                    //contains()


        System.out.println("---------------------------------");

        String s4 = "abc";
        String s5 = new String("abc");
        String s6 = "abc";
        String s7 = new String("abc");

        System.out.println(s4 == s5);   //false
        System.out.println(s4 == s6);   //true
        System.out.println(s5 == s7);   //false

        System.out.println("---------------------------------");

        String name = "Nuwara";
        String city = "Nuwara";

        System.out.println("Name :" + name);
        System.out.println("City :" + city);

        name = name.concat( " Maya");
        System.out.println(name.concat(" Guwa"));

        System.out.println("Name :" + name);
        System.out.println("City :" + city);

        System.out.println("---------------------------------");

        String text = "0123456789";
        System.out.println(text.charAt(2)); //2
        System.out.println(text.substring(2)); //23456789
        System.out.println(text.substring(2,5)); //234


        System.out.println("----------");
        String test = " abc ";
        System.out.println(test.length());   //5
        test = test.trim();
        System.out.println(test.length());   //3

    }
}
