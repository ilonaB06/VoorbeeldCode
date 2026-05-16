package be.sportclub;

// REQ0010 – Sportclub kan een boeking aanmaken en bijhouden
public class Boeking {

    private Lid lid;
    private Activiteit activiteit;
    private int aantalSessies;

    public Boeking(Lid lid, Activiteit activiteit, int aantalSessies) {
        this.lid = lid;
        this.activiteit = activiteit;
        this.aantalSessies = aantalSessies;
    }

    public Lid getLid() {
        return lid;
    }

    public Activiteit getActiviteit() {
        return activiteit;
    }

    public int getAantalSessies() {
        return aantalSessies;
    }
}
