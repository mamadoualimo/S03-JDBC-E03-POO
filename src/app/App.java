package app;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import app.Article;

public class App {
    // Nom du logiciel permettant de se connecter à MariaDB
    static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    // Adresse de la base de données à laquelle se connecter (remplacer "test"
    // par le nom de votre base de données)
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/product";
    // Nom d'utilisateur/mot de passe permettant de s'authentifier auprès de MariaDB
    static final String USERNAME = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) throws Exception {
        // Enregistre le pilote de la base de données
        System.out.println("Registering MariaDB driver...");
        Class.forName(JDBC_DRIVER);
        
        // Etablit la connexion avec la base de données
        System.out.println("Connecting to database...");
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        
        // Crée une nouvelle requête
        System.out.println("Creating new request...");
        Statement statement = connection.createStatement();
        
        // Exécute une requête SQL
        System.out.println("Executing SQL query...");
        ResultSet resultSet = statement.executeQuery(
            "INSERT INTO `user` (`email` , `passeword`, `username`) VALUES (`toto@email.com`, `totosPassword`)"
        
        );
    }
}