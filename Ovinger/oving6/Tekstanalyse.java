
public class Tekstanalyse{ 
    private int[] antallTegn = new int[30]; //objektvariabel, array med 30 plasser, 0-28: a-å, 29: andre tegn
    private final String alfabet = "abcdefghijklmnopqrstuvwxyzæøå";//private final String alfabet = "abcdefghijklmnopqrstuvwxyzæøå"; // streng som inneholder hele alfabetet, brukes for å finne hvilken indeks en bokstav skal lagres på i arrayet.

    public Tekstanalyse(String tekst) {  //Konstruktøren, tar inn en tekstsreng når objektet opprettes.
        tekst = tekst.toLowerCase(); //gjør hele strengen små bokstaver slik at A og a telles likt
        for (int i = 0; i < tekst.length(); i++) { //løkke som går gjennom hele teksten tegn for tegn
            char c = tekst.charAt(i); //hent tegnet på posisjon i
            char oo = 'å';
            if (c >= 'a' && c <= 'z') {
                antallTegn[c - 'a']++;
            } else if (c == 'æ') {
                antallTegn[26]++;
            } else if (c == 'ø') {
                antallTegn[27]++;
            } else if (c == oo) {
                antallTegn[28]++;
            } else {
                antallTegn[29]++;
            }
        }
    }
    // metode, Finn antall forskjellige bokstaver
    public int antallForskjelligeBokstaver() {
        int teller = 0;
        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] > 0) {
                teller++;
            }
        }
        return teller;
    }
    // Finn totalt antall bokstaver
    public int totaltAntallBokstaver() {
        int sum = 0;
        for (int i = 0; i < 29; i++) {
            sum += antallTegn[i];
        }
        return sum;
    }
    // Hvor stor del (prosent) av teksten er ikke bokstaver?
    public double ikkeBokstaverProsent() {
        int sumAlle = totaltAntallBokstaver() + antallTegn[29];
        if (sumAlle == 0) return 0; 
        return 100.0 * antallTegn[29] / sumAlle;
    }
    // Antall forekomster av en bestemt bokstav
    public int forekomsterAvBokstav(char bokstav) {
        bokstav = Character.toLowerCase(bokstav);
        if (bokstav >= 'a' && bokstav <= 'z') {
            return antallTegn[bokstav - 'a'];
        } else if (bokstav == 'æ') {
            return antallTegn[26];
        } else if (bokstav == 'ø') {
            return antallTegn[27];
        } else if (bokstav == 'å') {
            return antallTegn[28];
        } else {
            return 0;
        }
    }
    // Hvilken bokstav (eller flere) forekommer oftest?
    public String bokstavOfte() {
        int maks = 0;
        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] > maks) {
                maks = antallTegn[i];
            }
        }
            //Stringbuilder
        StringBuilder resultat = new StringBuilder();
        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] == maks) {
                if (resultat.length() > 0){
                    resultat.append(", ");
                }
                resultat.append(alfabet.charAt(i));
            }
        }

        return resultat.toString();     
    }
}

