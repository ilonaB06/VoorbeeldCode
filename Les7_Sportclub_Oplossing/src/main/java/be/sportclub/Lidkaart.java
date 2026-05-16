package be.sportclub;

public class Lidkaart {

    private int nummer;
    private Lid lid;
    private int aantalSessies;

    public Lidkaart(int nummer, Lid lid) {
        this.nummer = nummer;
        this.lid = lid;
        this.aantalSessies = 0;
    }

    public int getNummer() {
        return nummer;
    }

    public Lid getLid() {
        return lid;
    }

    public int getAantalSessies() {
        return aantalSessies;
    }

    // REQ0013 – Sportclub kan de geboekte sessies aan de lidkaart toevoegen
    public void voegSessiesToe(int aantal) {
        this.aantalSessies += aantal;
    }
}
