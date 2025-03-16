package model;

public class Vrijwilliger extends Persoon implements Oproepbaar {

    // attributen

    private int urenGewerkt;

    // constructors

    public Vrijwilliger (String naam, String woonplaats, Afdeling afdeling) {
        super(naam, woonplaats, afdeling);
        this.urenGewerkt = 0;
    }

    // methoden

    public void huurIn(int uren) {
        this.urenGewerkt += uren;
    }

    @Override
    public double berekenJaarInkomen() {
        final double KOST_NIKS = 0.00;
        return KOST_NIKS;
    }

    @Override
    public String toString() {
        return super.toString() + " en is een vrijwilliger";
    }

    // getters en setters

}
