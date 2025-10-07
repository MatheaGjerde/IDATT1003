package oving2;
import java.util.Scanner;

public class Skuddaar {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        int aarstall = In.nextInt();
        
        if ((aarstall % 4 == 0 && aarstall % 100 != 0)|| (aarstall % 400 == 0)){
            System.out.println(aarstall + " er et skuddår");
        }
        else {
            System.out.println(aarstall + " er ikke et skuddår");
        }
    }
}