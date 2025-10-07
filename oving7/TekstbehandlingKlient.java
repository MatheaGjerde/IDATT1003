package oving7;

public class TekstbehandlingKlient {
    public static void main(String[] args) {
        Tekstbehandling tekst1 = new Tekstbehandling("Liker du kokos? jeg liker ikke kokos: her får du en kokosbolle!");

        System.out.println("Antall Ord: " + tekst1.totaltAntallOrd()); 
        System.out.println("Gjennomsnittlig ordlengde " + tekst1.gjOrdlengde());
        System.out.println("Gjennomsnittlig antall ord per periode " + tekst1.gjOrdPeriode());
        tekst1.byttOrd("liker", "like");
        System.out.println("Endret tekst: " + tekst1.getTekst());
        System.out.println("Original tekst: " + tekst1.hentOriginalTekst());
        System.out.println("Original tekst: " + tekst1.storBokstav());
    }
}