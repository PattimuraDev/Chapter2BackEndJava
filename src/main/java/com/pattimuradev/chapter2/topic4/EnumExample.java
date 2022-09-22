package com.pattimuradev.chapter2.topic4;

public enum EnumExample {
    JAM_SEHARI(24),
    HARI_SEMINGGU(7),
    HARI_SEBULAN(30);

    private int value;
    EnumExample(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

}
