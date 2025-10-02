import java.util.Scanner;

class Valuta { //En klasse kan du se på som en "oppskrift" for å lage objekter.
    String navn; //betyr at hver valuta skal ha et navn (f.eks. "Dollar").
    double kurs; //betyr at hver valuta skal ha en kurs (f.eks. 10.50 NOK for 1 dollar).

    public Valuta(String navn, double kurs) { //Dette er en konstruktør. Den brukes når vi lager et nytt Valuta-objekt.
        this.navn = navn; //sett valutaens navn til det vi sender inn.
        this.kurs = kurs; //sett valutaens kurs til det vi sender inn.
    }
}

public class ValutaKlient {  //main metoden
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);

        // Oppretter tre valutaobjekter
        Valuta dollar = new Valuta("Dollar", 10.50);
        Valuta euro = new Valuta("Euro", 11.20);
        Valuta sek = new Valuta("Svenske kroner", 1.06);

        boolean fortsett = true; //Vi lager en variabel fortsett som styrer om programmet skal fortsette å kjøre. Så lenge fortsett er true, kjører menyen igjen og igjen.

        while (fortsett) { //gjenta alt inni { } så lenge fortsett = true
            System.out.println("\nVelg valuta:");
            System.out.println("1: " + dollar.navn);
            System.out.println("2: " + euro.navn);
            System.out.println("3: " + sek.navn);
            System.out.println("4: Avslutt");

            int valg = in.nextInt();
            Valuta valgtValuta = null;

            if (valg == 1) {
                valgtValuta = dollar;
            } else if (valg == 2) {
                valgtValuta = euro;
            } else if (valg == 3) {
                valgtValuta = sek;
            } else if (valg == 4) {
                fortsett = false;
                continue;
            } else {
                System.out.println("Ugyldig valg.");
                continue;
            }

            System.out.print("Oppgi beløp i " + valgtValuta.navn + ": ");
            double belop = in.nextDouble();

            double nok = belop * valgtValuta.kurs;
            System.out.println(belop + " " + valgtValuta.navn + " = " + nok + " NOK");
        }

        System.out.println("Avslutter programmet.");
        in.close();
    }
}