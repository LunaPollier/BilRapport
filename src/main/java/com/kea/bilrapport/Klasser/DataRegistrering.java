package com.kea.bilrapport.Klasser;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import java.util.Date;

@Entity
@Table(name = "data_registrering")
public class DataRegistrering {
    @Id
    private Long stelNummer;

    private String navn;
    private String efternavn;
    private int bilModel;

    private String bilMærke;
    private Date LejeStartDato;
    private Date LejeSlugDato;

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public Long getStelNummer() {
        return stelNummer;
    }

    public void setStelNummer(Long stelNummer) {
        this.stelNummer = stelNummer;
    }

    public int getBilModel() {
        return bilModel;
    }

    public void setBilModel(int bilModel) {
        this.bilModel = bilModel;
    }

    public Date getLejeStartDato() {
        return LejeStartDato;
    }

    public void setLejeStartDato(Date lejeStartDato) {
        LejeStartDato = lejeStartDato;
    }

    public Date getLejeSlugDato() {
        return LejeSlugDato;
    }

    public void setLejeSlugDato(Date lejeSlugDato) {
        LejeSlugDato = lejeSlugDato;
    }


    public String getBilMærke() {
        return bilMærke;
    }

    public void setBilMærke(String bilMærke) {
        this.bilMærke = bilMærke;
    }
}

