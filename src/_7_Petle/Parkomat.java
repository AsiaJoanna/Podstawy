package _7_Petle;

import java.util.Scanner;

public class Parkomat {


    public static void main(String[] args) {
final int CENA = 3;
        Scanner wejscie = new Scanner(System.in);

        System.out.println(" Ile godzin będziesz parkowac? ");
        int lgodzin = wejscie.nextInt();
        int kwota;
        kwota = lgodzin * CENA;
        System.out.println(" Kwota do zaplaty: " + kwota);

       int ileWplacono = 0;
        while (ileWplacono < kwota){

            System.out.println(" Wrzuc monete ");
            int moneta = wejscie.nextInt();
            ileWplacono += moneta;
            System.out.println(" Na razie wpłacono: " + ileWplacono);
        }

if (ileWplacono > kwota) {
    int reszta = ileWplacono - kwota;
    System.out.println(" Reszta: " + reszta);
}
        System.out.println(" Dziękujemy");

        
    }
}
