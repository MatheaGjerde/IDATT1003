public class kunde{
    public static void main(String[] args) {
        // Oppretter en konto
        account karisinAccount = new account(123456, "Kari", 5000);

        // Skriver ut kontoinformasjon
        System.out.println("Kontonummer: " + karisinAccount.getAcountnr());
        System.out.println("Navn: " + karisinAccount.getName());
        System.out.println("Saldo: " + karisinAccount.getSaldo());

        // Gjør en transaksjon (setter inn penger)
     karisinAccount.doTransaktion(500.0);
        System.out.println("Ny saldo etter innskudd: " + karisinAccount.getSaldo());

        // Gjør en transaksjon (tar ut penger)
     karisinAccount.doTransaktion(-200.0);
        System.out.println("Ny saldo etter uttak: " + karisinAccount.getSaldo());
    }
}