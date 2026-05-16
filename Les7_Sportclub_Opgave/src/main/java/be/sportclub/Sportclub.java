package be.sportclub;

import java.util.ArrayList;

public class Sportclub {

    private ArrayList<Lidkaart> lidkaarten = new ArrayList<>();
    private ArrayList<Activiteit> activiteiten = new ArrayList<>();
    private ArrayList<Boeking> boekingen = new ArrayList<>();

    // variabelen & scope: dit is een instantievariabele (bestaat zolang het Sportclub-object bestaat)
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

    // Als een nieuw lid boekt, maken we de ArrayList van boekingen leeg
    public void resetBoekingen() {
        boekingen.clear();
    }

    // REQ0004 – Sportclub kan nagaan of een lidkaart bestaat en deze opzoeken
    // TODO(3) – ArrayList + for-loop:
    // Loop over lidkaarten en geef de kaart terug met dit nummer. Bestaat ze niet? return null.
    public Lidkaart zoekLidkaart(int nummer) {
        // TODO
        return null;
    }

    // REQ0006 – Sportclub kan een nieuwe lidkaart aanmaken
    // TODO(4) – Variabelen + methoden:
    // Maak een nieuwe kaart met het huidig volgnummer, voeg toe aan de lijst,
    // verhoog het volgnummer en return de kaart.
    public Lidkaart maakNieuweLidkaart(Lid lid) {
        // TODO
        return null;
    }

    // REQ0010 – Sportclub kan een boeking aanmaken en bijhouden
    // TODO(6) – ArrayList + methoden:
    // Voeg de boeking toe aan de ArrayList boekingen.
    public void voegBoekingToe(Boeking b) {
        // TODO
    }

    // REQ0012 – Sportclub kan het totaal aantal geboekte sessies berekenen
    // TODO(7) – For-loop + variabelen:
    // Tel alle aantalSessies uit boekingen op en return het totaal.
    public int getTotaalGeboekteSessies() {
        // TODO
        return 0;
    }

    // REQ0014 – Sportclub kan de totale prijs berekenen (aantalSessies × prijsPerSessie per boeking)
    // TODO(8) – Rekenen + methoden:
    // Voor elke boeking: aantalSessies × activiteit.getPrijsPerSessie(). Tel op en return totaal.
    public double berekenTotaalPrijs() {
        // TODO
        return 0.0;
    }

    // REQ0013 – Sportclub kan de geboekte sessies aan de lidkaart toevoegen
    // TODO(9) – Besturingsstructuren + methoden:
    // Zoek de kaart op nummer. Als ze bestaat: kaart.voegSessiesToe(aantal).
    public void voegSessiesToeAanLidkaart(int nummer, int aantal) {
        // TODO
    }
}
