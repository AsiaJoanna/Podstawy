package _2_typy;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;

public class ObslugaSzkolen {
    public static void main(String[] args) {
        Szkolenie szkolenieJava = new Szkolenie("Skolenie Java", 10, 1000, LocalDate.of(2018, Month.DECEMBER, 15));


        System.out.println("Nazwa: " + szkolenieJava.nazwa);
        System.out.print("Cena: ");
        System.out.printf("%.2f zl \n", szkolenieJava.cena);

        System.out.println("Liczba uczestnikow: " + szkolenieJava.liczbaUczestnikow);
        System.out.println("Data: " + szkolenieJava.data);


        Szkolenie szkoleniePython = new Szkolenie("Szkolenie Python", 15, 1500, LocalDate.of(2019, Month.JANUARY, 21));
        System.out.println("Nazwa: " + szkoleniePython.nazwa);
        System.out.print("Cena: ");
        System.out.printf("%.2f zl \n", szkoleniePython.cena);

        System.out.println("Liczba uczestnikow: " + szkoleniePython.liczbaUczestnikow);
        System.out.println("Data: " + szkoleniePython.data);


        /*
        Szkolenie szkoleniePython = new Szkolenie();
        szkoleniePython.nazwa = "Szkolenie Python";
        szkoleniePython.cena = 1500;
        szkoleniePython.liczbaUczestnikow = 5;
        szkoleniePython.data = LocalDate.of(2019, Month.JANUARY, 22);
        */

    }



}
