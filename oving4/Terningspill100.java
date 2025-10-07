public class Terningspill100 {
    public static void main(String[] args) {
        Spiller spillerA = new Spiller();
        Spiller spillerB = new Spiller();

        int runde = 1;

        while (!spillerA.erFerdig() && !spillerB.erFerdig()) {
            System.out.println("\nRunde " + runde);

            System.out.print("Spiller A kaster: ");
            spillerA.kastTerningen(); 
            System.out.println("Spiller A poeng: " + spillerA.getSumPoeng());

            System.out.print("Spiller B kaster: ");
            spillerB.kastTerningen();
            System.out.println("Spiller B poeng: " + spillerB.getSumPoeng());

            runde++;
        }

        if (spillerA.erFerdig() && spillerB.erFerdig()) {
            System.out.println("Uavgjort! Begge nådde 100 samtidig.");
        } else if (spillerA.erFerdig()) {
            System.out.println("Spiller A vant!");
        } else {
            System.out.println("Spiller B vant!");
        }
    }
}