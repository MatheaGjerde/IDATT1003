public class TestMatrise {
    public static void main(String[] args) {
        double[][] aBalance = {
            {1, 2},
            {4, 5}
        };
        double[][] bBalance = {
            {7, 8},
            {10, 11}
        };
        Matrise A = new Matrise(aBalance);
        Matrise B = new Matrise(bBalance);

        System.out.println("Matrise A:");
        System.out.println(A);

        System.out.println("Matrise B:");
        System.out.println(B);

        System.out.println("A + B:");
        System.out.println(A.add(B));

        System.out.println("A * B:");
        System.out.println(A.multiply(B));

        System.out.println("Transpose av A:");
        System.out.println(A.transponering());
    }
}
