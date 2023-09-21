import java.util.*;
public class pair {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Entrer un nombre : ");
    int nombre = scanner.nextInt();
    if (nombre % 2 == 0)
      System.out.println("Le nombre est pair.");
    else
      System.out.println("Le nombre est impair.");
    }
}
