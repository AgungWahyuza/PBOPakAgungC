package com.pbo.inheritance;

public class JamurShitake extends Jamur {
    @Override
    public void namailmiah(){
        System.out.println("\tNama ilmiah\t\t\t = Lentinula edodes");
    }
    @Override
    public void  habitat(){
        System.out.println("\tHabitat\t\t\t = di permukaan batang kayu yang melapuk");
    }
    public void beracun(){
        System.out.println("\tStatus Racun = mengandung zat beracun yang disebut lentunan ");
    }
    public void makan(){
        System.out.println("\tStatus Konsumsi = jamur yang dapat dimakan ");
    }
}
