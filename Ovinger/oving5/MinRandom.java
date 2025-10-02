import java.util.Random;

public class MinRandom {
    private Random rd; //Objektvariabel

    public MinRandom() { //konstruktør
        rd = new Random(); //opretter objektet
    }
    // Returnerer et tilfeldig heltall i intervallet [nedre, ovre)
    public int nesteHeltall(int nedre, int ovre) {
        return rd.nextInt(nedre, ovre);
    }
    // Returnerer et tilfeldig desimaltall i intervallet [nedre, ovre)
    public double nesteDesimaltall(double nedre, double ovre) {
        return rd.nextDouble(nedre, ovre);
    }
    // Testprogram
    public static void main(String[] args) {
        MinRandom mr = new MinRandom();

        System.out.println("Tilfeldige heltall i intervallet [10, 20):");
        for (int i = 0; i < 10; i++) {
            System.out.print(mr.nesteHeltall(10, 20) + " ");
        }

        System.out.println("\n\nTilfeldige desimaltall i intervallet [0.0, 1.0):");
        for (int i = 0; i < 10; i++) {
            System.out.print(mr.nesteDesimaltall(0.0, 1.0) + " ");
        }
    }
}