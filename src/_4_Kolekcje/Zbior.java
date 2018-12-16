package _4_Kolekcje;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Zbior {


    public static void main(String[] args) {
        Set numeryPesel = new HashSet<>();

        numeryPesel.add("9802030123");
        numeryPesel.add("6509080153");
        numeryPesel.add("7809301237");
        numeryPesel.add("5604231987");
        numeryPesel.add("9802030127");

        System.out.println(numeryPesel);

    numeryPesel.remove("9802030123");
        System.out.println(numeryPesel);


    if (numeryPesel.contains("6509080153")) {
        System.out.println("tak");
    } else {
        System.out.println("nie");
    }


    Set<String> posortowany = new TreeSet<>();
    posortowany.addAll(numeryPesel);
        System.out.println(posortowany);


        Set<String> kolejnosc = new LinkedHashSet<>();
        kolejnosc.add("Wojciech");
        kolejnosc.add("Kamil");
        kolejnosc.add("Joanna");
        kolejnosc.add("Dominika");

        System.out.println(kolejnosc);
    }

}
