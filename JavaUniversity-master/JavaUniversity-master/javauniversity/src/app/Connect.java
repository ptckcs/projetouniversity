package app;

import java.sql.Connection; 
import java.sql.SQLException; 

public class Connect {
    public static void main(String[] args) throws SQLException {
        Connection connection = new App().getConnection();
        System.out.println("Conexão aberta!");
        connection.close();
    }
}