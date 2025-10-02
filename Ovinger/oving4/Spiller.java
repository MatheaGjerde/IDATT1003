import java.util.Random;

public class Spiller {
    private int sumPoeng = 0;   // poengsummen til spilleren
    private Random terning = new Random();

    // returnerer poengsummen
    public int getSumPoeng() {
        return sumPoeng;
    }

    // sjekker om spilleren har nådd eller passert 100
    public boolean erFerdig() {
        return sumPoeng == 100;
    }

    // kaster terningen og oppdaterer poengsummen
    // raffinert versjon (må lande på akkurat 100)
    public void kastTerningen() {
        int kast = terning.nextInt(6)+1;
        System.out.println("Kast: " + kast);

        if (kast == 1) {
            sumPoeng = 0;
        } else {
            if (sumPoeng + kast > 100) {
                // hvis vi overskrider 100, trekk fra isteden
                sumPoeng -= kast;
            } else {
                sumPoeng += kast;
            }
        }
    }
}
