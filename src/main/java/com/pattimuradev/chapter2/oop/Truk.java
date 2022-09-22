package com.pattimuradev.chapter2.oop;

public abstract class Truk extends Kendaraan implements Mobil, GayaHidup{

    public Truk(){
        System.out.println("Truk nyala: " + isNyala);
        System.out.println("Jumlah roda: " + jumlahRoda());
    }

    public abstract double berat();

    @Override
    public int kapasitasPenumpang() {
        return 3;
    }

    @Override
    public int jumlahRoda() {
        return 6;
    }

    @Override
    public String platNomor() {
        return "B 12345 HK";
    }

    @Override
    public String warna() {
        return "Kuning";
    }

    @Override
    public String merk() {
        return "Hino";
    }

    @Override
    public void startMesin() {
        System.out.println("Mesih truk di starter");
    }

    @Override
    public String supir() {
        return "Patra";
    }
}
