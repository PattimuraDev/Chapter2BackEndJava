package com.pattimuradev.chapter2;

import com.pattimuradev.chapter2.model.Manusia;
import com.pattimuradev.chapter2.model.Mobil;

public class Main {
    public static void main(String[] args) {
        Manusia orangSatu = new Manusia();
        orangSatu.setTubuh("banteng");
        orangSatu.setPikiran("buaya");

        System.out.println(orangSatu.getTubuh());
        System.out.println(orangSatu.getPikiran());

        Manusia.getNama();

        Mobil teslaY = new Mobil();
        teslaY.setMerk("Merk 1");
        teslaY.setModel("Model 1");
        teslaY.setWarna("Warna 1");

    }
}
