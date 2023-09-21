package gestion;

public class CompteClient {
    private String nom;
    private double solde;

    public CompteClient(String nom, double soldeInitial) {
        this.nom = nom;
        this.solde = soldeInitial;
    }

    public void deposer(double montant) {
        solde += montant;
    }

    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant pour effectuer le retrait.");
        }
    }

    public double getSolde() {
        return solde;
    }

    public String getNom() {
        return nom;
    }
}