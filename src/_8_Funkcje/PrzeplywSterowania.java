package _8_Funkcje;

public class PrzeplywSterowania {
static void metoda0() {
    System.out.println(" To jest metoda 0");

}
    static void metoda1() {
        System.out.println(" metoda 1 ");
    }


    public static void main(String[] args) {

        System.out.println(" Początek programu" );
        metoda1(); // nie trzeba podawac nazwy klasy kiedy jestesmy w tej klasie
        System.out.println(" A znowu jestem w main" );
        metoda1(); // nie trzeba nazwac klasy kiedy jestesmy w tej klasie
        System.out.println(" B znowu jestem w main" );

        System.out.println();
        metoda2(" Katowice to fajne miasto");
        System.out.println();
        metoda2(" Ala ma kota");
        System.out.println();

        System.out.println(" Koniec programu");
    }

    static void metoda2(String napis) {
        System.out.println(" metoda2 otrzymala parametr " + napis);
        System.out.println( " Ten napis ma liter: " + napis.length());
        System.out.println(" A napisany wielkimi literami: " + napis.toUpperCase());
    }

    static int powtorz(String napis, int ileRazy) {
    for (int i = 0; i < ileRazy; i++){
        System.out.println(napis);
        }

        //wynikiem funkcji jest informacja ile znakow zostało w sumie wypisanych
        return napis.length() * ileRazy;
    }
}
