package be.sportclub;

public class Lid {

    // TODO(1) – Variabelen + scope:
    // Declareer hier het attribuut 'naam' (String).
    // Waarom is dit een attribuut van Lid en geen lokale variabele in Main?
    // Schrijf je antwoord als comment hier onder.
    // ...

    public String naam;



    public Lid(String naam) {
        // TODO(1): sla de naam op in het attribuut
        this.naam = naam;
    }

    // REQ0002 – Het lid heeft een naam
    // TODO(2) – Methoden:
    // Geef de naam terug.
    public String getNaam() {
        // TODO
        Lid lid = new Lid(this.naam);
        return null;
    }
}
