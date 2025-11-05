package oving11;

import java.util.List;
import java.util.Scanner;

public class MenyStyrtKlient{
    public static void main(String[] args){
        EiendomRegister register = new EiendomRegister();
        try(Scanner sc = new Scanner(System.in)){
            int valg;

            register.addEiendom(new Eiendommer("Gloppen", 1445, 77, 631, 1017.6, "Jens Olsen"));
            register.addEiendom(new Eiendommer("Gloppen", 1445, 77, 131, "Syningom", 661.3, "Nicolay Madsen"));
            register.addEiendom(new Eiendommer("Gloppen", 1445,75,19,"Fugletun",650.6,"Evilyn Jensen"));

            do {
                System.out.println("\n--- Property Register Application v0.1 ---\n");
                System.out.println("1. Legg til eiendom");
                System.out.println("2. Liste av eiendommene");
                System.out.println("3. Søk eiendom");
                System.out.println("4. Gjennomsnittlig areal av alle eiendommene");
                System.out.println("5. Søk etter eiendom med gårdsnummer");
                System.out.println("0. Quit");
                System.out.print("\n Skriv et tall mellom 1 and 5, 0 for å avslutte.\n");
                valg = sc.nextInt();
                sc.nextLine(); // for å lese linjeskift etter nextInt()

                switch (valg) {
                    case 1 -> {
                        System.out.print("Kommunenavn: ");
                        String kommunenavn = sc.nextLine();
                        System.out.print("Kommunenr: ");
                        int kommunenr = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Gårdsnummer: ");
                        int gnr = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Bruksnummer: ");
                        int bnr = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Bruksnavn: ");
                        String bruksnavn = sc.nextLine();
                        System.out.print("Areal: ");
                        double areal = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Eier: ");
                        String eier = sc.nextLine();

                        register.addEiendom(new Eiendommer(kommunenavn, kommunenr, gnr, bnr, bruksnavn, areal, eier));
                        System.out.println("Eiendom lagt til!");
                    }
                    case 2 -> { 
                        System.out.println("\nListe over alle Eiendommer");
                        for (Eiendommer a : register.getEiendommer()){
                            System.out.println(a);
                        }
                    }
                    case 3 -> {
                        System.out.print("Skriv inn kommunenr, gner og bnr: ");
                        System.out.println("kommunenr: ");
                        int kommunenr1 = sc.nextInt();
                        System.out.println("Gårdsnr:");
                        int gnr1 = sc.nextInt();
                        System.out.println("Bruksnr: ");
                        int bnr1 = sc.nextInt();
                        sc.nextLine();
                        Eiendommer funnet = register.finnEiendom(kommunenr1, gnr1, bnr1);
                        if (funnet != null){
                            System.out.println("Fant eiendom: " + funnet);
                        }else{
                            System.out.println("Fant ingen eiendom med disse tallene.");
                        }
                    }

                    case 4 -> {
                        System.out.println("Gjennomsnittsareal av alle eiendommene: ");
                        System.out.println(register.gjennomsnittsAreal());
                    }
                    case 5 -> {
                        System.out.print("Skriv inn gårdsnummer: ");
                        int sokGnr = sc.nextInt();
                        sc.nextLine();
                        List<Eiendommer> resultat = register.finnEiendommerMedGnr(sokGnr);
                        if (resultat.isEmpty()) {
                            System.out.println("Ingen eiendommer med gårdsnummer " + sokGnr);
                        } else {
                            System.out.println("Eiendommer med gårdsnummer " + sokGnr + ":");
                            for (Eiendommer e : resultat) {
                                System.out.println(e);
                            }
                        }
                    }
                    case 0 -> System.out.println("Avslutter programmet.");

                    default -> System.out.println("Ugyldig valg. Prøv igjen.");
                }
            } while (valg != 0);
        }

        
    
    }
}