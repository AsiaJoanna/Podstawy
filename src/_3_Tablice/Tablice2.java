package _3_Tablice;

import java.util.Random;

public class Tablice2 {


    public static void main(String[] args) {
        int [][] tablica2d = new int [4][4];
        Random generator = new Random();

        for (int i = 0; i < tablica2d.length; i++) {
            System.out.println("");
            for (int j = 0; j < tablica2d[i].length; j++) {
              //  System.out.println("\n");
            //  System.out.print(tablica2d[i][j] + " ");
                tablica2d[i][j] = generator.nextInt(101);
                System.out.print(tablica2d[i][j]);
                System.out.print(" ");



            }



        }
    }
}
