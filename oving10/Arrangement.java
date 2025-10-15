package oving10;

public class Arrangement{
    private final int number;
    private final String name;
    private final String place;
    private final String aranger;
    private final String type;
    private final long time;

public Arrangement(int number, String name, String place, String aranger, String type, long time){
    this.number = number;
    this.name = name;
    this.place = place;
    this.aranger = aranger;
    this.type = type;
    this.time = time;
}

public int getNumber(){ return number;}
public String getName(){ return name;}
public String getPlace(){ return place;}
public String getAranger(){ return aranger;}
public String getType(){ return type;}
public long getTime(){ return time;}

@Override
public String toString() {
    return "\n nr: " + number + ": " + name + " - " + place + ", arrangør: " + aranger + ", type: " + type +", Tidspunkt: " + time;
}


}