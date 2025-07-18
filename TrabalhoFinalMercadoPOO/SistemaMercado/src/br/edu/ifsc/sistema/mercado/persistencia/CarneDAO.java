package br.edu.ifsc.sistema.mercado.persistencia;

import br.edu.ifsc.sistema.mercado.modelo.Carne;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarneDAO implements DAO<Carne, String> {
    private static CarneDAO instancia;

    private CarneDAO() {}

    public static CarneDAO getInstancia() {
        if (instancia == null) {
            instancia = new CarneDAO();
        }
        return instancia;
    }

    @Override
    public void criar(Carne entidade) {
        try {
            Connection conexao = ConexaoMercadoBanco.getConexao();
            String sql = "INSERT INTO Carne (nome, descricao, precokilo) VALUES (?, ?, ?)";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, entidade.getNome());
            statement.setString(2, entidade.getDescricao());
            statement.setFloat(3, entidade.getPrecoKilo());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao criar o carne: " + e.getMessage());
        }
    }

    @Override
    public void atualizar(Carne entidade, String nomeAntigo) {
        try {
            Connection conexao = ConexaoMercadoBanco.getConexao();
            String sql = "UPDATE Carne SET nome = ?, descricao = ?, precokilo = ? WHERE nome = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, entidade.getNome());
            statement.setString(2, entidade.getDescricao());
            statement.setFloat(3, entidade.getPrecoKilo());
            statement.setString(4, nomeAntigo); // onde nome = antigo
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar o carne: " + e.getMessage());
        }
    }

    @Override
    public void deletar(Carne entidade) {
        try {
            Connection conexao = ConexaoMercadoBanco.getConexao();
            String sql = "DELETE FROM Carne WHERE nome = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, entidade.getNome());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao deletar o carne: " + e.getMessage());
        }
    }

    @Override
    public Carne buscar(String nome) {
        try {
            Connection conexao = ConexaoMercadoBanco.getConexao();
            String sql = "SELECT * FROM Carne WHERE nome = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, nome);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                String descricao = rs.getString("descricao");
                float precoKilo = rs.getFloat("precokilo");
                return new Carne(nome, descricao, precoKilo);
            } else {
                System.out.println("Nenhuma carne encontrada com nome: " + nome);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar carne: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Carne> buscarTodos() {
        List<Carne> carnes = new ArrayList<>();
        try {
            Connection conexao = ConexaoMercadoBanco.getConexao();
            String sql = "SELECT * FROM Carne";
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                String nome = rs.getString("nome");
                String descricao = rs.getString("descricao");
                float precoKilo = rs.getFloat("precokilo");

                Carne carne = new Carne(nome, descricao, precoKilo);
                carnes.add(carne);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar todos os carnes: " + e.getMessage());
        }
        return carnes;
    }
}