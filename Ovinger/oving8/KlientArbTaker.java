package oving8;

public class KlientArbTaker{
    public static void main(String[] args){
        Person p = new Person("Mathea", "Gjerde", 2005);
        ArbTaker arb = new ArbTaker(p,12345, 2018, 45000, 30);
        // Tester metodene
        System.out.println("Navn: " + arb.navn());
        System.out.println("Fødselsår: " + arb.getPersonalia().getFodselsaar());
        System.out.println("Alder: " + arb.alder() + " år");

        System.out.println("Ansattnummer: " + arb.getArbtakernr());
        System.out.println("Ansatt siden: " + arb.getAnsettelsesaar());
        System.out.println("Antall år ansatt: " + arb.antallAarAnsatt());
        System.out.println("Ansatt mer enn 3 år? " + arb.ansattMerEnn(3));

        System.out.println("Månedslønn: " + arb.getMaanedslonn() + " kr");
        System.out.println("Skatteprosent: " + arb.getSkatteprosent() + " %");
        System.out.println("Skattetrekk per måned: " + arb.skattPerMaaned() + " kr");
        System.out.println("Bruttolønn per år: " + arb.bruttolonn() + " kr");
        System.out.println("Skattetrekk per år (10,5 mnd): " + arb.skattetrekkAar() + " kr");

        // Oppdatere verdier med set-metodene
        arb.setMaanedslonn(50000);
        arb.setSkatteprosent(32);

        System.out.println("\nEtter oppdatering:");
        System.out.println("Ny månedslønn: " + arb.getMaanedslonn() + " kr");
        System.out.println("Ny skatteprosent: " + arb.getSkatteprosent() + " %");
        System.out.println("Ny skatt per måned: " + arb.skattPerMaaned() + " kr");
    }
    
}