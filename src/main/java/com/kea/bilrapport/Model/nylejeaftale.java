package com.kea.bilrapport.Model;

public class nylejeaftale {

    private int id;
    private String fornavn;
    private String efternavn;
    private String stelnummer;
    private String bilmodel;
    private String bilmærke;
    private String startLejeperiode;
    private String slutLejeperiode;


    // konstruktør
    public nylejeaftale(String fornavn, String efternavn, String stelnummer, String bilmodel, String bilmærke, String startLejeperiode, String slutLejeperiode) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.stelnummer = stelnummer;
        this.bilmodel = bilmodel;
        this.bilmærke = bilmærke;
        this.startLejeperiode = startLejeperiode;
        this.slutLejeperiode = slutLejeperiode;
    }

    // Getters og Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public String getStelnummer() {
        return stelnummer;
    }

    public void setStelnummer(String stelnummer) {
        this.stelnummer = stelnummer;
    }

    public String getBilmodel() {
        return bilmodel;
    }

    public void setBilmodel(String bilmodel) {
        this.bilmodel = bilmodel;
    }

    public String getBilmærke() {
        return bilmærke;
    }

    public void setBilmærke(String bilmærke) {
        this.bilmærke = bilmærke;
    }

    public String getStartLejeperiode() {
        return startLejeperiode;
    }

    public void setStartLejeperiode(String startLejeperiode) {
        this.startLejeperiode = startLejeperiode;
    }

    public String getSlutLejeperiode() {
        return slutLejeperiode;
    }

    public void setSlutLejeperiode(String slutLejeperiode) {
        this.slutLejeperiode = slutLejeperiode;
    }

    @Override
    public String toString() {
        return "nylejeaftale{" +
                "id=" + id +
                ", fornavn='" + fornavn + '\'' +
                ", efternavn='" + efternavn + '\'' +
                ", stelnummer='" + stelnummer + '\'' +
                ", bilmodel='" + bilmodel + '\'' +
                ", bilmærke='" + bilmærke + '\'' +
                ", startLejeperiode='" + startLejeperiode + '\'' +
                ", slutLejeperiode='" + slutLejeperiode + '\'' +
                '}';
    }
}