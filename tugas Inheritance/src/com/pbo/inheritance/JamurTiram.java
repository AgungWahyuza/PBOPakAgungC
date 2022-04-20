package com.pbo.inheritance;

public class JamurTiram extends Jamur {
    @Override
    public void namailmiah(){
        System.out.println("\tNama Ilmiah\t\t\t\t = Pleurotus ostreatus");
    }
    @Override
    public void habitat(){
        System.out.println("\tHabitat\t\t\t = dibawah pohon berdaun lebar");
    }
    @Override
    public void beracun(){
        System.out.println("\tStatus Racun\t\t\t = tidak mengandung racun");
    }
    @Override
    public void makan(){
        System.out.println("\tStatus konsumsi\t\t\t = boleh dimakan");
    }
}
