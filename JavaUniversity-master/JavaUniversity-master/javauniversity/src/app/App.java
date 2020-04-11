package app;
// faz as importações de classes necessárias para o funcionamento do programa 
import java.sql.Connection; 
// conexão SQL para Java 
import java.sql.DriverManager; 
// driver de conexão SQL para Java 
import java.sql.SQLException; 
// classe para tratamento de exceções 
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("");
    }

    public Connection getConnection() {
        try {
           return DriverManager.getConnection("jdbc:mysql://localhost/universitybd","root","senha");
        }         
        catch(SQLException excecao) {
           throw new RuntimeException(excecao);
        }
    }
}