package oving7;

public class Tekstbehandling{
    
    private int[] antallTegn = new int[27];
    private String tekst;
    private final String original;

    public String getTekst() { // henter ut strengen
        return tekst;
    }

    public Tekstbehandling(String tekst) {  //Konstruktøren, tar inn en tekstsreng når objektet opprettes.
        this.original = tekst;
        this.tekst = tekst.toLowerCase(); //gjør hele strengen små bokstaver slik at A og a telles likt
        for (int i = 0; i < tekst.length(); i++) { //løkke som går gjennom hele teksten tegn for tegn
            char c = tekst.charAt(i); 
            if (c >= 'a' && c <= 'z') {
                antallTegn[c - 'a']++;
            }else{
                antallTegn[26]++;
            }
        }
    }
    public int totaltAntallOrd() {
        String[] ord = tekst.trim().split("\\s+");  // "\\s+" - alle mellomrom, "\\" - backslash "+"- en eller flere kilde fra oracle.
        return ord.length;
    }
    public double gjOrdlengde(){
        int totalBokstaver = 0;
        for (int i = 0; i < 26; i++){
            totalBokstaver += antallTegn[i];
        }
        int antallOrd = totaltAntallOrd();
        return (double) totalBokstaver/antallOrd;
    }
    
    public double gjOrdPeriode(){
        String[] perioder = tekst.split("[.!:?]");
        int antallPerioder = perioder.length;

        int antallOr = totaltAntallOrd();
        
        return (double) antallOr / antallPerioder;
    }

    public void byttOrd(String gammeltOrd, String nyttord){
        tekst = tekst.replaceAll(gammeltOrd, nyttord);
        oppdaterAntallTegn();
    }
    private void oppdaterAntallTegn() {
    antallTegn = new int[27]; // Nullstill arrayen
    for (int i = 0; i < tekst.length(); i++) {
        char c = tekst.charAt(i);
        if (c >= 'a' && c <= 'z') {
            antallTegn[c - 'a']++;
        } else {
            antallTegn[26]++;
        }
    }
    }
    public String hentOriginalTekst(){
        return original;
    }
    public String storBokstav(){
        String Storbokstavtekst = hentOriginalTekst();
        Storbokstavtekst = Storbokstavtekst.toUpperCase();

        return Storbokstavtekst;
    }

}