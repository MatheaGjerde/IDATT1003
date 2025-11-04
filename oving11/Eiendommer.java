package oving11;

public class Eiendommer{
    private int kommunenr;
    private String kommunenavn;
    private int gnr;
    private int bnr;
    private String bruksn; //kan være null
    private double areal;
    private String eier;

    public Eiendommer(int kommunenr, String kommunenavn, int gnr, int bnr, double areal, String eier) {
        this(kommunenr, kommunenavn, gnr, bnr, null, areal, eier); // kaller den andre konstruktøren
    }

    public Eiendommer(int kommunenr, String kommunenavn, int gnr, int bnr, String bruksn, double areal, String eier){
        this.kommunenr = kommunenr;
        this.kommunenavn = kommunenavn;
        this.gnr = gnr;
        this.bnr = bnr;
        this.bruksn = bruksn;
        this.areal = areal;
        this.eier = eier;
    }

    public int getKommunenr(){ 
        return kommunenr;
    }
    public String getKommunenavn(){ 
        return kommunenavn;
    }
    public int getGnr(){ 
        return gnr;
    }
    public int getBnr(){ 
        return bnr;
    }
    public String getBruksnr(){
        return bruksn;
    }
    public double getAreal(){ 
        return areal;
    }
    public String getEier(){ 
        return eier;
    }
    public void setBruksnr(String bruksnr){
        this.bruksn = bruksn;
    }
    public void setAreal(double areal) {
        if (areal > 0){
            this.areal = areal;
        } else{
            throw new IllegalArgumentException("Areal må være større enn 0.");
        }
    }
    public void setEier(String eier){
        if (eier != null && !eier.trim().isEmpty()){
            this.eier = eier;
        } else{
            throw new IllegalArgumentException("Eier kan ikke være tom.");
        }
    }

    @Override
    public String toString(){
        return kommunenavn + " | " + kommunenr + " | " + gnr + " | " + bnr + " | " + (bruksn != null ? " | " + bruksn : "") + " | " + areal + " | " + eier;
    }

}