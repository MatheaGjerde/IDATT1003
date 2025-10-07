package oving9;

public class StudentKlient{
    public static void main(String[] args) {
        Student s = new Student("Mathea", 2);
        System.out.println("Navn: " + s.getNavn());
        System.out.println("Antall oppgaver: " + s.getAntOppg());
        s.okAntOppg(2);
        System.out.println("Øk antall godkjente oppgaver med 2: " + s.getAntOppg());
        
        System.out.println("\n" + s);
    }
}