package _2_typy;

import java.util.Scanner;

public class TypyObiektowe {

    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);

        System.out.print(" Podaj swoje imie : ");

        String imie = wejscie.nextLine();

        int iloscZnakow = imie.length();
        Boolean ostatniaLitera = imie.endsWith("a") || imie.endsWith("A") ;
        if (ostatniaLitera && !imie.equalsIgnoreCase ("Kuba")) {
            System.out.println(" Imie damskie ");
        }
        else {
            System.out.println(" Imie meskie ");
        }



        if (iloscZnakow <= 6) {
            System.out.println( "Krotkie slowo");

        }else {
            System.out.println("Dlugie slowo");
        }


        System.out.println(" Slowo " + imie + " ma " + iloscZnakow + " znakow ");




    }


}
