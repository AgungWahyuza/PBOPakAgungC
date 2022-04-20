package com.pbo.inheritance;

public class JamurPayungMaut extends Jamur{
    @Override
    public void namailmiah(){
        System.out.println("\tNama Ilmiah\t\t\t = Amanita phalloides");
    }
    @Override
    public void habitat(){
        System.out.println("\tHabitat\t\t\t =  Tersebar secara luas di seluruh Eropa");
    }
    @Override
    public void beracun(){
        System.out.println("\tStatus Racun\t\t\t = mengandung zat beracun amatoksin");
    }
    @Override
    public void makan(){
        System.out.println("\tStatus Konsumsi\t\t\t = tidak dapat dimakan");
    }
}
