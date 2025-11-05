package oving11;

public class Eiendommer{
    private int kommunenr;
    private String kommunenavn;
    private int gnr;
    private int bnr;
    private String bruksnavn; //kan være null
    private double areal;
    private String eier;

    public Eiendommer(String kommunenavn, int kommunenr, int gnr, int bnr, double areal, String eier) {
        this(kommunenavn, kommunenr, gnr, bnr, null, areal, eier); // kaller den andre konstruktøren
    }

    public Eiendommer(String kommunenavn, int kommunenr, int gnr, int bnr, String bruksnavn, double areal, String eier){
        this.kommunenavn = kommunenavn;
        this.kommunenr = kommunenr;
        this.gnr = gnr;
        this.bnr = bnr;
        this.bruksnavn = bruksnavn;
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
        return bruksnavn;
    }
    public double getAreal(){ 
        return areal;
    }
    public String getEier(){ 
        return eier;
    }
    //legger til bruksnavn hvis det manglet
    public void setBruksnavn(String bruksnavn){
        this.bruksnavn = bruksnavn;
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

    public String eiendomsID(){
        return kommunenr + "-" + gnr + "/" + bnr;
    }
    @Override
    public String toString(){
        return kommunenavn + " | " + kommunenr + " | " + gnr + " | " + bnr + " | " + (bruksnavn != null ? " | " + bruksnavn : "") + " | " + areal + " | " + eier;
    }

}