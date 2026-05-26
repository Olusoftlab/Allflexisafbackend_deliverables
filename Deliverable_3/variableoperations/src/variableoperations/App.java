package variableoperations;

import java.util.Scanner;

@SuppressWarnings("java:S106")
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int x = 7;

        int y = 9;

        int z = x + y;

        System.out.println("Sum of x and y is " + z);

        // calculator program in java

        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;

        try {

            System.out.print("Enter first number: ");

            double firstNum = scanner.nextDouble();

            System.out.println("Enter operator: (+,-,/,*) are valid: ");

            String operatorSign = scanner.next();

            System.out.println("Enter second number: ");

            double secondNum = scanner.nextDouble();

            if (operatorSign.equals("+")) {

                sum = firstNum + secondNum;

            } else if (operatorSign.equals("-")) {

                sum = firstNum - secondNum;
                sum = Math.abs(sum);

            } else if (operatorSign.equals("/")) {

                sum = firstNum / secondNum;

            } else if (operatorSign.equals("*")) {

                sum = firstNum * secondNum;
            } else {

                System.out.println("Invlid operator sign, filed to compute");

            }

            System.out.println(sum);

        } catch (ArithmeticException e) {

            System.out.println("operation failed");

        } finally {

            System.out.println("program ended");
            scanner.close();  
        }

    }
}