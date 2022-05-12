package org.example;

public class Calculator {
    public static Double calculate(int first, String operator, int second) {
        Double result = null;
        switch (operator) {
            case "+":
                result = Double.valueOf(first + second);
                break;

            case "*":
                result = Double.valueOf(first * second);
                break;

            case "-":
                result = Double.valueOf(first - second);
                break;

            case "/":
                if (second == 0) {
                    throw new ArithmeticException("Do you really want me to do that?");
                }
                result = ((double) first) / second;
                break;
        }
        return result;
    }
}