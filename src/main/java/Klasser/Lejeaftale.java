package Klasser;

public class Lejeaftale {
    private String kundeNavn;
    private String bilModel;
    private String lejeStartDato;
    private String lejeSlutDato;

    // Konstruktør
    public Lejeaftale() {
        this.kundeNavn = kundeNavn;
        this.bilModel = bilModel;
        this.lejeStartDato = lejeStartDato;
        this.lejeSlutDato = lejeSlutDato;
    }

    // Getters og setters
    public String getKundeNavn() {
        return kundeNavn;
    }

    public void setKundeNavn(String kundeNavn) {
        this.kundeNavn = kundeNavn;
    }

    public String getBilModel() {
        return bilModel;
    }

    public void setBilModel(String bilModel) {
        this.bilModel = bilModel;
    }

    public String getLejeStartDato() {
        return lejeStartDato;
    }

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
