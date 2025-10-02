import java.util.Random;

public class Lokke { //klasse-definisjon
    public static void main(String[] args){ //main-metoden
        Random random = new Random(); // objekt av typen random, new random() kaller på konstruktøren til random-klassen
        int antallGjennomlop = 1000; //heltallsvariabel
        int[] antall = new int[10]; // array, teller fra tallene 0 til 9

        for (int i = 0; i < antallGjennomlop; i++){
            int tall = random.nextInt(10); // metodekall, tilfeldige tall 0 til 9 i valgt antallGjennomlop
            antall[tall]++; //øk teller for det tallet
        }
    
        System.out.println("Resultater for " + antallGjennomlop + " trekninger:\n");
        for (int i = 0; i < antall.length; i++){
            int forekomster = antall[i]; //lagrer hvor mange ganger tallet dukket opp.
            int antStjerner = (int) Math.round(forekomster / 10.0); //beregner hvor mange stjerner som skal vises

            System.out.print(i + " " + forekomster + " ");
            for (int j = 0; j < antStjerner; j++){ //skriver ut stjernene for antall stjerner som skal vises
                System.out.print("*");
            }
            System.out.println();
        }
    }
}