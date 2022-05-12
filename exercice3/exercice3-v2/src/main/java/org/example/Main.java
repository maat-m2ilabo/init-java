package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String operator = null;
        boolean i = true;
        while (i == true) {
            boolean y = true;
            System.out.println("What do you want to do?");
            System.out.println("+ addition" + System.lineSeparator() + "* multiply" + System.lineSeparator() +
                    "- substract" + System.lineSeparator() + "/ divide");
            Scanner scanner = new Scanner(System.in);
            String choice = null;
            Integer first = null;
            Integer second = null;

            boolean z = true;
            while (z == true) {
                try {
                    first = scanner.nextInt();
                    z = false;
                } catch (InputMismatchException e) {
                    System.out.println("I couldn't understand your first number, please type your operation again");
                    scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("Something happened I couldn't foresee, no matter how hard I tried. Well played.");
                }

            }

            while (y == true) {
                operator = scanner.next();
                if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")/* || choice.equals("s")*/) {
                    y = false;
                } else {
                    System.out.println("your operator was not as expected. Try again and write the operator and second number part again.");
                    scanner.nextLine();
                }
            }

            z = true;
            while (z == true) {
                try {
                    second = scanner.nextInt();
                    z = false;
                } catch (InputMismatchException e) {
                    System.out.println("I couldn't understand your second number, please type it again");
                    scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("Something happened I couldn't foresee, no matter how hard I tried. Well played.");
                }

            }


            System.out.println(Calculator.calculate(first, operator, second));

            System.out.println("Run again? (Y)es, (N)o");

            for (boolean x = true; x == true; ) {
                choice = scanner.next();
                if (choice.equals("N")) {
                    System.out.println("bye!");
                    System.exit(0);
                } else if (choice.equals("Y")) {
                    x = false;
                } else {
                    System.out.println("Something went wrong. Please type either Y or N");
                    scanner.nextLine();
                }
            }
        }
    }
}