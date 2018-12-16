package _2_typy;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Szkolenie {

   // double cena;
    BigDecimal cena;
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


    public Szkolenie (String nazwa, int liczbaUczestnikow, BigDecimal cena, LocalDate data){
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

    public BigDecimal ObliczPrzychodBrutto () {
     //   double przychod = this.liczbaUczestnikow * this.cena;
     //    return przychod;
            //BigDecimal liczbaUczestnikow = (BigDecimal.valueOf(liczbaUczestnikow));
        return cena.multiply(BigDecimal.valueOf(liczbaUczestnikow));


      // return  this.liczbaUczestnikow * this.cena
    }
        public BigDecimal ObliczPrzychodNetto () {

        BigDecimal PB = BigDecimal.valueOf(liczbaUczestnikow).multiply(cena);
        BigDecimal VAT = BigDecimal.ONE.subtract( StaleAplikacji. STAWKA_VAT);


        return PB.multiply (VAT);


        }



}
