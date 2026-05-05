package be.odisee.ti1.hr;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;

public class Bediende extends BetaaldeMedewerker {

    double basisMaandloon;

    public Bediende(String naam, int jaarInDienst, double basisMaandloon) {
        super(naam, jaarInDienst);
        this.basisMaandloon = basisMaandloon;
    }


    /**
     * Het maandloon voor een bediende is het basisUurloon
     * vermeerderd met 3% per jaar ancienniteit
     * @return het berekende maandloon
     */
    public double berekenMaandloonPuur() {
        int ditJaar = Calendar.getInstance().get(Calendar.YEAR);
        int ancienniteit = ditJaar - getJaarInDienst();
        return  (basisMaandloon * (1 + ancienniteit * 0.03));
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

