package oving10;

import java.util.ArrayList;
import java.util.List;

public class Meny{
    private final String menyNavn;
    private final List<Rett> retter;

    public Meny(String menyNavn){
        this.menyNavn = menyNavn;
        retter = new ArrayList<>();
    }
    public String getMenyNavn(){
        return menyNavn;
    }
    public List<Rett> getRetter(){
        return retter;
    }
    public void leggTilRett(Rett r) {
    retter.add(r);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(menyNavn).append(": ");

        for (int i = 0; i < retter.size(); i++) {
            sb.append(retter.get(i).getNavn());
            if (i < retter.size() - 1) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }

}