package be.odisee.ti1.hr;

import java.util.ArrayList;
import java.util.List;

public class MaandelijkseBetaling {

    public static void main(String[] args) {

        // Impliciete conversie
        Stageair adam = new Stageair("Adam Kas", 125.00, "Odisee");
        NietBetaaldeMedewerker adam2 = adam;
        Medewerker adam3 = adam2;

        // Niet toegestaan
        // Arbeider jef = new Arbeider("Jef Neve", 2001, 25.00, 150);
        // Bediende jef2 = jef;

        Stageair nawfal, busra;
        Medewerker sienne;
        nawfal = new Stageair("Nawfal Robyn", 110.00, "Odisee");
        System.out.println( nawfal.getBijzonderheden() );
        sienne = nawfal;
        // Niet toegestaan, want de klasse Medewerker kent deze methode niet
        // System.out.println( sienne.getBijzonderheden() );
        // Dus gaan we expliciet downcasten
        busra = (Stageair) sienne;
        System.out.println(busra.getBijzonderheden());


        List<Medewerker> medewerkers = new ArrayList<Medewerker>();

        medewerkers.add(new Arbeider("Bob Dylan", 1967, 20.00, 150));
        medewerkers.add(new Arbeider("Sheila Escovedo", 1976, 22.00, 160));
        medewerkers.add(new Bediende("Prince Rogers Nelson", 1976, 2000.00 ));
        medewerkers.add(new Bediende("Lander Gyselinck", 2011, 2200.00));
        medewerkers.add(new Bediende("Esther Venrooy", 2010, 2300.00));
        medewerkers.add(new Stageair("Ruben Anckaert", 125.00, "Odisee"));
        medewerkers.add(new Stageair("Bob Verkoelen", 105.50, "Odisee"));

        for (Medewerker medewerker: medewerkers) {
            System.out.println( medewerker.berekenMaandelijkseVergoeding() );
        }
    }
}
