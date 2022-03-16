package com.pemrogramanberorientasiobjek;

class untukminyak {
    private String nama;
    private double harga;

    public  untukminyak(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Nama Minyak " + nama + ", Harga: " + harga;
    }
}