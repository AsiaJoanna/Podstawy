package _9_Kalkulator;

import java.util.Scanner;

public class KalkulatorKonsolowy {
    public static void main(String[] args) {
        System.out.println(" Podawaj kolejne działania w formie");
        System.out.println(" 12 + 15");
        System.out.println(" Zakoncz wpisujac napis nie bedacy liczba");
        System.out.println();

        Scanner wejscie = new Scanner(System.in);

        while (true) {
            System.out.print("> ");
            try {
                double arg1 = wejscie.nextDouble();
                String operacja = wejscie.next();
                double arg2 = wejscie.nextDouble();
                //   double suma, iloczyn;

                if ( "+".equals(operacja)) {
                    double wynik = arg1 + arg2;
                    System.out.println(" Wynik: " + wynik);
                }
                if ("*".equals(operacja)) {
                    double wynik = arg1 * arg2;
                    System.out.println(" Wynik: " + wynik);
                }

                if ("/".equals(operacja)){
                double wynik = arg1 / arg2;
                System.out.println("Wynik: " + wynik);
}
            }  catch(Exception e) {
              break;
                }
                }
        }


    }
