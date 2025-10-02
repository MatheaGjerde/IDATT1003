package oving8;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ArbTaker{
    Person personalia;
    long arbtakernr;
    int ansettelsesaar;
    double maanedslonn;
    double skatteprosent;

public ArbTaker(Person personalia, long arbtakernr, int ansettelsesaar, double maanedslonn, double skatteprosent){
    this.personalia = personalia;
    this.arbtakernr = arbtakernr;
    this.ansettelsesaar = ansettelsesaar;
    this.maanedslonn = maanedslonn;
    this.skatteprosent = skatteprosent;
}

public Person getPersonalia(){
    return personalia;
}
public long getArbtakernr(){
    return arbtakernr;
}
public int getAnsettelsesaar(){
    return ansettelsesaar;
}
public double getMaanedslonn(){
    return maanedslonn;
}
public double getSkatteprosent(){
    return skatteprosent;
}

public void setMaanedslonn(double nyMaanedslonn){
    maanedslonn = nyMaanedslonn;
}
public void setSkatteprosent(double nySkatteprosent){
    skatteprosent = nySkatteprosent;
}
public double skattPerMaaned(){
    return maanedslonn * (skatteprosent / 100);
}
public double bruttolonn(){
    return maanedslonn * 12;
}
public double skattetrekkAar(){
    double enmaaned = skattPerMaaned();
    return enmaaned * 10.5;
}
public String navn(){
    return personalia.getEtternavn() + ", " + personalia.getFornavn();
}
public int alder(){
    GregorianCalendar kalender = new GregorianCalendar();
    int aar = kalender.get(Calendar.YEAR);
    return aar - personalia.getFodselsaar();
}
public int antallAarAnsatt(){
    GregorianCalendar kalender = new GregorianCalendar();
    int aar = kalender.get(Calendar.YEAR);
    return aar - getAnsettelsesaar();
}
public boolean ansattMerEnn(int antallAar){
    return antallAarAnsatt() > antallAar;
}

}
