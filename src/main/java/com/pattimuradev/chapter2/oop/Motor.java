package com.pattimuradev.chapter2.oop;

// bisa diinstance, dapat memiliki field, method bisa abstract bisa juga non abstract
public abstract class Motor {
    public abstract void starterMesin();
    public abstract void setirMotor();
    public abstract void rem();

    public void kelengkapan(){
        System.out.println("STNK ada");
        System.out.println("SIM ada");
        System.out.println("Razia tidak ada");
    }
}
