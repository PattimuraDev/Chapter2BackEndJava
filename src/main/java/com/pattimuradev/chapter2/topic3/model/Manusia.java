package com.pattimuradev.chapter2.topic3.model;

public class Manusia {
    private String tubuh;
    private String pikiran;

    public Manusia(){}

    /**
     * get tubuh of an object manusia
     * @return rubuh
     */
    public String getTubuh(){
        return tubuh;
    }

    /**
     * get pikiran of an object manusia
     * @return pikiran
     */
    public String getPikiran(){
        return pikiran;
    }

    public static void getNama(){
        System.out.println("Hai, aku patra");
    }

    /**
     * set tubuh of an object manusia
     * @param tubuh parameter tubuh
     */
    public void setTubuh(String tubuh){
        this.tubuh = tubuh;
    }

    /**
     * set pikiran of an object manusia
     * @param pikiran
     */
    public void setPikiran(String pikiran){
        this.pikiran = pikiran;
    }
}
