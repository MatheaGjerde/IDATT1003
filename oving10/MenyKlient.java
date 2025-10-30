package oving10;

import java.util.List;

public class MenyKlient{
    public static void main(String[] args) {
        MenyRegister register = new MenyRegister();

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

            System.out.println("Alle retter: ");
            for (Rett a : register.getAlleRetter()){
                System.out.println(a);
            }
            System.out.println("------------------------");
            for (Meny b : register.getMenyer()){
                System.out.println(b);
            }


            System.out.println("\n Finn rett med navn:");
            register.finnRett("Big Mac");

            System.out.println("\n Finn rett med Type: ");
            List<Rett> desserter = register.finnRettMType("Hovedrett");

            if (desserter.isEmpty()) {
                System.out.println("Fant ingen desserter");
            } else {
                for (Rett r : desserter) {
                    System.out.println(r);
                }
            }

            System.out.println("\nFinn menyer med totalpris: ");
            List<Meny> mellom100og200 = register.finnMenyerMedTotalpris(100, 200);

            if (mellom100og200.isEmpty()) {
                System.out.println("Fant ingen menyer mellom 100 og 200 kr.");
            } else {
                for (Meny m : mellom100og200) {
                    System.out.println(m.getMenyNavn() + " - totalpris: " + m.getTotalPris() + " kr");
                }
            }
                
    }
}