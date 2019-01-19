package _8_Funkcje;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBezFunkcji {


    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US);

        System.out.println(" Podaj liczbe: ");
        double x = wejscie.nextDouble();

        double poleKwadratu = x * x;
        System.out.println( " Pole kwadratu: " + poleKwadratu);

        double poleKola = Math.PI * x * x;
        System.out.println(" Pole kola: " + poleKola);

        System.out.println(" A teraz wylosuje sobie liczbe");
        double losowa = Math.random() * 100; // wartosc od 0 do 100
        System.out.println(" losowa: " + losowa);

        double poleKwadratu2 = losowa * losowa;
        System.out.println(" Pole kwadratu losowej: " + poleKwadratu2);

        double poleKola2 = Math.PI * losowa * losowa;
        System.out.println(" Pole kola losowa: " + poleKola2);
    }
}
