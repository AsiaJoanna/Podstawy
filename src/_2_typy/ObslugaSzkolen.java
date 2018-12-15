package _2_typy;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;

public class ObslugaSzkolen {
    public static void main(String[] args) {
        Szkolenie szkolenieJava = new Szkolenie(
                "Skolenie Java", 10, 1000,
                LocalDate.of(2018, Month.DECEMBER, 15));


       szkolenieJava.wyswietl();


        Szkolenie szkoleniePython = new Szkolenie(
                "Szkolenie Python", 15, 1500,
                LocalDate.of(2019, Month.JANUARY, 21));

        szkoleniePython.wyswietl();



        /*
        Szkolenie szkoleniePython = new Szkolenie();
        szkoleniePython.nazwa = "Szkolenie Python";
        szkoleniePython.cena = 1500;
        szkoleniePython.liczbaUczestnikow = 5;
        szkoleniePython.data = LocalDate.of(2019, Month.JANUARY, 22);
        */

    }



}
