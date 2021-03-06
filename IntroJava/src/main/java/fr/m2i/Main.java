package fr.m2i;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nbOne;
        int nbTwo;
        int nbThree;

        try {
            System.out.print("Entrez le premier nombre : ");
            nbOne = scanner.nextInt();

            System.out.print("Entrez le deuxieme nombre : ");
            nbTwo = scanner.nextInt();
            scanner.close();

            nbThree = nbOne * nbTwo;
            String resultToFormat = "Résultat : %d * %d = %d";
            String result = String.format(resultToFormat, nbOne, nbTwo, nbThree);

            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("Attention ! Tu es sencé mettre un nombre entier");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}