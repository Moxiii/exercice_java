package banque;

public class Main {
	public static void main(String[] args) {
        CompteClient monCompte = new CompteClient(1,"Max", 10000);
        
        
        System.out.println("Nom du client : " + monCompte.getNom());
        System.out.println("Solde initial : " + monCompte.getSolde());
     
        monCompte.deposer(500);
        System.out.println("Solde après dépôt : " + monCompte.getSolde());

        monCompte.retirer(200);
        System.out.println("Solde après retrait : " + monCompte.getSolde());
        monCompte.retirer(2000);
        System.out.println("Solde après retrait : " + monCompte.getSolde());
        Singleton uniqueID = Singleton.getInstance(); 
        System.out.println("Identifiant unique singleton 1" + uniqueID);
    }
}
