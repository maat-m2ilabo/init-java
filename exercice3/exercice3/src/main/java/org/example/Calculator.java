package org.example;

public class Calculator {
    public static int add(int first, int second){
        int result = first + second;
        return result;
    }

    public static int multiply(int first, int second){
        int result = first * second;
        return result;
    }

    public static int substract(int first, int second){
        int result = first - second;
        return result;
    }

    public static double divide(int first, int second){
        if (second == 0){
            throw new ArithmeticException("Do you really want me to do that?");
        }
        double result = ((double) first) / second;
        return result;
    }
}