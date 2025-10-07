package oving2;

public class Kilopris{
    public static void main(String[] args){
        double kilo = 1000;
        double gramA = 450 / kilo;
        double gramB = 500 / kilo;
        double kprisa = 35.9 / gramA;
        double kprisb = 39.5 / gramB;
        System.out.println("kiloprisen til kjøttdeig A er " + kprisa + " og kiloprisen til kjøttdeig B er " + kprisb);

        if (kprisa < kprisb){
            System.out.println("Kjøttdeig A er billigst.");
        }
        else{
            System.out.println("Kjøttdeig B er billigst.");
        }

    }
}
