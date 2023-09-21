package gestion;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GUI {
    public static void run(String[] args) {
        // Création de la liste des clients (simulée pour l'exemple)
        List<Client> clients = new ArrayList<>();
        clients.add(new Client(1, "John Doe", 1000));
        clients.add(new Client(2, "Jane Doe", 1500));
        clients.add(new Client(3, "Bob Smith", 800));

        // Création du modèle de tableau
        Object[][] data = new Object[clients.size()][3];
        for (int i = 0; i < clients.size(); i++) {
            Client client = clients.get(i);
            data[i][0] = client.getId();
            data[i][1] = client.getNom();
            data[i][2] = client.getSolde();
        }
        String[] columnNames = {"ID", "Nom", "Solde"};

        // Création de la fenêtre et du tableau
        JFrame frame = new JFrame("Exemple de Tableau");
        JTable table = new JTable(data, columnNames);

        // Ajout du tableau à un JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Configuration de la fenêtre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
