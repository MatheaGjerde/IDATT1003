package oving11;

import java.util.ArrayList;
import java.util.List;



public class EiendomRegister{
    private final List<Eiendommer> eiendommer;

    public EiendomRegister(){
        eiendommer = new ArrayList<>();
    }
    public List<Eiendommer> getEiendommer(){ return eiendommer; }

    public void addEiendom(Eiendommer a){eiendommer.add(a);}

    //lager en iterator som lar meg gå gjennom et element av gangen.
    public boolean slettEiendom(int kommunenr, int gnr, int bnr){
        for (Eiendommer e : eiendommer){
            if (e.getKommunenr() == kommunenr && e.getGnr() == gnr && e.getBnr() == bnr){
                eiendommer.remove(e);
                return true;
            }
        }
        return false;
    }
    
    //teller antall eiendommer
    public int antallEiendommer(){
        return eiendommer.size();
    }

    //finner eiendommer
    public Eiendommer finnEiendom(int kommunenr, int gnr, int bnr){
        String sokID = kommunenr + "-" + gnr + "/" + bnr;

        for (Eiendommer e : eiendommer){
            if (e.eiendomsID().equals(sokID)){
                return e;
            }
        }
        return null;
    }
    public double gjennomsnittsAreal(){
        if (eiendommer.isEmpty()){
            return 0;
        }
        double sum = 0;
        for (Eiendommer e : eiendommer){
            sum += e.getAreal();
        }
        return sum / eiendommer.size();
    }
    public List<Eiendommer> finnEiendommerMedGnr(int gnr){
        List<Eiendommer> resultat = new ArrayList<>();
        for (Eiendommer e : eiendommer){
            if (e.getGnr() == gnr){
                resultat.add(e);
            }
        }
        return resultat;
    }

}