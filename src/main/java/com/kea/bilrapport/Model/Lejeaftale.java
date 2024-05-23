package com.kea.bilrapport.Model;

public class Lejeaftale {
    private String fornavn;
    private String efternavn;
    private String stelnummer;
    private String bilModel;
    private String lejeStartDato;
    private String lejeSlutDato;

    // Konstruktør
    public Lejeaftale() {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.stelnummer = stelnummer;
        this.bilModel = bilModel;
        this.lejeStartDato = lejeStartDato;
        this.lejeSlutDato = lejeSlutDato;
    }

    // Getters og setters
    public String getFornavn() {
        return fornavn;
    }


    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {return efternavn;}

    public void setEfternavn(String efternavn) {this.efternavn = efternavn;}

    public String getStelnummer(){return stelnummer; }
    public void setStelnummer(String stelnummer){this.stelnummer = stelnummer;}

    public String getBilModel() {
        return bilModel;
    }

    public void setBilModel(String bilModel) {
        this.bilModel = bilModel;
    }

    public String getLejeStartDato() {return lejeStartDato;}

    public void setLejeStartDato(String lejeStartDato) {
        this.lejeStartDato = lejeStartDato;
    }

    public String getLejeSlutDato() {
        return lejeSlutDato;
    }

    public void setLejeSlutDato(String lejeSlutDato) {
        this.lejeSlutDato = lejeSlutDato;
    }
}
