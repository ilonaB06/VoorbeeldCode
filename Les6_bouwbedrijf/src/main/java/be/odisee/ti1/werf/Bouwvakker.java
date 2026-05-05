package be.odisee.ti1.werf;

import be.odisee.ti1.teller.PositieveTeller;
import be.odisee.ti1.hr.Arbeider;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Bouwvakker extends Arbeider {

    private PositieveTeller uurteller;

    /**
     * Creatie van een bouwvakker, met 0 gewerkte uren
     * maar we voorzien een teller om het aantal gewerkte uren bij te houden
     * @param naam van de bouwvakker
     * @param jaarInDienst aantal dienstjaren
     * @param basisUurloon te verhogen naarmate de bouwvakker meer jaren dienst heeft
     */
    public Bouwvakker(String naam, int jaarInDienst, double basisUurloon) {
        super(naam, jaarInDienst, basisUurloon, 0);
        this.uurteller = new PositieveTeller();
        this.uurteller.zetTellerAan();
    }

    /**
     * Uren bijtellen voor deze bouwvakker
     * @param aantal uren dat moet bijgeteld worden
     * @return totaal aantal getelde uren
     */
    public int telUrenBij(int aantal) {
        int totaalAantalUren = this.uurteller.increment(aantal);
        return totaalAantalUren;
    }

    /**
     * Berekent kost voor de bouwvakker en reset de uurteller
     * @return een verklaring van kost voor deze bouwvakker
     */
    public String verrekenUren() {
        String verrekening = "";
        int totaalAantalUren = this.uurteller.getWaarde();
        this.setGewerkteUren(totaalAantalUren);
        double kost = this.berekenMaandloonPuur() * 1.50;
        NumberFormat formatter = new DecimalFormat("#0.00");
        verrekening = "Bouwvakker " + this.getNaam() + " werkte " +
                        totaalAantalUren + " uren voor een bedrag van " +
                        formatter.format(kost)+"\n";
        this.uurteller.reset();
        return verrekening;
    }

}
