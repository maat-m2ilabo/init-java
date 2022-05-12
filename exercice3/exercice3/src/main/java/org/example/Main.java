package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i == 0){
            int y = 0;
            System.out.println("What do you want to do?");
            System.out.println("+ addition" + System.lineSeparator() + "* multiply" + System.lineSeparator() +
                    "- substract" + System.lineSeparator() + "/ divide" + System.lineSeparator() + "s stop" );
            Scanner scanner = new Scanner(System.in);
            String choice = null;
            while (y == 0) {
                choice = scanner.next();
                if (choice.equals("+") || choice.equals("-") || choice.equals("*") || choice.equals("/") || choice.equals("s")) {
                    y++;
                } else {
                    System.out.println("not what was expected. Try again and read.");
                }
            }
            if (choice.equals("s")){
                System.out.println("bye!");
                break;
            }

            System.out.println("Now enter both your numbers");
            int z = 0;
            Integer first = null;
            Integer second = null;
            while (z == 0) {
                try {
                    first = scanner.nextInt();
                    second = scanner.nextInt();
                }
                catch (InputMismatchException e) {
                    System.out.println("Please, enter two valid numbers, separated by space or new line");
                }
                catch (Exception e) {
                    System.out.println("Something happened I couldn't foresee, no matter how hard I tried. Well played.");
                }
                z++;
            }
            switch (choice) {
                case "+":
                    System.out.println(Calculator.add(first, second));
                    continue;
                case "*":
                    System.out.println(Calculator.multiply(first, second));
                    continue;
                case "-":
                    System.out.println(Calculator.substract(first, second));
                    continue;
                case "/":
                    System.out.println(Calculator.divide(first, second));
                    continue;
                default:
                    System.out.println("Sorry, I didn't get it. Choose between 1 and for 4 please");
            }
        }
    }
}