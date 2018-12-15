package _2_typy;

import java.time.LocalDate;

public class Szkolenie {

    double cena;
    int liczbaUczestnikow;
    String nazwa;
    LocalDate data;
    
    // 1. tworzenie nowego obiektu
//budowa konstruktora: [public/ private] [nazwa] [(lista parametrow)]
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

    //tworzenie metody
    // [public/private] [typ zwracany][nazwa] [(lista parametrow)]
    // int suma (int a, int b) {
  //  }

    public void wyswietl (){

        System.out.println("Nazwa: " + this.nazwa);
        System.out.print("Cena: ");
        System.out.printf("%.2f zl \n", this.cena);
        System.out.println("Liczba uczestnikow: " + this.liczbaUczestnikow);
        System.out.println("Data: " + this.data);

    }
}
