import java.util.Scanner;

public class Klient {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in, "UTF-8")){
        
            while (true) {
                System.out.print("\nSkriv inn en tekst (eller 'slutt' for å avslutte): ");
                String tekst = scanner.nextLine();
                if (tekst.equalsIgnoreCase("slutt")) break;

                Tekstanalyse analyse = new Tekstanalyse(tekst);

                System.out.println("Antall forskjellige bokstaver: " + analyse.antallForskjelligeBokstaver());
                System.out.println("Totalt antall bokstaver: " + analyse.totaltAntallBokstaver());
                System.out.printf("Prosent ikke-bokstaver: %.2f %%\n", analyse.ikkeBokstaverProsent());

                System.out.print("Skriv inn en bokstav du vil sjekke: ");
                char bokstav = scanner.nextLine().charAt(0);
                System.out.println("Antall forekomster av '" + bokstav + "': " + analyse.forekomsterAvBokstav(bokstav));

                System.out.println("Bokstav(er) som forekommer oftest: " + analyse.bokstavOfte());
            }
        }
        
    }
}
