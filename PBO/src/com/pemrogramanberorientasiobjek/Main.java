package com.pemrogramanberorientasiobjek;

class minyak {
    private String minyak;
    private double harga;

    public void Map(String minyak, double Harga) {
        this.minyak = minyak;
        this.harga = Harga;
    }

    @Override
    public String toString() {
        return "Nama Minyak " + minyak + ", Harga: " + harga;
    }
}