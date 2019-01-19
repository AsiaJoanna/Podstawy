package _7_Petle;

import java.util.Scanner;

public class Silnia {

    static long silnia(int n) {
        long iloczyn = 1;
        for (int i = 1; i <= n; i++) {
            iloczyn = iloczyn * i; // iloczyn *= i;

    }
    return iloczyn;

    }

    public static void main(String[] args) {
        Scanner wejscie= new Scanner(System.in);

        while (true) {
            System.out.println(" Podaj kolejna liczbe: ");
            int liczba = wejscie.nextInt();
            long wynik = silnia(liczba);
            System.out.println( liczba +  "! = " + wynik);
        }
    }
}
