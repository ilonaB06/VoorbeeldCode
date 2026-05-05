package be.odisee.bodymassindex;

public class BodyMassIndex {

    private double massa, lengte;
    private double bmi;

    /**
     * constructor zonder parameters
     */
    public BodyMassIndex() {
        lengte = 0.0;
        massa = 0.0;
        bmi = 0.0;
    }

    /**
     * constructor met twee parameters
     *
     * @param massa gewicht in kg
     * @param lengte lengte in meter
     */
    public BodyMassIndex(double massa, double lengte) {
        this.massa = massa;
        this.lengte = lengte;
        this.bmi = berekenBmi();
    }

    /**
     *
     * @return de massa
     */
    public double getMassa() {
        return massa;
    }

    /**
     * Stelt een nieuwe waarde voor massa in
     * Herberekent de bmi
     *
     * @param massa de nieuwe massa
     */
    public void setMassa(double massa) {
        if (massa > 0.0) this.massa = massa;
        else this.massa = 0.0;
        this.bmi = berekenBmi();
    }

    /**
     *
     * @return de lengte
     */
    public double getLengte() {
        return lengte;
    }

    /**
     * Stelt een nieuwe waarde voor lengte in
     * Herberekent de bmi
     *
     * @param lengte de nieuwe lengte in meter
     */
    public void setLengte(double lengte) {
        if (lengte > 0.0) this.lengte = lengte;
        else this.lengte = 0.0;
        this.bmi = berekenBmi();
    }

    public double getBmi() {
        return bmi;
    }

    /**
     * berekent de Body Mass Index als BMI = massa / (lengte * lengte)
     *   massa gewicht van de persoon in kg
     *   lengte lengte van de persoon in meter
     * @return de berekende Body Mass Index
     */
    private double berekenBmi() {

        if ( (this.lengte == 0.0) || (this.massa == 0.0) ) {
            // als lengte = 0 of massa = 0 moet BMI=0 zijn volgens opgave
            return 0.0;
        } else {
            // bij normale waarden van lengte en massa, berekenen we BMI
            return this.massa / (this.lengte * this.lengte);
        }
    }

    /**
     * laat toe om lengte in cm in te voeren
     * @param lengte in cm
     */
    public void setLengte(int lengte) {
        setLengte(lengte / 100.0);   // we herbruiken de setter met een double parameter
    }

    /**
     * @return de lengte in centimeter (is ook nodig voor GUI)
     */
    public int getLengteCm() {
        return (int) (100.0 * this.lengte);
    }

    /**
     * in één keer lengte en massa specificeren
     * @param lengte in cm
     * @param massa in kg
     */
    public void setLengteEnMassa(int lengte, double massa) {
        setLengte(lengte); // we herbruiken setLengte(int lengte)
        setMassa(massa);
    }

    /**
     * in één keer bm en lengte specificeren
     * @param bmi
     * @param lengte
     */
    public void setBmiEnLengte(double bmi, int lengte) {
        // aangezien BMI = massa / (lengte * lengte)
        // is massa = BMI * lengte * lengte
        setLengte(lengte); // we herbruiken setLengte(int lengte)
        setMassa(bmi * this.lengte * this.lengte);
    }
}
