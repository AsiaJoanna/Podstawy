package _8_Funkcje;

import java.util.Locale;
import java.util.Scanner;

public class ProgramUzywajacyFunkcji {


    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US);

        System.out.println(" Podaj liczbe: ");
        double x = wejscie.nextDouble();

        double poleKwadratu = FunkcjeGeometryczne.poleKwadratu(x);
        System.out.println( " Pole kwadratu: " + poleKwadratu);

        double poleKola = FunkcjeGeometryczne.poleKola(x);
        System.out.println(" Pole kola: " + poleKola);

        System.out.println(" A teraz wylosuje sobie liczbe");
        double losowa = Math.random() * 100; // wartosc od 0 do 100
        System.out.println(" losowa: " + losowa);

        // double poleKwadratu2 = losowa * losowa;
        System.out.println(" Pole kwadratu losowej: " + FunkcjeGeometryczne.poleKwadratu(losowa));

       // double poleKola2 = Math.PI * losowa * losowa;
        System.out.println(" Pole kola losowa: " + FunkcjeGeometryczne.poleKola(losowa));
    }
}
