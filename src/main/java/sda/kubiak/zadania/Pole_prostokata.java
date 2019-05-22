package sda.kubiak.zadania;

import java.util.Scanner;

public class Pole_prostokata {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe A: ");
        double a = scanner.nextInt();
        System.out.println("Podaj liczbe B: ");
        double b = scanner.nextInt();

        System.out.println("Pole prostokata to: " +a*b);
    }
}
