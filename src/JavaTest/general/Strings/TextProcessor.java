package JavaTest.general.Strings;

public class TextProcessor {
    public static void main(String[] args) {

        countWords("Hello my name is John");

    }

    public static void countWords(String text) {

        String[] words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Number of words: %d", numberOfWords);
        System.out.println("Number of words: " + numberOfWords);
        for (int i = 0; i < numberOfWords; i++) {
            System.out.println("Word " + i + ": " + words[i]);
        }
    }

}
