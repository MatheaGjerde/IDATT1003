package oving7;

public class TestNyString {
    public static void main(String[] args) {
        NyString ny = new NyString("denne setningen kan forkortes");

        System.out.println("Original: " + ny.getTekst());
        System.out.println("Forkortet: " + ny.forkortTekst());   
        System.out.println("Uten 'e': " + ny.fjernTegn('e'));   
    }
}