package com.beispiel.automobil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie den Kraftstoffverbrauch Ihres Fahrzeugs (Liter/100km) ein: ");
        double kraftstoffverbrauch = scanner.nextDouble();

        System.out.print("Bitte geben Sie die Kraftstoffmenge in Ihrem Tank (Liter) ein: ");
        double tankinhalt = scanner.nextDouble();

        double reichweite = berechneReichweite(kraftstoffverbrauch, tankinhalt);

        System.out.printf("Die verbleibende Reichweite Ihres Fahrzeugs beträgt: %.2f km%n", reichweite);

        scanner.close();
    }

    public static double berechneReichweite(double kraftstoffverbrauch, double tankinhalt) {
        return (tankinhalt / kraftstoffverbrauch) * 100;
    }
}
