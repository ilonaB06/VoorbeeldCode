package be.odisee.ti1.hr;

public abstract class BetaaldeMedewerker extends Medewerker {

    private int jaarInDienst;

    public BetaaldeMedewerker(String naam, int jaarInDienst) {
        super(naam);
        this.jaarInDienst = jaarInDienst;
    }

    public int getJaarInDienst() {
        return jaarInDienst;
    }

    public void setJaarInDienst(int jaarInDienst) {
        this.jaarInDienst = jaarInDienst;
    }

    @Override
    public String berekenMaandelijkseVergoeding() {
        return berekenMaandloon();
    }

    public abstract String berekenMaandloon();
}
