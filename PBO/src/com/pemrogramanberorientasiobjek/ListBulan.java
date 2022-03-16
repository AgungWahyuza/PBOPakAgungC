package com.pemrogramanberorientasiobjek;

import java.util.*;

public class ListBulan {

    public static void main(String[] args){
        int nomor = 1;

        List<String> bulans = new ArrayList<>();
        bulans.add("Januari");
        bulans.add("Februari");
        bulans.add("Maret");
        bulans.add("April");
        bulans.add("Mei");
        bulans.add("Juni");
        bulans.add("Juli");
        bulans.add("Agustus");
        bulans.add("September");
        bulans.add("Oktober");
        bulans.add("November");
        bulans.add("Desember");

        System.out.println("List Bulan : ");
        for (int i = 1; i < bulans.size(); i++){
            nomor = i + 1;
            System.out.println("\t"  +  i + "." + bulans.get(i));
        }

        Set<String> Setbulans = new HashSet<>();
        Setbulans.add("Januari");
        Setbulans.add("Februari");
        Setbulans.add("Maret");
        Setbulans.add("April");
        Setbulans.add("Mei");
        Setbulans.add("Mei");
        Setbulans.add("Mei");
        Setbulans.add("Juni");
        Setbulans.add("Juni");
        Setbulans.add("Juli");

        System.out.println("Jenis Bulan" + "(" + Setbulans.size() + "Jenis )");
        for (Iterator iterator = Setbulans.iterator(); iterator.hasNext();){
            System.out.println("\t" + iterator.next());
        }
    }
}
