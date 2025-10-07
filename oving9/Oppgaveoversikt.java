package oving9;

public class Oppgaveoversikt{
    private Student[] studenter;
    private int antStud = 0;

public Oppgaveoversikt(int maksAntStudenter){
    studenter = new Student[maksAntStudenter];
}
public int getAntStud(){
    return antStud;
}
public int getAntOppgForStudent(String navn){
    for (int i = 0; i < antStud; i++){
        if (studenter[i].getNavn().equalsIgnoreCase(navn)){
            return studenter[i].getAntOppg();
        }
    }
    return -1;
}
public void registrerStudent(String navn, int antOppg){
    studenter[antStud] = new Student(navn, antOppg);
    antStud++;
}
public void okOppgForStudent(String navn, int okning){
    for (int i = 0; i < antStud; i++)
        if (studenter[i].getNavn().equalsIgnoreCase(navn)) {
            studenter[i].okAntOppg(okning);
            return;
        }
}

@Override
public String toString(){
    String ut = "Antall studenter: " + antStud + "\n";
    for (int i = 0; i < antStud; i++) {
        ut += studenter[i].toString() + "\n";
    }
    return ut;
}
}