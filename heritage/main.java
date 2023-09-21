package heritage;
import java.util.*;
import heritage.voitures;
import heritage.carre;
import heritage.utilisateurs;
import heritage.rectangles;
public class main {
    public  void createCarre(){
        System.out.println("Entrer la largeur du triangle : ");
        Scanner sc = new Scanner(System.in);
        int l = Integer.parseInt(sc.nextLine());
        carre c = new carre(l);
        int heritage.calculateArea(l);
    }
    public void createVoiture(){
        System.out.println("Entrer la marque de la voiture");
        Scanner sc = new Scanner(System.in);
        String marque = sc.nextLine();
        System.out.println("Entrez la puissance en CV de la voiture");
        int chevaux = sc.nextInt();
        System.out.println("Entrez la couleur de la voiture");
        String couleur = sc.nextLine();
        voitures voiture = new voitures(couleur,chevaux,marque);
        System.out.println("La voiture est créer ça marque est :"+ voiture.getMarque());

    }
}
