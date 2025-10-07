package oving7;

public class NyString {
    private final String tekst; // objektvariabel

    public NyString(String tekst) { // konstruktør som tar imot en string
        this.tekst = tekst;
    }

    public String getTekst() { // henter ut strengen
        return tekst;
    }

    // Forkorter teksten: første tegn i hvert ord
    public String forkortTekst() {
        String[] ord = tekst.split(" "); //deler opp teksten i ord basert på mellomrom.
        StringBuilder sb = new StringBuilder(); //Lager et StringBuilder-objekt som brukes til å bygge opp den forkortede teksten.

        for(int i = 0; i < ord.length; i++) {
            String o = ord[i];
            if (!o.isEmpty()) { //hvis ordet ikke er tomt
                sb.append(o.charAt(0)); //henter det første tegnet i ordet, og append legger til den første bokstaven i sb-objektet.
            }
        }
        return sb.toString();
    }

    // Fjerner alle forekomster av et gitt tegn
    public String fjernTegn(char tegn) { //char tegn, det tegnet vi ønsker å fjerne fra teksten
        String resultat = tekst; //resultat er teksten som vi endrer på
        int posisjon = resultat.indexOf(tegn); // søker etter posisjonen til det første forekomsten av tegnet i teksten
    // hvis tegnet ikke finnes, returneres -1

        while (posisjon != -1) { // løkken kjører så lenge tegnet finnes i teksten
            resultat = resultat.substring(0, posisjon) + resultat.substring(posisjon + 1);
            // lager en ny streng som består av alt før tegnet og alt etter tegnet
            // på denne måten fjernes tegnet på posisjon 'pos'
            posisjon = resultat.indexOf(tegn);
            // søker igjen etter tegnet i den nye teksten
            // hvis flere forekomster finnes, fortsetter løkken
        }
        return resultat;
    }
}
