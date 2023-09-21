package banque;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import banque.Client;
public class Sql {
	
	public void addClient()
	{
	 
		try {
			Class.forName("com.mysql.cj.jdc.Driver");
			String url = "jdbc:mysql:http://localhost/phpmyadmin/index.php?route=/table/structure&db=java&table=client";
			String username = "root";
			String password = "";
			Connection connexion = DriverManager.getConnection(url,username,password);
			//Statement statement = connexion.createStatement();
			 String requete = "INSERT INTO client (nom, email) VALUES (?, ?)";
	            PreparedStatement statement = connexion.prepareStatement(requete);
	            
	            statement.setString(1, "John Doe");
	            statement.setString(2, "john.doe@example.com");
	            
	            int lignesModifiees = statement.executeUpdate();
	            
	            if (lignesModifiees > 0) {
	                System.out.println("Données insérées avec succès !");
	            } else {
	                System.out.println("Erreur lors de l'insertion des données.");
	            }

	            statement.close();
	            connexion.close();
			}catch (Exception e) { e.printStackTrace();}
	}
	public void viewAllClient() {
		try {
			Class.forName("com.mysql.cj.jdc.Driver");
			String url = "jdbc:mysql:http://localhost/phpmyadmin/index.php?route=/table/structure&db=java&table=client";
			String username = "root";
			String password = "";
			Connection connexion = DriverManager.getConnection(url,username,password);
			Statement statement = connexion.createStatement();
			String requete = "SELECT * FROM client";
			ResultSet resultat = statement.executeQuery(requete);
			while(resultat.next()) {
				int id = resultat.getInt("id");
				String nom = resultat.getString("nom");
				String email = resultat.getString("email");
				System.out.println("ID:" + id + "Nom: " + nom + "email :" + email);

			}
		}catch(Exception e) {e.printStackTrace();}
	}
}
