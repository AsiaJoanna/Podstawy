package _7_Petle;

public class FunkcjeNaTablicach {

    static  int suma(int[] tablica){
   int wynik = 0;
   //petla, ktora do wyniku doda wszystkie el tablicy
        for (int liczba : tablica ) {
            wynik = wynik + liczba; //mozna tez wynik += liczba;
        }
        return wynik;
    }

    // dla wygody maina testujacego umieszczam w tym samm pliku

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 5, 10, 15};
        int[] b = {-20, 0, 5, 20};

        System.out.println(" suma a: " + suma(a)); //90
        System.out.println(" suma b: " + suma(b)); //5




    }
}
