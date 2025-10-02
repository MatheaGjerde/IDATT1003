package oving1;

public class SekundBeregning {
    public static void main(String[] args) {
        Tid t = new Tid(1, 20, 30);
        System.out.println(t + " er " + t.tilSekunder() + " sekunder");
    }
}