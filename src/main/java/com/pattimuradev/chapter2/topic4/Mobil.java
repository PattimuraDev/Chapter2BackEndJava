package com.pattimuradev.chapter2.topic4;

// interface semua methodnya abstract, tidak memiliki field, tidak bisa diinstance (kecuali final)
public interface Mobil {
    String MERK_MOBIL = "HONDA";

    void startMesin();
    String supir();
}
