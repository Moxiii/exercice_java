package gestion;

public class Main {
    public static void main(String[] args) {
        // Création d'un nouveau client et ajout dans la base de données
        Client client1 = new Client(1, "John Doe", 1000);
        ClientDAO.getInstance().ajouterClient(client1);

        // Retrait d'argent du client
        ClientDAO.getInstance().retirerArgent(1, 500);

        // Affichage de la liste des clients
        List<Client> clients = ClientDAO.getInstance().getClients();
        for (Client client : clients) {
            System.out.println(client);
        }
    }
}
