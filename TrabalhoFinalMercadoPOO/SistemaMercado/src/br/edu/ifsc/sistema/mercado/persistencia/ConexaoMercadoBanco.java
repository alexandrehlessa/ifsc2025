package br.edu.ifsc.sistema.mercado.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMercadoBanco {
    private static final String URL = "jdbc:sqlite:mercado.sqlite";
    private static Connection conexao;

    public static Connection getConexao() {
        try {
            if (conexao != null && conexao.isValid(5))
                return conexao;
            conexao = DriverManager.getConnection(URL);
            return conexao;
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            return null;
        }
    }

    public static void fecharConexao() {
        try {
            if (conexao != null)
                conexao.close();
        } catch (SQLException e) {
            System.err.println("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
        }
    }



}
