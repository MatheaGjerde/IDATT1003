package oving10;

import java.util.ArrayList;
import java.util.List;

public class MenyRegister{
    private final List<Meny> menyer;
    private final List<Rett> alleRetter;

    public MenyRegister(){
        menyer = new ArrayList<>();
        alleRetter = new ArrayList<>();
    }
    public List<Meny> getMenyer(){return menyer; }

    public List<Rett> getAlleRetter(){return alleRetter; }

    public void addRett(Rett a){
        alleRetter.add(a);
    }
    public void addMeny(Meny b){
        menyer.add(b);
    }
    public void addRettToMeny(Rett r, Meny m){
        if (alleRetter.contains(r) && menyer.contains(m)){
            m.leggTilRett(r);
        }
    }
}