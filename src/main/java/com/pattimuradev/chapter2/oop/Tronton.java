package com.pattimuradev.chapter2.oop;

public class Tronton extends Truk{

    //public boolean isNyala = false;

    public Tronton(){
        isNyala = false; // mengubah value dari induk
        System.out.println("Tronton nyala: " + isNyala);
        System.out.println("Jumlah roda: " + jumlahRoda());
        System.out.println("Berat: " + berat());
    }

    @Override
    public double berat() {
        return 100000;
    }

    @Override
    public String warna() {
        return "Hijau";
    }
}
