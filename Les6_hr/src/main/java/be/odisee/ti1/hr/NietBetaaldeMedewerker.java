package be.odisee.ti1.hr;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public abstract class NietBetaaldeMedewerker extends Medewerker{

    double kostenForfait;

    public NietBetaaldeMedewerker(String naam, double kostenForfait) {
        super(naam);
        this.kostenForfait = kostenForfait;
    }

    public double getKostenForfait() {
        return kostenForfait;
    }

    public void setKostenForfait(double kostenForfait) {
        this.kostenForfait = kostenForfait;
    }

    @Override
    public String berekenMaandelijkseVergoeding() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        return this.getClass().toString() + " " + this.getBijzonderheden() + " " +
                getNaam() + " krijgt deze maand een vergoeding van " +
                formatter.format(kostenForfait) + " EUR netto";
    }

    public abstract String getBijzonderheden();
}
