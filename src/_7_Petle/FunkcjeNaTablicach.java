package _7_Petle;

public class FunkcjeNaTablicach {

    static int suma(int[] tablica) {
        int wynik = 0;
        //petla, ktora do wyniku doda wszystkie el tablicy
        for (int liczba : tablica) {
            wynik = wynik + liczba; //mozna tez wynik += liczba;
        }
        return wynik;
    }

    /*
        static void suma_inaczej(int[] tablica) {
            int wynik = 0;

            for (int i = 0; i < tablica.length; i++) {
                wynik += tablica[i];
            }
        }
    */
    static int suma_parzystych(int[] tablica) {
        int sumaParz = 0;

        for (int i = 0; i < tablica.length; i++) {
            if (i % 2 == 0) {
                sumaParz += tablica[i];

            }

        }
return sumaParz;
    }


static int max (int[] tablica) {
        int wynik = tablica [0]; // liczba najwieksza
                for (int i = 1; i < tablica.length; i++) { // for (int x: tablica)
            if ( wynik < tablica[i]) {                      //
                wynik = tablica [i];
            }
            }

        return wynik;

}
    // dla wygody maina testujacego umieszczam w tym samm pliku

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 5, 10, 15};
        int[] b = {-20, 0, 5, 20};
        int[] c = {-10, -20, -5, -10};
        int[] e = {};

        System.out.println(" suma a: " + suma(a)); //90
        System.out.println(" suma b: " + suma(b)); //5
        System.out.println(" suma c: " + suma(c));
        System.out.println(" suma e: " + suma(e));
        System.out.println();

        System.out.println(" suma parzystych dla a: " + suma_parzystych(a));
        System.out.println(" suma parzystych dla b: " + suma_parzystych(b));
        System.out.println(" suma parzystych dla c: " + suma_parzystych(c));
        System.out.println(" suma parzystych dla e: " + suma_parzystych(e));
        System.out.println();

        System.out.println(" Najwieksza dla a: " + max(a));
        System.out.println(" Najwieksza dla b: " + max(b));
        System.out.println(" Najwieksza dla c: " + max(c));
        System.out.println(" Najwieksza dla e: " + max(e));
    }
}
