package gestion;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO implements Serializable {
    private static final long serialVersionUID = 1L;

    private static ClientDAO instance;
    private List<Client> clients;

    private ClientDAO() {
        clients = new ArrayList<>();
    }

    public static ClientDAO getInstance() {
        if (instance == null) {
            synchronized (ClientDAO.class) {
                if (instance == null) {
                    instance = new ClientDAO();
                }
            }
        }
        return instance;
    }

    public void ajouterClient(Client client) {
        clients.add(client);
        sauvegarderDonnees();
        insererClientDansBaseDeDonnees(client);
    }

    public void retirerArgent(int clientId, double montant) {
        for (Client client : clients) {
            if (client.getId() == clientId) {
                double nouveauSolde = client.getSolde() - montant;
                client.setSolde(nouveauSolde);
                sauvegarderDonnees();
                mettreAJourSoldeDansBaseDeDonnees(clientId, nouveauSolde);
                break;
            }
        }
    }

    private void sauvegarderDonnees() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("clients.ser"))) {
            out.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ClientDAO chargerDonnees() {
        ClientDAO dao = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("clients.ser"))) {
            dao = (ClientDAO) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return dao;
    }

    private void insererClientDansBaseDeDonnees(Client client) {
        Connection connection = DatabaseSingleton.getConnection();
        String sql = "INSERT INTO clients (id, nom, solde) VALUES (?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, client.getId());
            statement.setString(2, client.getNom());
            statement.setDouble(3, client.getSolde());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void mettreAJourSoldeDansBaseDeDonnees(int clientId, double nouveauSolde) {
        Connection connection = DatabaseSingleton.getConnection();
        String sql = "UPDATE clients SET solde = ? WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setDouble(1, nouveauSolde);
            statement.setInt(2, clientId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Client> getClients() {
        return clients;
    }
}
