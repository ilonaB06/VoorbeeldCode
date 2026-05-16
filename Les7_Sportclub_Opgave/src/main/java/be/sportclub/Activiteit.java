package be.sportclub;

// REQ0008 – De activiteit heeft een naam en prijs per sessie
public class Activiteit {

    private String naam;
    private double prijsPerSessie;

    public Activiteit(String naam, double prijsPerSessie) {
        this.naam = naam;
        this.prijsPerSessie = prijsPerSessie;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijsPerSessie() {
        return prijsPerSessie;
    }
}
