package model;

public abstract class Persoon implements Comparable<Persoon> {

    // attributen

    public static int aantalPersonen = 0;
    protected static final String DEFAULTWAARDE_NAAM = "Onbekend";
    protected static final String DEFAULTWAARDE_WOONPLAATS = "Onbekend";
    protected final int personeelsNummer;
    protected String naam;
    protected String woonplaats;
    protected Afdeling afdeling;

    // constructors

    public Persoon(String naam, String woonplaats, Afdeling afdeling) {
        this.setNaam(naam);
        this.setWoonplaats(woonplaats);
        this.setAfdeling(afdeling);
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon(String naam) {
        this(naam, DEFAULTWAARDE_WOONPLAATS, new Afdeling());
    }

    public Persoon() {
        this(DEFAULTWAARDE_NAAM);
    }

    // methoden

    public abstract double berekenJaarInkomen();

    @Override
    public String toString() {
        return naam + " woont in " + woonplaats + " en werkt op afdeling " + afdeling.toString();
    }

    @Override
    public int compareTo(Persoon anderePersoon) {
        return this.naam.compareTo(anderePersoon.naam);
    }

    // getters en setters

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public int getPersoneelsNummer() {
        return personeelsNummer;
    }

    public Afdeling getAfdeling() {
        return afdeling;
    }

    public void setAfdeling(Afdeling afdeling) {
        this.afdeling = afdeling;
    }
} // Persoon
