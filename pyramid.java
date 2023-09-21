
import java.util.*;
public class pyramid {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ecrire un nombre: ");
        int nombre = scanner.nextInt();
        for (int i = 0; i < nombre; i++) {
            for (int j = 0; j < nombre - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
