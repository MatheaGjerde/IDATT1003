public class Brok { //klasse-definisjon, representerer en brøk med teller og nevner
    private int teller; //private betyr at de kan kun brukes inni klassen, ikke utenfra
    private int nevner;


    public Brok(int teller, int nevner) { //konstruktør, spesialmetode som brukes når man lager et nytt objekt med new brok(...)
        //Konstruktøren tar både teller og nevner. Den sjekker også at nevner != 0 og kaller forkort().
        if (nevner == 0) {
            throw new IllegalArgumentException("Nevner kan ikke være 0.");
        }
        this.teller = teller;
        this.nevner = nevner;
        forkort();
    }
    public Brok(int teller) { //konstruktør
        //konstruktøren er en overlastet konstruktør (overloading), som bare tar teller og setter nevner til 1.
        this(teller, 1);
    }
    public int getTeller() { //getmetode, de gir lesetilgang til private variabler
        return teller;
    }
    public int getNevner() { //getmetode
        return nevner;
    }
    public void addisjon(Brok annen) { //offentlig metode
        this.teller = this.teller * annen.nevner + annen.teller * this.nevner;
        this.nevner = this.nevner * annen.nevner;
        forkort();
    }
    public void subtraksjon(Brok annen) { //offentlig metode
        this.teller = this.teller * annen.nevner - annen.teller * this.nevner;
        this.nevner = this.nevner * annen.nevner;
        forkort();
    }
    public void multiplikasjon(Brok annen) { //offentlig metode
        this.teller = this.teller * annen.teller;
        this.nevner = this.nevner * annen.nevner;
        forkort();
    }
    public void divisjon(Brok annen) { //offentlig metode
        if (annen.teller == 0) {
            throw new IllegalArgumentException("Kan ikke dividere med 0.");
        }
        this.teller = this.teller * annen.nevner;
        this.nevner = this.nevner * annen.teller;
        forkort();
    }
    private void forkort() { //privat hjelpe/støttemetode
        int divisor = fellesDivisor(Math.abs(teller), Math.abs(nevner));
        teller /= divisor;
        nevner /= divisor;

        if (nevner < 0) {
            teller = -teller;
            nevner = -nevner;
        }
    }
    private int fellesDivisor(int a, int b) { //privat hjelpe/støttemetode
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public String toString() { //metode overstyring
        if (nevner == 1) {
            return String.valueOf(teller);
        }
        return teller + "/" + nevner;
    }
    public static void main(String[] args) { //testkode, kjører programmet
        Brok b1 = new Brok(1, 2);   // 1/2
        Brok b2 = new Brok(3, 4);   // 3/4
        Brok b3 = new Brok(5);

        System.out.println("Start:");
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        b3.addisjon(b2);
        System.out.println("b3 + b2 = " + b3);
        b1.addisjon(b2);
        System.out.println("b1 + b2 = " + b1);

        b1 = new Brok(1, 2);
        b3 = new Brok(5);
        b3.subtraksjon(b2);
        System.out.println("b3 - b2 = " + b3);
        b1.subtraksjon(b2);
        System.out.println("1/2 - 3/4 = " + b1);

        b1 = new Brok(1, 2);
        b1.multiplikasjon(b2);
        System.out.println("1/2 * 3/4 = " + b1);

        b1 = new Brok(1, 2);
        b1.divisjon(b2);
        System.out.println("1/2 ÷ 3/4 = " + b1);
    }
}