package be.odisee.ti1.werf;

import be.odisee.ti1.hr.Bediende;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Werfleider extends Bediende {

    public Werfleider(String naam, int jaarInDienst, double basisMaandloon) {
        super(naam, jaarInDienst, basisMaandloon);
    }

    /**
     *
     * @return kostprijs voor de werfleider deze maand
     */
    public String verrekenMaand() {
        String verrekening = "";
        double kost = this.berekenMaandloonPuur() * 1.50;
        NumberFormat formatter = new DecimalFormat("#0.00");
        verrekening = "Werfleider " + this.getNaam() + " kost " +
                formatter.format(kost) + " EUR"+"\n";
        return verrekening;
    }
}
