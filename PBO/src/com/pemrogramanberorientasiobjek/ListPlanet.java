package com.pemrogramanberorientasiobjek;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListPlanet {

    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("mercury"); // method add() untuk menambahkan objek ke List
        planets.add("venus");
        planets.add("earth");
        planets.add("mars"); // objek lainnya masih bisa terus ditambahkan ke List
        System.out.println("List planets awal:");
        for (
                int i = 0; i < planets.size(); i++) { // method size() untuk mendapatkan ukuran List
            // method get() untuk melihat isi List pada index i
            System.out.println("\t index-" + i + " = " + planets.get(i));

        }
    }
}
