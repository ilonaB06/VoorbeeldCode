package be.odisee.ti1.werf;

public class Werf {

    private Bouwvakker[] bouwvakkers;
    private Werfleider werfleider;

    /**
     * Een Werf aanmaken betekent dat we vertellen
     * welke X bouwvakkers en werfleider er deel van uitmaken
     * @param bouwvakkers de verschillende bouwvakkers die op de werf zullen werken
     * @param werfleider de werfleider van de werf
     */
    public Werf(Bouwvakker[] bouwvakkers, Werfleider werfleider) {
        this.bouwvakkers = bouwvakkers;
        this.werfleider = werfleider;
    }

    /**
     * Uren bijtellen voor een bouwvakker
     * @param nrBouwvakker - het nummer (tussen 0 en het aantal bouwvakkers) van de bouwvakker
     * @param aantal - aantal volle uren dat voor deze bouwvakker dient bijgeteld
     * @return het totaal aantal uren voor deze bouwvakker tot nu toe
     */
    public int telUrenBij(int nrBouwvakker, int aantal) {
        return this.bouwvakkers[nrBouwvakker].telUrenBij(aantal);
    }

    /**
     * Elke maand maakt de aannemer een afrekening voor de klant-bouwheer.
     * Dit bedrag wordt dan gefactureerd aan de klant.
     */
    public String maandelijkseFactuur() {
        String factuurTekst = "";
        for (Bouwvakker bouwvakker: this.bouwvakkers) {
            factuurTekst += bouwvakker.verrekenUren();
        }
        factuurTekst += this.werfleider.verrekenMaand();
        return factuurTekst;
    }

    /**
     * Simulatie van een werf opstarten en 1 maand factureren
     * @param args
     */
    public static void main(String[] args) {
        Bouwvakker[] bouwvakkers = new Bouwvakker[4];
        Werfleider werfleider;

        // We initialiseren de werf met 4 bouwvakkers en de werfleider
        for (int i=0; i<4; i++) {
            bouwvakkers[i] = new Bouwvakker("Albert "+i, 2017-i*10, 12.00);
        }
        werfleider = new Werfleider("Jef De Chef", 2002, 2100.00);
        Werf werf = new  Werf(bouwvakkers, werfleider);

        // Gewerkte uren week 1
        bouwvakkers[0].telUrenBij(40);
        bouwvakkers[1].telUrenBij(40);
        bouwvakkers[2].telUrenBij(40);
        bouwvakkers[3].telUrenBij(32);

        // Gewerkte uren week 2
        bouwvakkers[0].telUrenBij(40);
        bouwvakkers[1].telUrenBij(40);
        bouwvakkers[2].telUrenBij(0);
        bouwvakkers[3].telUrenBij(32);

        // Gewerkte uren week 3
        bouwvakkers[0].telUrenBij(40);
        bouwvakkers[1].telUrenBij(40);
        bouwvakkers[2].telUrenBij(40);
        bouwvakkers[3].telUrenBij(32);

        // Gewerkte uren week 4
        bouwvakkers[0].telUrenBij(32);
        bouwvakkers[1].telUrenBij(40);
        bouwvakkers[2].telUrenBij(40);
        bouwvakkers[3].telUrenBij(32);

        // Bereken de kost voor deze maand
        System.out.println(werf.maandelijkseFactuur());
    }
}
