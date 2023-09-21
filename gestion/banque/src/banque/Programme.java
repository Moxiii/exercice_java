package banque;

import java.util.ArrayList;
public class Programme {
	static double conteur;
	private ArrayList<Client> clients;
	public void SystemeAffichageClient() {
		this.clients = new ArrayList<>();
	}
	public void ajouterClient(Client client) {
		clients.add(client);
		conteur++;
	}
	public void afficherClients() {
		for (Client client : clients) {
			System.out.println("Nom : "+client.getNom()+" Email: "+client.getEmail());
		}
	}
	public void supprimerClient(Client client) {
		clients.remove(0);
		conteur --;
	}
	
}
