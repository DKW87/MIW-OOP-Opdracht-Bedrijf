package model;

public class Zzper extends Persoon implements Oproepbaar {

    // attributen
    private double uurtarief;
    private int urenGewerkt;

    // constructors

    public Zzper(String naam, String woonplaats, Afdeling afdeling, double uurtarief) {
        super(naam, woonplaats, afdeling);
        this.uurtarief = uurtarief;
        this.urenGewerkt = 0;
    }

    // methoden

    @Override
    public double berekenJaarInkomen() {
    final double HONDERD = 100.00;

        return (double) Math.round(this.uurtarief * this.urenGewerkt * HONDERD) / HONDERD;
    }


    public void huurIn(int uren) {
        this.urenGewerkt += uren;
    }

    @Override
    public String toString() {
        return super.toString() + " en is een zzp-er met een uurtarief van " + this.uurtarief;
    }

    // getters en setters

    public double getUurtarief() {
        return uurtarief;
    }

    public void setUurtarief(double uurtarief) {
        this.uurtarief = uurtarief;
    }

    public int getUrenGewerkt() {
        return urenGewerkt;
    }

    public void setUrenGewerkt(int urenGewerkt) {
        this.urenGewerkt = urenGewerkt;
    }
}
