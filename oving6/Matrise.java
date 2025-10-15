
public class Matrise {
    private final double[][] balances;
    
    public Matrise(double[][] balances){ //kontruktøren tar inn en todimensjonal array
        int rader = balances.length; //teller hvor mange rader det er
        int kolonner = balances[0].length; //teller hvor mange kolonner det er i første rad
        this.balances = new double[rader][kolonner]; //lager en ny kopi av matrisen
        for(int i = 0; i < rader; i++){
            for(int j = 0; j < kolonner; j++){
                this.balances[i][j] = balances[i][j];
            }
        }

    }
    public int getRader(){ //returnerer antall rader
        return balances.length;
    }
    public int getKolonner(){ //returnerer antall kolonner
        return balances[0].length; 
    }
    //addisjon
    public Matrise add(Matrise annen){ //tar inn en matrise annen
        double[][] resultat = new double[getRader()][getKolonner()];
        for (int i = 0; i < getRader(); i++) {
            for (int j = 0; j < getKolonner(); j++) {
                resultat[i][j] = balances[i][j] + annen.balances[i][j];
            }
        }
        return new Matrise(resultat);
    }
    //multiplikasjon
    public Matrise multiply(Matrise annen){
        double[][] resultat = new double[getRader()][annen.getKolonner()]; //antall rader fra A og antall kollonner fra B
        for (int i = 0; i < getRader(); i++) {
            for (int j = 0; j < annen.getKolonner(); j++) {
                double summen = 0;
                for (int k = 0; k < getKolonner(); k++) {
                    summen += balances[i][k] * annen.balances[k][j]; //for hver posisjon (i,j), ganger radene i A med kollonene i B, og summerer de
                }
                resultat[i][j] = summen;
            }
        }
        return new Matrise(resultat);
    }
    //Transponering
    public Matrise transponering(){
        double[][] resultat = new double[getKolonner()][getRader()];
        for (int i = 0; i < getRader(); i++) {
            for (int j = 0; j < getKolonner(); j++) {
                resultat[j][i] = balances[i][j];
            }
        }
        return new Matrise(resultat);
    }
    //toString for utskrift
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); //bruker stringbuilder til å lage tekstrepresentasjon av matrisen
        for (double[] rad : balances) {
            for (double verdi : rad) {
                sb.append(String.format("%8.1f", verdi));
            }
            sb.append("\n"); //ordner linjeskift
        }
        return sb.toString(); //returnerer en streng
    }
}
