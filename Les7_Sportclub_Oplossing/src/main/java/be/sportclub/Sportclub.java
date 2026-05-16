package be.sportclub;

import java.util.ArrayList;

public class Sportclub {

    private ArrayList<Lidkaart> lidkaarten = new ArrayList<>();
    private ArrayList<Activiteit> activiteiten = new ArrayList<>();
    private ArrayList<Boeking> boekingen = new ArrayList<>();

    private int volgendLidkaartnummer = 1;

    public Sportclub() {
        activiteiten.add(new Activiteit("Zwemmen", 8.00));
        activiteiten.add(new Activiteit("Tennis", 12.00));
        activiteiten.add(new Activiteit("Fitness", 6.00));
    }

    public ArrayList<Activiteit> getActiviteiten() {
        return activiteiten;
    }

    public ArrayList<Boeking> getBoekingen() {
        return boekingen;
    }

    public void resetBoekingen() {
        boekingen.clear();
    }

    // REQ0004 – Sportclub kan nagaan of een lidkaart bestaat en deze opzoeken
    public Lidkaart zoekLidkaart(int nummer) {
        for (Lidkaart kaart : lidkaarten) {
            if (kaart.getNummer() == nummer) {
                return kaart;
            }
        }
        return null;
    }

    // REQ0006 – Sportclub kan een nieuwe lidkaart aanmaken
    public Lidkaart maakNieuweLidkaart(Lid lid) {
        Lidkaart kaart = new Lidkaart(volgendLidkaartnummer, lid);
        lidkaarten.add(kaart);
        volgendLidkaartnummer++;
        return kaart;
    }

    // REQ0010 – Sportclub kan een boeking aanmaken en bijhouden
    public void voegBoekingToe(Boeking b) {
        boekingen.add(b);
    }

    // REQ0012 – Sportclub kan het totaal aantal geboekte sessies berekenen
    public int getTotaalGeboekteSessies() {
        int totaal = 0;
        for (Boeking b : boekingen) {
            totaal += b.getAantalSessies();
        }
        return totaal;
    }

    // REQ0014 – Sportclub kan de totale prijs berekenen
    public double berekenTotaalPrijs() {
        double totaal = 0.0;
        for (Boeking b : boekingen) {
            totaal += b.getAantalSessies() * b.getActiviteit().getPrijsPerSessie();
        }
        return totaal;
    }

    // REQ0013 – Sportclub kan de geboekte sessies aan de lidkaart toevoegen
    public void voegSessiesToeAanLidkaart(int nummer, int aantal) {
        Lidkaart kaart = zoekLidkaart(nummer);
        if (kaart != null) {
            kaart.voegSessiesToe(aantal);
        }
    }
}
