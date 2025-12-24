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

    }
}
