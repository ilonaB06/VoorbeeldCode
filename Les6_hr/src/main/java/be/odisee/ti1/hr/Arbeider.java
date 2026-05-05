package be.odisee.ti1.hr;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;

public class Arbeider extends BetaaldeMedewerker {

    double basisUurloon;
    int gewerkteUren;

    public Arbeider(String naam, int jaarInDienst, double basisUurloon, int gewerkteUren) {
        super(naam, jaarInDienst);
        this.basisUurloon = basisUurloon;
        this.gewerkteUren = gewerkteUren;
    }

    public void setGewerkteUren(int gewerkteUren) {
        this.gewerkteUren = gewerkteUren;
    }

    /**
     * Het maandloon voor een arbeider is het basisUurloon
     * vermeerderd met 1% per jaar ancienniteit
     * en vermenigvuldigd met het aantal gewerkte uren
     * @return het berekende maandloon
     */
    public double berekenMaandloonPuur() {
        int ditJaar = Calendar.getInstance().get(Calendar.YEAR);
        int ancienniteit = ditJaar - getJaarInDienst();
        return basisUurloon * (1 + ancienniteit * 0.01) * gewerkteUren;
    }

   /**
     * Formatteer het maandloon en geef er een deftige tekst bij
     * @return
     * //TODO kan gerefactord worden, deze kan naar de superklasse
     */
    @Override
    public String berekenMaandloon() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        return this.getClass().toString() + " " +
                    getNaam() + " krijgt deze maand een vergoeding van " +
                    formatter.format( berekenMaandloonPuur() ) +
                    " EUR bruto";
    }
}

