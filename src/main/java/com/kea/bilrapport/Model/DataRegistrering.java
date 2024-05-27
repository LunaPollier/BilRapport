package com.kea.bilrapport.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class DataRegistrering {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStelNummer() {
        return stelNummer;
    }

    public void setStelNummer(Long stelNummer) {
        this.stelNummer = stelNummer;
    }

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

    public String getBilModel() {
        return bilModel;
    }

    public void setBilModel(String bilModel) {
        this.bilModel = bilModel;
    }

    public String getBilMærke() {
        return bilMærke;
    }

    public void setBilMærke(String bilMærke) {
        this.bilMærke = bilMærke;
    }

    public Date getLejeStartDato() {
        return lejeStartDato;
    }

    public void setLejeStartDato(Date lejeStartDato) {
        this.lejeStartDato = lejeStartDato;
    }

    public Date getLejeSlutDato() {
        return lejeSlutDato;
    }

    public void setLejeSlutDato(Date lejeSlutDato) {
        this.lejeSlutDato = lejeSlutDato;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long stelNummer;
    private String navn;
    private String efternavn;
    private String bilModel; // Ændret fra bil_model til bilModel
    private String bilMærke;
    private Date lejeStartDato;
    private Date lejeSlutDato;

    // Constructor, getters og setters
}
