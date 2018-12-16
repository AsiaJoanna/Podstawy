package _4_Kolekcje;

import javax.sound.midi.Soundbank;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        List <String> imiona = new ArrayList <String> ();

        imiona.add("Wojciech");
        imiona.add("Dominika");
        imiona.add("Kamil");
        imiona.add("Joanna");

        System.out.println(imiona);

        System.out.println("Rozmiar: " + imiona.size());

       // System.out.println("Pozycja 1: " + imiona.get(0));
for (String imie : imiona) {
    if (imie.endsWith("a")) {
        System.out.println(imie);
      //  break;
        }
    }

    imiona.remove("Wojciech");
        System.out.println(imiona);

        if (imiona.contains("Kamil")) {
            System.out.println("tak");
        } else {
            System.out.println("nie");
        }
//imiona.sort();
        Collections.sort(imiona);
        System.out.println(imiona);
    }
}
