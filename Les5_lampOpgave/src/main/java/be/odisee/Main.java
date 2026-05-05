package be.odisee;

public class Main {
    /**
     * Er is geen Main nodig ... test alles met unit testen
     */
    public static void main(String[] args) {
        GekleurdeLamp kl = new GekleurdeLamp("Geel");
        System.out.println("De status van kl is " + kl.getAan());
    }
}