package JavaTest.general.SwitchCase;

import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your height: ");
        int height =scanner.nextInt();

        scanner.close();

        switch (height){
            case 12:
                System.out.println("Height is 12");
                break;
            case  10:
                System.out.println("Height is 10");
                break;
            default:
                System.out.println("Height is not 12 or 10");
        }

    }
}
