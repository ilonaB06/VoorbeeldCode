# Les 7 – Oefeningen Java: Sportclub Actief

Maak voor de case van de sportclub een standaard Java consoletoepassing die je toelaat om de requirements
in verband met het identificeren van het lid, het zoeken of aanmaken van een lidkaart, activiteiten boeken
en afrekenen te realiseren.

Dit project is bewust **onvolledig**. Je moet op verschillende plaatsen code aanvullen waar `//TODO` staat.

## Case: Sportclub Actief

Een lokale sportclub biedt drie activiteiten aan: zwemmen, tennis en fitness.
Leden kunnen een lidkaart aanvragen. Op die kaart wordt bijgehouden hoeveel sessies ze al geboekt hebben.
Bij het afhalen betaalt het lid de prijs per activiteit × het aantal geboekte sessies (geen korting).

### Business proces (per lid)

1. **ACT010 – Lid identificeren**: het lid geeft zijn/haar naam in.
2. **ACT020 – Lidkaart zoeken of aanmaken**: het lid geeft het nummer van de lidkaart in, of 0 voor een nieuwe.
3. **ACT030 – Activiteit boeken**: het lid kiest een activiteit en geeft het aantal sessies op. Herhalen tot het lid stopt.
4. **ACT040 – Overzicht tonen**: alle boekingen van dit lid worden getoond.
5. **ACT050 – Sessies registreren**: het totaal aantal geboekte sessies wordt op de lidkaart bijgezet.
6. **ACT060 – Afrekenen**: de totale prijs wordt berekend en getoond.

---

## Requirements per activiteit

| REQ# | Omschrijving | Type | ACT010 | ACT020 | ACT030 | ACT040 | ACT050 | ACT060 |
|------|--------------|------|--------|--------|--------|--------|--------|--------|
| REQ0001 | Het lid kan zijn naam doorgeven | I | X | | | | | |
| REQ0002 | Het lid heeft een naam | P | X | | | | | |
| REQ0003 | Het lid kan een kaartnummer ingeven (0 = nieuw) | I | | X | | | | |
| REQ0004 | Sportclub kan nagaan of een lidkaart bestaat en deze opzoeken | P | | X | | | | |
| REQ0005 | Het lid kan aangeven dat het een nieuwe lidkaart wenst | I | | X | | | | |
| REQ0006 | Sportclub kan een nieuwe lidkaart aanmaken | P | | X | | | | |
| REQ0007 | Het lid kan een activiteit kiezen | I | | | X | | | |
| REQ0008 | De activiteit heeft een naam en prijs per sessie | P | | | X | | | |
| REQ0009 | Het lid kan het aantal sessies opgeven | I | | | X | | | |
| REQ0010 | Sportclub kan een boeking aanmaken en bijhouden | P | | | X | | | |
| REQ0011 | Sportclub kan een overzicht van de boekingen tonen | O | | | | X | | |
| REQ0012 | Sportclub kan het totaal aantal geboekte sessies berekenen | P | | | | | X | |
| REQ0013 | Sportclub kan de geboekte sessies aan de lidkaart toevoegen | P | | | | | X | |
| REQ0014 | Sportclub kan de totale prijs berekenen (aantal × prijs/sessie) | P | | | | | | X |
| REQ0015 | Sportclub toont de totale prijs aan het lid | O | | | | | | X |

---

## Wat oefen je?

- variabelen & scope (lokale variabelen, instantievariabelen, parameters)
- besturingsstructuren (if/else, while, for)
- arrays / ArrayList (toevoegen, opzoeken, overlopen)
- methoden (schrijven/aanroepen, return, parameters)

---

## Gewenste output van de consoletoepassing

```text
Naam van het lid (of leeg om te stoppen): Lisa

Heeft u een lidkaart? Geef het nummer in. Voer 0 in om een nieuwe lidkaart aan te maken: 0
Nieuwe lidkaart aangemaakt: #1 voor Lisa

Lid Lisa maakt een boeking.
Kies activiteit:
1. Zwemmen (8.00 EUR per sessie)
2. Tennis (12.00 EUR per sessie)
3. Fitness (6.00 EUR per sessie)
   Uw keuze: 2
   Aantal sessies: 3

Boeking geplaatst (3x Tennis)
Nog een boeking voor dit lid? (j/n): j

Lid Lisa maakt een boeking.
Kies activiteit:
1. Zwemmen (8.00 EUR per sessie)
2. Tennis (12.00 EUR per sessie)
3. Fitness (6.00 EUR per sessie)
   Uw keuze: 3
   Aantal sessies: 2

Boeking geplaatst (2x Fitness)
Nog een boeking voor dit lid? (j/n): n

Overzicht van de boekingen:
3x Tennis
2x Fitness

5 sessies werden toegevoegd aan de lidkaart #1

De totale prijs is 48.00 EUR

Volgend lid? (j/n): n
```

---

## Opdrachtvragen (koppel aan TODO's in code)

1. **(Variabelen + scope)** Waar bewaar je de naam van het lid? Waarom is dat een *attribuut* van `Lid` en geen lokale variabele in `Main`? Schrijf je antwoord als comment bij de declaratie in de `Lid`-klasse.
2. **(Methoden)** Vul `Lid#getNaam()` aan zodat de naam teruggegeven wordt.
3. **(ArrayList + for-loop)** Vul `Sportclub#zoekLidkaart(int nummer)` aan: loop over de lijst en zoek op nummer. Bestaat de kaart niet? Geef `null` terug.
4. **(Variabelen + methoden)** `Sportclub` houdt het volgend lidkaartnummer bij. Vul `maakNieuweLidkaart(Lid lid)` aan: maak de kaart, voeg ze toe aan de lijst, verhoog de teller, en geef de kaart terug.
5. **(Besturingsstructuren)** In `Main` kiest het lid een activiteit. Vul de controle in zodat ongeldige keuzes (kleiner dan 1 of groter dan het aantal activiteiten) opnieuw gevraagd worden.
6. **(ArrayList + methoden)** Vul `Sportclub#voegBoekingToe(Boeking b)` aan zodat de boeking effectief in de lijst terechtkomt.
7. **(For-loop + variabelen)** Bereken het totaal aantal geboekte sessies: vul `getTotaalGeboekteSessies()` aan.
8. **(Rekenen + methoden)** Bereken de totale prijs: vul `berekenTotaalPrijs()` aan. Prijs = som van (aantalSessies × prijsPerSessie) per boeking.
9. **(Besturingsstructuren + methoden)** Vul `voegSessiesToeAanLidkaart(int nummer, int aantal)` aan: zoek de kaart en voeg het aantal sessies toe.

---

## Hoe doe je console I/O in Java? (basis)

### 1) Lezen (input) met Scanner

```java
Scanner sc = new Scanner(System.in);
String tekst = sc.nextLine();   // leest een volledige lijn (String)
```

### 2) Getal lezen

`Scanner` geeft met `nextLine()` een String terug. Een int maken doe je met `Integer.parseInt(...)`:

```java
int keuze = Integer.parseInt(sc.nextLine());
```

### 3) Schrijven (output) met printf

`printf` werkt met placeholders:

- `%s` voor String
- `%d` voor int
- `%.2f` voor double met 2 decimalen
- `%n` voor newline

```java
System.out.printf("Hallo %s, je koos %d.%n", naam, keuze);
System.out.printf("Prijs: %.2f EUR%n", prijs);
```

### 4) Scanner sluiten

```java
sc.close();
```

---

## Indienen

Nadat je de applicatie grondig hebt uitgetest, push je het resultaat voor de deadline naar je repository.

Veel succes!
