package _2_typy;

import java.time.LocalDate;

public class Adres {
    String ulica;
    String kod;
    String miasto;

    public Adres() {
        System.out.println(" Wykonal sie konstruktor bezparametryczny");
    }
    public Adres (String ulica, String miasto, String kod) {
        System.out.println(" Wykonal sie konstruktor parametryczny");

        this.ulica = ulica;
        this.miasto = miasto;
        this.kod = kod;
    }


    public void wyswietl (){

        System.out.println(" Ulica: " + this.ulica);
        System.out.println("Kod: " + this.kod);
        System.out.print("Miasto: " + this.miasto);


    }

}
