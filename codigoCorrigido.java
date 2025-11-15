package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class User {

    
    private static final String DB_URL =
            "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";

    
    public Connection conectarBD() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(DB_URL);
    }

    
    public boolean verificarUsuario(String login, String senha) {

        String sql = "SELECT nome FROM usuarios WHERE login = ? AND senha = ?";

        try (
            Connection conn = conectarBD();
            PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

        
            stmt.setString(1, login);
            stmt.setString(2, senha);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String nome = rs.getString("nome");
                    System.out.println("Usuário encontrado: " + nome);
                    return true;
                }
            }

        } catch (Exception e) {
            System.err.println("Erro ao verificar usuário:");
            e.printStackTrace();
        }

        return false;
    }
}
