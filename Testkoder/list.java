import java.util.ArrayList;
public class list {
    
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }

}

/*
 * 
 * Meny valgtMeny = null;
                        for (Meny mn : register.getMenyer()) {
                            if (mn.getMenyNavn().equalsIgnoreCase(menyNavn)) {
                                valgtMeny = mn;
                                break;
                            }
                        }
                        if (valgtMeny != null) {
                            register.addRettToMeny(nyRett, valgtMeny);
                            System.out.println("Matrett lagt til i menyen '" + menyNavn + "'!");
                        } else {
                            System.out.println("Fant ikke menyen '" + menyNavn + "'.");
                        }
 */

