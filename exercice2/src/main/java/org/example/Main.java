package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while(true) {
        try {
            System.out.print("Yo! Choisis ton numéro frangin: ");

            int choix = scanner.nextInt();
            for (int i = 0; i <= 10; i++) {
                int result = choix * i;
                System.out.println(i + " * " + choix + " = " + result);
            }
        } catch (Exception e) {
            System.out.println("t'es serieux là?");
            scanner.nextLine();
        }
    }
    }
}