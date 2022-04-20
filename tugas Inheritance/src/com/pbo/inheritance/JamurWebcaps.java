package com.pbo.inheritance;

public class JamurWebcaps extends Jamur{
    @Override
    public void namailmiah(){
        System.out.println("\tNama Ilmiah\t\t\t = Cortinarius rubellus");
    }
    @Override
    public void habitat(){
        System.out.println("\tHabitat\t\t\t = Terdapat di wilayah beriklim tingi seperti Amerika Utara");
    }
    @Override
    public void  beracun(){
        System.out.println("\tStatus Racun\t\t\t = mengandung zat beracun  orellanin");
    }
    @Override
    public void makan(){
        System.out.println("\tStatus Konsumsi\t\t\t = tidak dapat dimakan");
    }
}
