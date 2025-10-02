package oving3;
import java.util.Scanner;

public class Multiplikasjonstabellen{
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        
        System.out.print("Skriv inn start-gangen: ");
        int start = In.nextInt();

        System.out.print("Skriv inn slutt-gangen: ");
        int slutt = In.nextInt();

        int tall = start;
        while (tall <= slutt) {
            System.out.println("\n" + tall + "-gangen:");
            
            int i = 1;
            int resultat = 0;
            while(i <= 10) {
                resultat = tall*(i);
                System.out.println(tall + " x " + i + " = " + resultat);
                i++;
            }
            tall++;
        }
        In.close();
    }
}