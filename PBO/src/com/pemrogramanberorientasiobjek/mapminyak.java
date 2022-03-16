package com.pemrogramanberorientasiobjek;

import java.util.HashMap;
import java.util.Map;

public class mapminyak {

    public static void main(String[] args) {

        Map<String, untukminyak> hargaminyak = new HashMap();
        hargaminyak.put("key-1", new untukminyak("Minyak Bimoli", 30000));
        hargaminyak.put("key-2", new untukminyak("Minyak Kelapa", 20000));
        hargaminyak.put("key-3", new untukminyak("Minyak Telon", 50000));
        hargaminyak.put("key-4", new untukminyak("Minyak Kayu Putih", 60000));
        hargaminyak.put("key-4", new untukminyak("Minyak Cap Badak", 20000));

        // method size() untuk mendapatkan ukuran Set
        System.out.println("List Harga Minyak : " + hargaminyak.size() + ")");
        for (String key : hargaminyak.keySet()) {
            System.out.println("\t " + key + " : " + hargaminyak.get(key));

        }
    }
}