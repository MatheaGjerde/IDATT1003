public class TestMatrise {
    public static void main(String[] args) {
        double[][] aBalance = {
            {1, 2, 3},
            {4, 5, 3},
            {7, 5, 4}
        };
        double[][] bBalance = {
            {7, 8, 9},
            {10, 11, 6},
            {4, 8, 7}
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
