package kalkulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dzialanie dzialanie;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe:");
        double d1 = scan.nextDouble();
        System.out.println("podaj znak operacji");
        String znak = scan.next();
        System.out.println("podaj druga liczbe");
        double d2 = scan.nextDouble();
        double wynik = 0;
        if (znak.equals("+")) {
            dzialanie = new Suma();
            wynik = dzialanie.licz(d1, d2);
        } else if (znak.equals("-")) {
            dzialanie = new Roznica();
            wynik = dzialanie.licz(d1, d2);
        } else if (znak.equals("*")) {
            dzialanie = new Iloraz();
            wynik = dzialanie.licz(d1, d2);
        } else if (znak.equals("+")) {
            dzialanie = new Iloczyn();
            wynik = dzialanie.licz(d1, d2);
        }
        System.out.println("Wynik Twojej operacji to: " + wynik);

    }
}
