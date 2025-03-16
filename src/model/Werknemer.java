package model;

public class Werknemer extends Persoon {

    // attributen
    private static final double GRENSWAARDE_BONUS = 4500.00;
    private double maandSalaris;

    // constructors

    public Werknemer(String naam, String woonplaats, Afdeling afdeling, double maandSalaris) {
        super(naam, woonplaats, afdeling);
        this.maandSalaris = maandSalaris;
    }

    public Werknemer(String naam) {
        this(naam, DEFAULTWAARDE_WOONPLAATS, new Afdeling(),0);
    }

    public Werknemer() {
        this(DEFAULTWAARDE_NAAM);
    }

    // methoden

    public boolean heeftRechtOpBonus() {
        boolean rechtOpBonus = false;

        if (this.maandSalaris >= GRENSWAARDE_BONUS) {
            rechtOpBonus = true;
        }

        return rechtOpBonus;
    }

    @Override
    public double berekenJaarInkomen() {
        double jaarSalaris = 0;
        final int AANTAL_MAANDEN = 12;
        final double HONDERD = 100.00;

        if (this.heeftRechtOpBonus()) {
            jaarSalaris = (AANTAL_MAANDEN * this.getMaandSalaris()) + this.getMaandSalaris();
        }
        else {
            jaarSalaris = AANTAL_MAANDEN * this.getMaandSalaris();
        }
        jaarSalaris = (double) Math.round(jaarSalaris * HONDERD) / HONDERD;
        return jaarSalaris;
    }

    public void printRechtOpBonus() {
        if (this.heeftRechtOpBonus() == true) {
            System.out.printf("%s verdient %.2f en heeft wel recht op een bonus. \n", this.getNaam(), this.getMaandSalaris());
        } else {
            System.out.printf("%s verdient %.2f en heeft geen recht op een bonus. \n", this.getNaam(), this.getMaandSalaris());
        }
    }

    @Override
    public String toString() {
        String rechtOpBonus = "";
        if (this.heeftRechtOpBonus()) {
            rechtOpBonus = " en is een werknemer met recht op een bonus";
        }
        else{
            rechtOpBonus = " en is een werknemer zonder recht op een bonus";
        }
        return super.toString() + rechtOpBonus;
    }


    // getters en setters
    public double getMaandSalaris() {
        return maandSalaris;
    }

    public void setMaandSalaris(double maandSalaris) {
        if (maandSalaris >= 0.00) {
            this.maandSalaris = maandSalaris;
        } else {
            System.out.println("Kan geen negatief maandsalaris bevatten, maandsalaris op 0.00 gezet. ");
            this.maandSalaris = 0.00;
        }
    }

}
