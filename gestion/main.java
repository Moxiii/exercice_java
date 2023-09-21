package gestion;
import gestion.CompteClient;
public class main {
    public static void Main(String[] args) {
        CompteClient monCompte = new CompteClient("Max", 100);
        //CompteClient monCompte = new CompteClient("John Doe", 1000);
        
        System.out.println("Nom du client : " + monCompte.getNom());
        System.out.println("Solde initial : " + monCompte.getSolde());

        monCompte.deposer(500);
        System.out.println("Solde après dépôt : " + monCompte.getSolde());

        monCompte.retirer(200);
        System.out.println("Solde après retrait : " + monCompte.getSolde());

        monCompte.retirer(2000);
        System.out.println("Solde après retrait : " + monCompte.getSolde());
    }

}
