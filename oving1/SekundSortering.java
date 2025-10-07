package oving1;

import java.util.Scanner;

public class SekundSortering {
public static void main(String[] args) {
        System.out.println("Hvor mange sekunder vil du beregne?");
        Scanner scannerIn = new Scanner(System.in);
        int sekunder = scannerIn.nextInt();
        int timer = sekunder/3600;
        int restt = sekunder%3600;
        int minutter = restt/60;
        int rests = minutter%60;
        
        System.out.println(sekunder + " sekunder er lik: " + timer + " t, " + minutter + " min, og " + rests + " sek.");
        scannerIn.close();
    } 
    
}