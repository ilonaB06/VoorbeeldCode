package be.odisee.ti1.hr;

public abstract class Medewerker {

    private String naam;

    public Medewerker(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public abstract String berekenMaandelijkseVergoeding();
}
