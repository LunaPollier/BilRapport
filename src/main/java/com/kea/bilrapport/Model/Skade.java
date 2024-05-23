package com.kea.bilrapport.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class Skade {
    private Long skadeId;
    private String stelnummer;
    private Long bilId;
    private String beskrivelse;
    private Double pris;

    // Getters og setters
    public Long getSkadeId() {
        return skadeId;
    }

    public void setSkadeId(Long skadeId) {
        this.skadeId = skadeId;
    }

    public String getStelnummer() {
        return stelnummer;
    }

    public void setStelnummer(String stelnummer) {
        this.stelnummer = stelnummer;
    }

    public Long getBilId() {
        return bilId;
    }

    public void setBilId(Long bilId) {
        this.bilId = bilId;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public Double getPris() {
        return pris;
    }

    public void setPris(Double pris) {
        this.pris = pris;
    }
}
