package _7_Petle;

import java.util.Scanner;

public class Skarbonka2 {
    public static void main(String[] args) {

      /*  while (WARUNEK) {

      INSTRUKCJE;....

      }
       */
/* Jas dostał pusta skarbonke i chce zebrac 100 zl
Program w petli bedzie prosil o wrzucenie pienazka do skarbonki tak dlugo az zbierze 100 zl.
(wrzucenie pieniazka = wpisanie liczby)
 */
        Scanner wejscie = new Scanner(System.in);
        int skarbonka = 0;
        while (skarbonka < 100) {
            System.out.println("Biezaca wartosc w skarbonce: " + skarbonka);
            System.out.println(" Wrzuć monete....");
            skarbonka += wejscie.nextInt();
                    }
        System.out.println(" Udało sie zebrac " + skarbonka);
    }




}
