package gestion;

import java.io.Serializable;

public class Client implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String nom;
    private double solde;

    public Client(int id, String nom, double solde) {
        this.id = id;
        this.nom = nom;
        this.solde = solde;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Client [id=" + id + ", nom=" + nom + ", solde=" + solde + "]";
    }
}
