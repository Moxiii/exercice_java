import java.util.*;
public class random {
    public static void main(String[] arg){
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        boolean trouver = false;
        int i = 0;
        while (trouver != true){
            System.out.println("Touver le nombre de 1 a 100:");
            Scanner sc = new Scanner(System.in);
            int guess = sc.nextInt();
            if ((guess > rand)){
                System.out.println("Le chiffre est plus petit");
                i++;
                
            }
            if((guess < rand)){
                System.out.println("Le chiffre est plus grand");
                i++;
                
            }
            if ((guess == rand)) {
                System.out.println("Trouver en " + i + " tentatives");
                break;
                }
        }
    }
}
