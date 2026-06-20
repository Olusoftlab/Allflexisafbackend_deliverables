package primitivetypes;

@SuppressWarnings("java:S106")

public class App {
    public static void main(String[] args) {

        // program to reverse a word

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

        // program to convert from one primitive type to another

        double $dub = 908.7866;

        String $1 = Double.toString($dub);

        System.out.println($1);
        System.out.println($1.charAt(6));

        long l_num = 66874874747947394L;

        String longString = Long.toString(l_num);

        System.out.println(longString);

        float a = 8.967f;

        String myFloat = Float.toString(a);

        System.out.println(myFloat);

        String myNum = "8876";

        int getNum = Integer.valueOf(myNum);

        System.out.println(getNum);

    }
}
