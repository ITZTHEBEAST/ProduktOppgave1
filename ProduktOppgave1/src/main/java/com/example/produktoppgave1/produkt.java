package com.example.produktoppgave1;

public class produkt {


    private String navn;
    private String adresse;

    // konstruktør
    public produkt (String navn, String adresse) {
        this.navn = navn;
        this.adresse = adresse;
    }

    public String getNavn() {
        return navn;
    }

    public String getAdresse() {
        return adresse;
    }

    // set metoder
    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
