package model;

public class Afdeling {

    // attributen

    private String afdelingsNaam;
    private String afdelingsPlaats;

    // constructors

    public Afdeling(String afdelingsNaam, String afdelingsPlaats) {
        this.setAfdelingsNaam(afdelingsNaam);
        this.setAfdelingsPlaats(afdelingsPlaats);
    }

    public Afdeling() {
        this("Onbekend","Onbekend");
    }

    // methoden

    @Override
    public String toString() {
        return "afdeling " + afdelingsNaam + " te " + afdelingsPlaats;
    }

    // getters en setters

    public String getAfdelingsNaam() {
        return afdelingsNaam;
    }

    public void setAfdelingsNaam(String afdelingsNaam) {
        this.afdelingsNaam = afdelingsNaam;
    }

    public String getAfdelingsPlaats() {
        return afdelingsPlaats;
    }

    public void setAfdelingsPlaats(String afdelingsPlaats) {
        this.afdelingsPlaats = afdelingsPlaats;
    }
}
