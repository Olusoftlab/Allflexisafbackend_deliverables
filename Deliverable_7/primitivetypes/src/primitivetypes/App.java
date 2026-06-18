package primitivetypes;

@SuppressWarnings("java:S106")

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("practicing primitives");

        String myWord = "Hello World";

        int len = myWord.length();

        char[] myWordArr = new char[len];
        char[] reverseArr = new char[len];

        for (int i = 0; i < len; i++) {

            myWordArr[i] = myWord.charAt(i);

        }

        for (int x = 0; x < len; x++) {

            reverseArr[x] = myWordArr[len - 1 - x];

        }

        String reverseWord = new String(reverseArr);

        System.out.println(reverseWord);

    }
}
