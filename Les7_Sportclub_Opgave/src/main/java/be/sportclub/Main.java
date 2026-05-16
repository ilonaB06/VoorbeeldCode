package be.sportclub;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Sportclub sportclub = new Sportclub();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.printf("Naam van het lid (of leeg om te stoppen): ");
            String naam = sc.nextLine();

            // REQ0001 – Het lid kan zijn naam doorgeven
            if (naam.isEmpty()) {
                break;
            }

            Lid lid = new Lid(naam);

            System.out.printf("%nHeeft u een lidkaart? Geef het nummer in. Voer 0 in om een nieuwe lidkaart aan te maken: ");
            int kaartNummer = Integer.parseInt(sc.nextLine());

            Lidkaart kaart;

            // REQ0005 – Het lid kan aangeven dat het een nieuwe lidkaart wenst
            if (kaartNummer == 0) {
                // REQ0006 – Sportclub kan een nieuwe lidkaart aanmaken
                kaart = sportclub.maakNieuweLidkaart(lid);
                System.out.printf("Nieuwe lidkaart aangemaakt: #%d voor %s%n%n", kaart.getNummer(), lid.getNaam());
            } else {
                // REQ0004 – Sportclub kan nagaan of een lidkaart bestaat
                kaart = sportclub.zoekLidkaart(kaartNummer);
                if (kaart == null) {
                    System.out.printf("Lidkaart #%d bestaat niet.%n%n", kaartNummer);
                    continue;
                }
            }

            sportclub.resetBoekingen();

            while (true) {

                System.out.printf("Lid %s maakt een boeking.%n", lid.getNaam());
                System.out.printf("Kies activiteit:%n");

                for (int i = 0; i < sportclub.getActiviteiten().size(); i++) {
                    Activiteit a = sportclub.getActiviteiten().get(i);
                    System.out.printf("%d. %s (%.2f EUR per sessie)%n", i + 1, a.getNaam(), a.getPrijsPerSessie());
                }

                // TODO(5) – Besturingsstructuren:
                // Vraag de keuze. Als keuze ongeldig is (kleiner dan 1 of groter dan aantal activiteiten),
                // toon "Ongeldige keuze." en vraag opnieuw (blijven herhalen tot geldig).
                System.out.printf("   Uw keuze: ");
                int keuze = Integer.parseInt(sc.nextLine()); // voorlopig zonder controle

                System.out.printf("   Aantal sessies: ");
                int aantalSessies = Integer.parseInt(sc.nextLine());

                // REQ0007 + REQ0009 – Lid kiest activiteit en geeft aantal sessies op
                Activiteit gekozenActiviteit = sportclub.getActiviteiten().get(keuze - 1);
                Boeking boeking = new Boeking(lid, gekozenActiviteit, aantalSessies);

                // TODO(6) – ArrayList + methoden:
                // Zorg dat de boeking effectief wordt toegevoegd aan de sportclub.
                // sportclub.voegBoekingToe(boeking);

                System.out.printf("%nBoeking geplaatst (%dx %s)%n", aantalSessies, gekozenActiviteit.getNaam());

                System.out.printf("Nog een boeking voor dit lid? (j/n): ");
                String antwoord = sc.nextLine();
                System.out.println();

                if (!antwoord.equalsIgnoreCase("j")) {
                    break;
                }
            }

            // REQ0011 – Sportclub kan een overzicht van de boekingen tonen
            System.out.printf("Overzicht van de boekingen:%n");
            for (Boeking b : sportclub.getBoekingen()) {
                System.out.printf("%dx %s%n", b.getAantalSessies(), b.getActiviteit().getNaam());
            }

            // TODO(7) – For-loop + variabelen:
            // Bereken het totaal aantal geboekte sessies via sportclub.getTotaalGeboekteSessies()
            int totaalSessies = 0; // vervang door de juiste aanroep

            // TODO(9) – Besturingsstructuren + methoden:
            // Voeg het totaal aantal sessies toe aan de lidkaart met het juiste nummer.
            // sportclub.voegSessiesToeAanLidkaart(kaart.getNummer(), totaalSessies);

            System.out.printf("%n%d sessies werden toegevoegd aan de lidkaart #%d%n", totaalSessies, kaart.getNummer());

            // TODO(8) – Rekenen + methoden:
            // Bereken de totale prijs via sportclub.berekenTotaalPrijs()
            double prijs = 0.0; // vervang door de juiste aanroep

            // REQ0015 – Sportclub toont de totale prijs
            System.out.printf("De totale prijs is %.2f EUR%n%n", prijs);

            System.out.printf("Volgend lid? (j/n): ");
            String volgende = sc.nextLine();
            System.out.println();

            if (!volgende.equalsIgnoreCase("j")) {
                break;
            }
        }

        sc.close();
    }
}
