package com.kea.bilrapport.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class DataRegistrering {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;
    private String navn;
    private Long stelNummer;
    private String efternavn;
    private String bilModel;
    private String bilMærke;
    private LocalDate lejeStartDato;
    private LocalDate lejeSlutDato;
    private double pris;

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

    public LocalDate getLejeStartDato() {
        return lejeStartDato;
    }

    public void setLejeStartDato(LocalDate lejeStartDato) {
        this.lejeStartDato = lejeStartDato;
    }

    public LocalDate getLejeSlutDato() {
        return lejeSlutDato;
    }

    public void setLejeSlutDato(LocalDate lejeSlutDato) {
        this.lejeSlutDato = lejeSlutDato;
    }
    public double getPris(){
        return pris;
    }
    public void setPris(double pris){
        this.pris = pris;
    }
}

