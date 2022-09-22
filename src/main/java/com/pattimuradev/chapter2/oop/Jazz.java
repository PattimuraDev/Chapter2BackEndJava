package com.pattimuradev.chapter2.oop;

public class Jazz implements Mobil{
    @Override
    public void startMesin() {
        System.out.println(MERK_MOBIL + " mesinnya nyala");
    }

    @Override
    public String supir() {
        return "Bayu";
    }
}
