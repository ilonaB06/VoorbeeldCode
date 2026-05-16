package be.sportclub;

public class Lid {

    // Dit is een attribuut van Lid omdat de naam bij het object hoort en op meerdere plaatsen
    // nodig is (in Main, in Lidkaart, in output). Als lokale variabele in Main zou de naam
    // verdwijnen zodra de methode-aanroep voorbij is en niet doorgegeven kunnen worden aan andere klassen.
    private String naam;

    public Lid(String naam) {
        this.naam = naam;
    }

    // REQ0002 – Het lid heeft een naam
    public String getNaam() {
        return naam;
    }
}
