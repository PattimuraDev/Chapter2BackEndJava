package com.pattimuradev.chapter2.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Data langsung setter dan getter
public class ContohLombok {
    private String nama;
    private String alamat;
    private int umur;
    private String noTelp;
}
