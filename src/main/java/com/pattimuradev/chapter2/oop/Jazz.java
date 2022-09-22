package com.pattimuradev.chapter2.oop;

// kalau class diberi final, maka tidak bisa di turunkan lagi
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
