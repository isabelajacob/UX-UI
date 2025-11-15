package login;

// Importação das classes necessárias para trabalhar com banco de dados em Java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// Classe responsável por operações de usuário
public class User {
    // Método para conectar ao banco de dados e retornar a conexão estabelecida
    public Connection conectarBD() {
        Connection conn = null;
        try {
            // Carrega o driver do MySQL
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Define a string de conexão (endereçamento, banco, usuário e senha)
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            // Estabelece a conexão com o banco de dados
            conn = DriverManager.getConnection(url);
        } catch (Exception e) { 
            // Se ocorrer qualquer erro de conexão, o método retorna null
        }
        return conn; // Retorna a conexão (ou null em caso de erro)
    }

    // Variável para armazenar o nome do usuário validado
    public String nome = "";
    // Variável booleana para indicar se a validação do usuário foi bem-sucedida
    public boolean result = false;

    // Método que verifica se existe usuário com o login e senha informados
    public boolean verificarUsuario(String login, String senha) {
        String sql = ""; // Variável para armazenar o comando SQL
        // Obtém a conexão com o banco de dados
        Connection conn = conectarBD();

        // Monta a instrução SQL para buscar o usuário pelo login e senha recebidos
        sql += "select nome from usuarios ";
        sql += "where login = '" + login + "'";
        sql += " and senha = '" + senha + "'";

        try {
            // Cria um objeto Statement para executar comandos SQL
            Statement st = conn.createStatement();
            // Executa a consulta SQL e obtém os resultados
            ResultSet rs = st.executeQuery(sql);
            // Verifica se a consulta retornou algum registro (usuário encontrado)
            if (rs.next()) {
                // Obtém o valor do campo "nome" e marca result como verdadeiro
                nome = rs.getString("nome");
                result = true;
            }
        } catch (Exception e) { 
            // Tratamento genérico de exceções (poderia ser mais detalhado)
        }
        // Retorna true caso usuário tenha sido validado, ou false caso contrário
        return result;
    }
}
// fim da class
