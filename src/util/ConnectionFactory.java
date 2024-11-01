package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Classe responsável por gerenciar a conexão com o banco de dados.
public class ConnectionFactory {
    // URL do banco de dados
    public static String url = "jdbc:mysql://localhost:3306/your_database"; // Altere para o seu banco de dados
    // Usuário do banco de dados
    public static String user = "root"; // Altere conforme necessário
    // Senha do banco de dados
    public static String senha = ""; // Altere conforme necessário

    private static Connection connection;

    /**
     * Método responsável por obter a conexão com o banco de dados.
     * @return Uma conexão com o banco de dados ou null em caso de falha.
     */
    public static Connection getConnection() {
        if (connection == null) {
            try {
                // Estabelecendo a conexão
                connection = DriverManager.getConnection(url, user, senha);
                System.out.println("Conexão estabelecida com sucesso!");
            } catch (SQLException e) {
                // Tratando erro de conexão
                System.out.println("Erro de conexão: " + e.getMessage());
                return null;
            }
        }
        return connection;
    }

     //Método responsável por fechar a conexão com o banco de dados.
    
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close(); // Fechando a conexão
                connection = null; // Definindo a conexão como null para permitir nova conexão
                System.out.println("Conexão fechada com sucesso!");
            } catch (SQLException e) {
                // Tratando erro ao fechar a conexão
                System.out.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }
}