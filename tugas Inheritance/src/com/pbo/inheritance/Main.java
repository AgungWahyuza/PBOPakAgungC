package com.pbo.inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int hasil = 0;
        JamurTiram jamurtiram = new JamurTiram(); //memanggil constructor
        JamurShitake jamurshitake = new JamurShitake(); //memanggil constuctor
        JamurWebcaps jamurwebcaps = new JamurWebcaps(); //memanggil consturctor
        JamurPayungMaut jamurpayungmaut = new JamurPayungMaut(); //memanggil constructor

        while (hasil < 1 || hasil > 4) {
            hasil = menuUtama();
            System.out.print("\n");

            switch (hasil) {
                case 1:
                    jamurtiram.namailmiah();
                    jamurtiram.habitat();
                    jamurtiram.beracun();
                    jamurtiram.makan();
                    break;
                case 2:
                    jamurshitake.namailmiah();
                    jamurshitake.habitat();
                    jamurshitake.beracun();
                    jamurshitake.makan();
                    break;
                case 3:
                    jamurwebcaps.namailmiah();
                    jamurwebcaps.habitat();
                    jamurwebcaps.beracun();
                    jamurwebcaps.makan();
                    break;
                case 4:
                    jamurpayungmaut.namailmiah();
                    jamurpayungmaut.habitat();
                    jamurpayungmaut.beracun();
                    jamurpayungmaut.makan();
                    break;
                default:
            }
        }
    }

    private static int menuUtama() {
        int inputMenu;
        System.out.println("\t______________________________________________________________");
        System.out.println("\t|                                                            |");
        System.out.println("\t|                      JENIS JENIS JAMUR                     |");
        System.out.println("\t|                                                            |");
        System.out.println("\t|============================================================|");
        System.out.println("\t| NAMA : I GUSTI PUTU AGUNG WAHYU SENTANA PUTRA              |");
        System.out.println("\t| NIM  : 2105551081                                          |");
        System.out.println("\t|____________________________________________________________|");

        System.out.println("\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\t+                                                            +");
        System.out.println("\t+                         MENU                               +");
        System.out.println("\t+------------------------------------------------------------+");
        System.out.println("\t+       [1] Jamur Tiram                                      +");
        System.out.println("\t+       [2] Jamur Shitake                                    +");
        System.out.println("\t+       [3] Jamur WebCaps                                    +");
        System.out.println("\t+       [4] Jamur Payung Maut                                +");
        System.out.println("\t+                                                            +");
        System.out.println("\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.print("\t Pilihan Anda  (1-4) :  ");

        Scanner input = new Scanner(System.in);

        inputMenu = input.nextInt();

        return inputMenu;


    }
}
