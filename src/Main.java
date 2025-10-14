import java.util.Arrays;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] weekdays = new String[7];
        System.out.println(Arrays.toString(weekdays));

        weekdays[0] = "Monday";
        weekdays[1] = "Tuesday";
        weekdays[2] = "Wednesday";
        weekdays[3] = "Thursday";
        weekdays[4] = "Friday";
        weekdays[5] = "Saturday";
        weekdays[6] = "Sunday";

        System.out.println(Arrays.toString(weekdays));

        weekdays = new String[] {"Mon", "Tue", "Wed", "Thurs", "Fri", "Sat", "Sun"};
        System.out.println(Arrays.toString(weekdays));

        for (int i = 0; i < weekdays.length; i++) {
            System.out.println(weekdays[i]);
        }

        System.out.println();

        for(String day : weekdays){
            System.out.println(day);
        }



    }
}