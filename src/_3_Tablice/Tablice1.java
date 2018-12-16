package _3_Tablice;

public class Tablice1 {

    public static void main(String[] args) {
        int[] tablica = new int[8];

        System.out.println("Dlugosc tablicy: " + tablica.length);

        System.out.println("Element 3. tablicy: " + tablica[2]);
// pojawia sie wyjatek
        // System.out.println("Element nieistniejący" + tablica[8]);

        tablica[6] = 165;

        System.out.println("Element 7: " + tablica[6]);

        int[] tablicaWypelniona = {178, 185, 189, 177, 165};

        // i++ | i=i+1 | i+=1 (postinkrementacja)
        // ++i (postinkrementacja)
        // i --
        // -- i
       // start             stop                    krok
      //  for (int i = 0; i < tablicaWypelniona.length; i++) {

         //   System.out.println(tablicaWypelniona[i]);
      //  }
        for (int j = tablicaWypelniona.length; j > 0; j--){
            System.out.println(tablicaWypelniona[j-1]);
        }
       // for (int i =0; i < tablicaWypelniona.length; i = i+2)



    }
}
