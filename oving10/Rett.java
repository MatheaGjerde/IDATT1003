package oving10;

public class Rett{
    private final String navn;
    private final String type;
    private final double pris;
    private final String oppskrift;

    public Rett(String navn, String type, double pris, String oppskrift){
        this.navn = navn;
        this.type = type;
        this.pris = pris;
        this.oppskrift = oppskrift;
    }

    public String getNavn(){ return navn; }
    public String getType(){ return type; }
    public double getPris(){ return pris; }
    public String getOppskrift(){ return oppskrift; }

    @Override
    public String toString(){
        return navn + " (" + type + ") - " + pris + " kr";
    }

}