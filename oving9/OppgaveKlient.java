package oving9;

public class OppgaveKlient{
    public static void main(String[] args) {
        Oppgaveoversikt oversikt = new Oppgaveoversikt(10);

        oversikt.registrerStudent("Anna", 3);
        oversikt.registrerStudent("Per", 5);
        oversikt.registrerStudent("Ola", 2);

        System.out.println(oversikt);

        System.out.println("Per har " + oversikt.getAntOppgForStudent("Per") + " oppgaver godkjent.");

        oversikt.okOppgForStudent("Anna", 2);
        System.out.println("Anna har en økning på 2" );

        System.out.println("\nEtter oppdatering:");
        System.out.println(oversikt);
    }
}