package com.pattimuradev.chapter2.model;

public class Mobil {

    private String merk;
    private String model;
    private String warna;
    public Mobil(){

    }
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void startMesin(){
        System.out.println("mobil di starter");
    }
    public void startMesin(String lokasiStart){
        System.out.println("mobil di starter di " + lokasiStart);
    }
    public void startMesin(String lokasiStart, String lokasiTujuan){
        System.out.println("mobil di starter di " + lokasiStart + " menuju ke " + lokasiTujuan);
    }
}
