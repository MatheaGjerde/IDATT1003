package oving10;

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

            
            for (Rett a : register.getAlleRetter()){
                System.out.println(a);
            }
            System.out.println("------------------------");
            for (Meny b : register.getMenyer()){
                System.out.println(b);
            }

    }
}