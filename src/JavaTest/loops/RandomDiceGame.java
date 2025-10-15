package JavaTest.loops;

import java.util.ArrayList;
import java.util.Random;

public class RandomDiceGame {
    public static void main(String[] args) {
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();
        String tooLow = "You're on space %d. Sorry, you lose!";
        String tooHigh = "You've exceeded %d spaces. Sorry, you lose!";
        String justRight = "You're on space %d. Congrats, you win!";

        ArrayList<Integer> rolls = new ArrayList<>();

        for (int i = 1; i <= maxRolls ; i++) {
            int roll = random.nextInt(6) + 1;
            rolls.add(roll);
            currentSpace += roll;

        }
        System.out.println("Dice rolls: " + rolls);
        System.out.println("Total spaces : " + currentSpace);

        if (currentSpace < lastSpace){
            System.out.println(String.format(tooLow, currentSpace));
        }else if (currentSpace == lastSpace){
            System.out.println(String.format(justRight, currentSpace));
        }else {
            System.out.println(String.format(tooHigh ,currentSpace));
        }
    }
}



