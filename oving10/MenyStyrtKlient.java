package oving10;

import java.util.Scanner;

public class MenyStyrtKlient{
    public static void main(String[] args) {
        MenyRegister register = new MenyRegister();
        try(Scanner sc = new Scanner(System.in)){
            int valg;

            Rett bigMac = new Rett("Big Mac", "Hovedrett", 95, "Brød, kjøtt, ost, salat, dressing");
            Rett fish = new Rett("Fish burger", "Hovedrett", 76, "fisk, brød, salat, dressing, ketchup");
            Rett mcFlurry = new Rett("mcflurry", "dessert", 45, "melk, strøssel");
            Rett salat = new Rett("Kyllingsalat", "Forrett", 95, "salat, grønnsaker, dressing, kylling");

            register.addRett(fish);
            register.addRett(bigMac);
            register.addRett(mcFlurry);
            register.addRett(salat);

            Meny lunsjmeny = new Meny("Lunsjmeny");
            Meny middagsmeny = new Meny("Middagsmeny");
            Meny dessertmeny = new Meny("Dessertmeny");
            

            register.addMeny(lunsjmeny);
            register.addMeny(middagsmeny);
            register.addMeny(dessertmeny);
            
            register.addRettToMeny(fish, middagsmeny);
            register.addRettToMeny(bigMac, middagsmeny);
            register.addRettToMeny(mcFlurry, dessertmeny);
            register.addRettToMeny(salat, lunsjmeny);

            do {
                System.out.println("\n--- MENY ---");
                System.out.println("1. Registrer en ny rett");
                System.out.println("2. Finn rett gitt navnet");
                System.out.println("3. Finn alle retter av en gitt type");
                System.out.println("4. Å registrere en ny meny som består av et sett med retter");
                System.out.println("5. Finn alle menyer med totalpris innenfor et gitt intervall");
                System.out.println("6. Vis alle rettene");
                System.out.println("7. Vis alle menyene med retter");
                System.out.println("0. Avslutt");
                System.out.print("Velg et alternativ: ");
                valg = sc.nextInt();
                sc.nextLine(); 

                switch (valg) {
                    case 1:
                        System.out.print("Matrett: ");
                        String navn = sc.nextLine();
                        System.out.print("Type: ");
                        String type = sc.nextLine();
                        System.out.print("Pris: ");
                        double pris = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Oppskrift: ");
                        String oppskrift = sc.nextLine();
                        System.out.print("Meny: ");
                        String menyNavn = sc.nextLine();
                        Rett nyRett = new Rett(navn, type, pris, oppskrift);
                        register.addRett(nyRett);
                        
                        break;
                    case 2:
                        System.out.print("Hvilken rett vil du finne? ");
                        String søkRett = sc.nextLine();
                        register.finnRett(søkRett);
                        break;
//legg inn tolowercase
                    case 3:
                        System.out.print("Hvilke typer retter vil du finne? ");
                        String søkType = sc.nextLine();
                        var funnet = register.finnRettMType(søkType);
                        if (funnet.isEmpty()) {
                            System.out.println("Fant ingen retter av type: " + søkType);
                        } else {
                            System.out.println("Retter av type " + søkType + ":");
                            for (Rett r : funnet) {
                                System.out.println(" - " + r);
                            }
                        }
                        break;

                    case 4:
                        System.out.print("Navn på meny: ");
                        String nyMenyNavn = sc.nextLine();
                        Meny nyMeny = new Meny(nyMenyNavn);

                        System.out.println("Legg til retter i menyen (skriv navn på rett, tom linje for å avslutte):");
                        while (true) {
                            System.out.print("Rett: ");
                            String rettNavn = sc.nextLine();
                            if (rettNavn.isBlank()) break;

                            boolean funnetRett = false;
                            for (Rett r : register.getAlleRetter()) {
                                if (r.getNavn().equalsIgnoreCase(rettNavn)) {
                                    nyMeny.leggTilRett(r);
                                    System.out.println(r.getNavn() + " lagt til i menyen.");
                                    funnetRett = true;
                                    break;
                                }
                            }
                            if (!funnetRett) {
                                System.out.println("Fant ingen rett med navn '" + rettNavn + "'.");
                            }
                        }

                        register.addMeny(nyMeny);
                        System.out.println("Meny '" + nyMenyNavn + "' registrert!");
                        break;
                    case 5:
                        System.out.print("Min pris: ");
                        double min = sc.nextDouble();
                        System.out.print("Maks pris: ");
                        double max = sc.nextDouble();
                        sc.nextLine();

                        var funnetMenyer = register.finnMenyerMedTotalpris(min, max);
                        if (funnetMenyer.isEmpty()) {
                            System.out.println("Fant ingen menyer i prisområdet.");
                        } else {
                            System.out.println("Menyer mellom " + min + " og " + max + " kr:");
                            for (Meny m : funnetMenyer) {
                                System.out.println(" - " + m + " (" + m.getTotalPris() + " kr)");
                            }
                        }
                        break;

                    case 6:
                        System.out.println("Alle retter:");
                        for (Rett a : register.getAlleRetter()){
                            System.out.println(a);
                        }
                        break;

                    case 7:
                        System.out.println("Alle menyer:");
                        for (Meny m : register.getMenyer()) {
                            System.out.println(m + " (Totalpris: " + m.getTotalPris() + " kr)");
                        }
                        break;
                    case 0:
                        System.out.println("Avslutter programmet.");
                        break;

                    default:
                        System.out.println("Ugyldig valg. Prøv igjen.");
                }
            } while (valg != 0);
        


        }
    }
    
}