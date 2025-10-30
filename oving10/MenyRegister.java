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
    
    //å registrere en ny rett
    public void addRett(Rett a){alleRetter.add(a);}
    // å registrere en ny meny
    public void addMeny(Meny b){menyer.add(b);}
    
    //legger til retter i menyen
    public void addRettToMeny(Rett r, Meny m){
        if (alleRetter.contains(r) && menyer.contains(m)){
            m.leggTilRett(r);
        }
    }
    //Å finne en rett gitt navnet
    public void finnRett(String navn){
        for (Rett a : alleRetter){
            if (a.getNavn().equalsIgnoreCase(navn)){
                System.out.println(a);
                return;
            }
        }
        System.out.println("Fant ingen retter ved navn: " + navn);
    }
    // Å finne alle retter av en gitt type
    public List<Rett> finnRettMType(String type){
        List<Rett> funnet = new ArrayList<>();
        for (Rett b : alleRetter){
            if (b.getType().equalsIgnoreCase(type)){
                funnet.add(b);
            }
        }
        return funnet;
    }

    //Å finne alle menyer med totalpris innenfor et gitt intervall
    public List<Meny> finnMenyerMedTotalpris(double min, double max) {
    List<Meny> funnet = new ArrayList<>();

    for (Meny m : menyer) {
        double total = m.getTotalPris();
        if (total >= min && total <= max) {
            funnet.add(m);
        }
    }
    return funnet;
    }

}