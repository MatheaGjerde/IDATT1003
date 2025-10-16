package oving10;

import java.util.Scanner;

public class ArrangementKlient{
    public static void main(String[] args){
        ArrangementRegister register = new ArrangementRegister();
        Scanner sc = new Scanner(System.in);
        int valg;

        register.addArrangement(new Arrangement(1, "Konsert", "Oslo", "Astrid", "Musikk", 202510151900L));
        register.addArrangement(new Arrangement(2, "Teater", "Bergen", "Lindgren", "Drama", 202510161800L));
        register.addArrangement(new Arrangement(3, "Konsert", "Trondheim", "Asbjørnsen", "Musikk", 202510051600L));
        register.addArrangement(new Arrangement(4, "Stand up", "Oslo", "Moe", "fremføring", 202510161900L));

        do {
            System.out.println("\n--- MENY ---");
            System.out.println("1. Registrer nytt arrangement");
            System.out.println("2. Finn arrangementer på sted");
            System.out.println("3. Finn arrangementer på dato");
            System.out.println("4. Finn arrangementer innen tidsintervall");
            System.out.println("5. Vis alle arrangementer sortert");
            System.out.println("6. Vis alle arrangementer");
            System.out.println("0. Avslutt");
            System.out.print("Velg et alternativ: ");
            valg = sc.nextInt();
            sc.nextLine(); // for å lese linjeskift etter nextInt()

            switch (valg) {
                case 1:
                    System.out.print("Nummer: ");
                    int number = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Navn: ");
                    String name = sc.nextLine();
                    System.out.print("Sted: ");
                    String place = sc.nextLine();
                    System.out.print("Arrangør: ");
                    String aranger = sc.nextLine();
                    System.out.print("Type: ");
                    String type = sc.nextLine();
                    System.out.print("Tidspunkt (YYYYMMDDHHMM): ");
                    long time = sc.nextLong();
                    sc.nextLine();
                    register.addArrangement(new Arrangement(number, name, place, aranger, type, time));
                    System.out.println("Arrangement lagt til!");
                    break;

                case 2:
                    System.out.print("Skriv inn sted: ");
                    String søktSted = sc.nextLine();
                    register.allArrangementPlace(søktSted);
                    break;

                case 3:
                    System.out.print("Skriv inn dato (YYYYMMDD): ");
                    long søktDato = sc.nextLong();
                    sc.nextLine();
                    register.allDates(søktDato);
                    break;

                case 4:
                    System.out.print("Fra tidspunkt (YYYYMMDDHHMM): ");
                    long fraTid = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Til tidspunkt (YYYYMMDDHHMM): ");
                    long tilTid = sc.nextLong();
                    sc.nextLine();
                    register.findInterval(fraTid, tilTid);
                    break;

                case 5:
                    System.out.println("Sortert etter sted:");
                    for (Arrangement a : register.sortByPlace()) {
                        System.out.println(a);
                    }
                    System.out.println("\nSortert etter type:");
                    for (Arrangement a : register.sortByType()) {
                        System.out.println(a);
                    }
                    System.out.println("\nSortert etter tid:");
                    for (Arrangement a : register.sortByTime()) {
                        System.out.println(a);
                    }
                    break;
                case 6: 
                    System.out.println("\nListe over alle arrangementer");
                    for (Arrangement a : register.getArrangementer()){
                        System.out.println(a);
                    }

                case 0:
                    System.out.println("Avslutter programmet.");
                    break;

                default:
                    System.out.println("Ugyldig valg. Prøv igjen.");
            }
        } while (valg != 0);

        sc.close();
    
    }
}