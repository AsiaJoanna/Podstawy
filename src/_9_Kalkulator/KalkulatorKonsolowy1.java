package _9_Kalkulator;

import java.util.Scanner;

public class KalkulatorKonsolowy1 {
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

                double wynik;
                switch(operacja) {
                    case "+":
                        wynik = arg1 + arg2;
                    break;
                    case "*":
                        wynik = arg1 * arg2;
                        break;
                    case "/":
                        wynik = arg1 / arg2;
                        break;
                        default:
                            wynik = 0;
                }
                System.out.println("Wynik: " + wynik);
            }  catch(Exception e) {
              break;
                }
                }
        }


    }
