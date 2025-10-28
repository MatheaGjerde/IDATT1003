package oving10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrangementRegister{
    private final List<Arrangement> arrangementer;

    public ArrangementRegister(){
        arrangementer = new ArrayList<>();
    }
    public List<Arrangement> getArrangementer() {
        return arrangementer;
    }
    public void addArrangement(Arrangement a){
        arrangementer.add(a);
    }
    public void allArrangementPlace(String place){
        for (Arrangement a : arrangementer){
            if (a.getPlace().equalsIgnoreCase(place)){
                System.out.println(a);
            }
        }
    }
    public void allDates(long date){
        for (Arrangement a : arrangementer){
            if (a.getTime()/10000 == date){
                System.out.println(a);
            }
        }
    }
    public void findInterval(long fraTid, long tilTid) {
    List<Arrangement> result = new ArrayList<>();
    for (Arrangement a : arrangementer) {
        if (a.getTime() >= fraTid && a.getTime() <= tilTid) {
            result.add(a);
        }
    }
    result.sort(Comparator.comparingLong(Arrangement::getTime));
    
    for (Arrangement a : result) {
        System.out.println(a);
    }
    
}
// Sorter etter sted
    public List<Arrangement> sortByPlace() {
        List<Arrangement> result = new ArrayList<>(arrangementer);
        Collections.sort(result, Comparator.comparing(Arrangement::getPlace));
        return result;
    }

// Sorter etter type
    public List<Arrangement> sortByType() {
        List<Arrangement> result = new ArrayList<>(arrangementer);
        Collections.sort(result, Comparator.comparing(Arrangement::getType));
        return result;
    }

// Sorter etter tidspunkt
    public List<Arrangement> sortByTime() {
        List<Arrangement> result = new ArrayList<>(arrangementer);
        Collections.sort(result, Comparator.comparingLong(Arrangement::getTime));
        return result;
    }

}