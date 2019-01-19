package _6_dziwne_zachowania;

import java.util.Locale;
import java.util.Scanner;

public class PomnozDwieLiczby_Int {

    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US);

        System.out.println(" Podaj dwie liczby ");
        int arg1 = wejscie.nextInt();
        int arg2 = wejscie.nextInt();

        int wynik = arg1 * arg2;
        System.out.println("Wynik zwyklego mnozenia " + wynik);
        System.out.println("Max int wynsi " + Integer.MAX_VALUE);

        try {
            int wynik2 = Math.multiplyExact(arg1, arg2);
            System.out.println("Wynik mnozenia bezpiecznego: " + wynik2);
        } catch (ArithmeticException e) {
            e.printStackTrace();

            System.out.println("Wynik nie miesci sie w zakresie");
        }
    }

}
