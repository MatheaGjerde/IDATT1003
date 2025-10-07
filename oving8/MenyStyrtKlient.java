package oving8;
import java.util.Scanner;

public class MenyStyrtKlient{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Person p = new Person("Mathea", "Gjerde", 2005);
        ArbTaker arb = new ArbTaker(p,12345, 2018, 45000, 30);
        // Tester metodene
         boolean kjører = true;

        while (kjører) {
            System.out.println("\n--- Meny ---");
            System.out.println("1: Endre månedslønn");
            System.out.println("2: Endre skatteprosent");
            System.out.println("3: Vis all info");
            System.out.println("4: Avslutt");
            System.out.print("Velg et alternativ: ");
            int valg = scanner.nextInt();

            if (valg == 1){
                System.out.print("Skriv inn ny månedslønn: ");
                double nyLonn = scanner.nextDouble();
                arb.setMaanedslonn(nyLonn);
                System.out.println("Ny månedslønn: " + arb.getMaanedslonn());
            }else if (valg == 2){
                System.out.print("Skriv inn ny skatteprosent: ");
                double nySkatt = scanner.nextDouble();
                arb.setSkatteprosent(nySkatt);
                System.out.println("Ny skatteprosent: " + arb.getSkatteprosent());
            }else if (valg == 3){
                System.out.println("\n--- Informasjon om arbeidstaker ---");
                System.out.println("Navn: " + arb.navn());
                System.out.println("Fødselsår: " + arb.getPersonalia().getFodselsaar());
                System.out.println("Alder: " + arb.alder());
                System.out.println("Ansattnummer: " + arb.getArbtakernr());
                System.out.println("Ansatt siden: " + arb.getAnsettelsesaar());
                System.out.println("Antall år ansatt: " + arb.antallAarAnsatt());
                System.out.println("Månedslønn: " + arb.getMaanedslonn());
                System.out.println("Skatteprosent: " + arb.getSkatteprosent());
                System.out.println("Skatt per måned: " + arb.skattPerMaaned());
                System.out.println("Bruttolønn per år: " + arb.bruttolonn());
                System.out.println("Skattetrekk per år (10,5 mnd): " + arb.skattetrekkAar());
            }else if (valg == 4){
                kjører = false;
                System.out.println("Program avsluttes.");
            }else{
                System.out.println("Ugyldig valg, prøv igjen.");
            }
        }

        scanner.close();
    }
}