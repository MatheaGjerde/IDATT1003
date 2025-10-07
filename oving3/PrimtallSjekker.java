package oving3;
import java.util.Scanner;

public class PrimtallSjekker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Hvor mange tall vil du analysere?: ");
        int antall = in.nextInt();

        for (int j = 0; j < antall; j++) {
            System.out.print("Skriv inn et tall: ");
            int tall = in.nextInt();
                if (tall<=1) {
                    System.out.println(tall + " er ikke et primtall."); // 0 og 1 er ikke primtall
                    continue;
            }
                boolean erPrimtall = true;
                for (int i = 2; i < tall; i++){ // Tallet kan deles med i, ikke primtall
                    if (tall % i == 0) {
                        erPrimtall = false;
                        break;
                }
            }
                if (erPrimtall) {
                    System.out.println(tall + " er et primtall.");
                }else{
                     System.out.println(tall + " er ikke et primtall.");
                }     
        }
        in.close();
    }
    
}