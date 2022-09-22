package com.pattimuradev.chapter2.oop;

public class MainInheritanceAbstarction {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan() {
            @Override
            public int kapasitasPenumpang() {
                return 3;
            }

            @Override
            public int jumlahRoda() {
                return 3;
            }

            @Override
            public String platNomor() {
                return "J 89899 KL";
            }

            @Override
            public String warna() {
                return "Merah";
            }

            @Override
            public String merk() {
                return "Bajai kota";
            }
        };
        Truk truk = new Truk() {
            @Override
            public double berat() {
                return 50000;
            }
        };
        Tronton tronton = new Tronton();
    }
}
