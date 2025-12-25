package JavaTest.InputOutput;

import java.io.File;

public class Example {
    public static void main(String[] args) {
        File f1 = new File("com.txt");
        System.out.println("is exist:"+f1.exists());
        boolean isCreated = f1.mkdir();
        System.out.println("is created:"+isCreated);
        System.out.println("is exist:"+f1.exists());


//        System.out.println("is a file:" + f1.isFile());
//        System.out.println("is a directory:" + f1.isDirectory());
//
//        System.out.println("is hidden:"+f1.isHidden());
//        System.out.println("length:"+f1.length());

    }
}
