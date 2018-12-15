package _2_typy;

import java.time.LocalDate;

public class Szkolenie {

    double cena;
    int liczbaUczestnikow;
    String nazwa;
    LocalDate data;
    // 1. tworzenie nowego obiektu

    // konstruktor bezparametryczny
    public Szkolenie() {
        System.out.println(" Wykonal sie konstruktor parametryczny");

    }

    // konstruktor parametryczny


    public Szkolenie (String nazwa, int liczbaUczestnikow, double cena, LocalDate data){
        System.out.println(" Wykonal sie konstruktor parametryczny");

        this.nazwa = nazwa;
        this.liczbaUczestnikow = liczbaUczestnikow;
        this.cena = cena;
        this.data = data;



    }
    // 2. wypisanie informaji o obiekcie
}
