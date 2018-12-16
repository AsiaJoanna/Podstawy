package _2_typy;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AnalizaWieku {

    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);

        System.out.print(" Podaj date urodzenia yyyy-MM-dd: ");
        String dataur = wejscie.nextLine();

        System.out.println("Podaj plec K- kobieta, M- mezczyzna");
        String plec = wejscie.nextLine();

        LocalDate dataUrodzenia;
        LocalDate aktualnyCzas;

// konwersja daty String na LocatData
        // pobranie daty teraz
        // obliczanie roznicy dat
        // sprawdzenie wieku i wyswietlenie wyniku

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate data = LocalDate.parse(dataur, formatter);

        aktualnyCzas = LocalDate.now();
        Period roznica = Period.between(data, aktualnyCzas);
        System.out.println(" Aktualny czas: " + aktualnyCzas);
        //  System.out.println(" Wiek: " + roznica);

        System.out.println(roznica.getYears());
        System.out.println(roznica.getMonths());
        System.out.println(roznica.getDays());
        // System.out.println("Podaj plec K- kobieta, M- mezczyzna");
        //  System.out.println(roznica.getYears());

        if (plec.equalsIgnoreCase("K")) {
            if (roznica.getYears() >= 18 && roznica.getYears() < 65) {
                System.out.println("Wiek produkcyjny");
            }
        }
        if (plec.equalsIgnoreCase("M")) {
            if (roznica.getYears() >= 18 && roznica.getYears() < 67) {
                System.out.println("Wiek produkcyjny");
            }
        }
        if (roznica.getYears() < 18) {
            System.out.println("Niepelnoletni");

        }

        if (plec.equalsIgnoreCase("K")) {
            if (roznica.getYears() >= 65) {
                System.out.println("Wiek emerytalny");

            }
        }
        if (plec.equalsIgnoreCase("M")) {
            if (roznica.getYears() >= 67) {
                System.out.println("Wiek emerytalny");
            }
        }

    }


}

