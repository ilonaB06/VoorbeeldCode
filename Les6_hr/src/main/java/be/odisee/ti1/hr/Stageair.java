package be.odisee.ti1.hr;

public class Stageair extends NietBetaaldeMedewerker {

    String school;

    public Stageair(String naam, double kostenForfait, String school) {
        super(naam, kostenForfait);
        this.school = school;
    }

    @Override
    public String getBijzonderheden() {
        return "van school " + this.school;
    }
}
