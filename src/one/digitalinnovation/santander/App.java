package one.digitalinnovation.santander;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    
    public static void main(String[] args) throws SQLException{
    
        String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";
        String user = "ademir";
        String password = "123456";

        try (Connection conn = DriverManager.getConnection(urlConnection, user, password)){            
            System.out.println("Conectado com sucesso!");
        } catch (Exception e) {
            System.out.println("Conexão falhou!");
            e.printStackTrace();
        }
    }
}
