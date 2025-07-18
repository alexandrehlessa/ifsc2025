package br.edu.ifsc.sistema.mercado.persistencia;

import br.edu.ifsc.sistema.mercado.modelo.Higiene;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HigieneDAO implements DAO<Higiene, String> {
    private static HigieneDAO instancia;

    private HigieneDAO() {}

    public static HigieneDAO getInstancia() {
        if (instancia == null) {
            instancia = new HigieneDAO();
        }
        return instancia;
    }

    @Override
    public void criar(Higiene entidade) {
        String sql = "INSERT INTO Higiene (nome, descricao, preco) VALUES (?, ?, ?)";
        try (Connection conn = ConexaoMercadoBanco.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entidade.getNome());
            stmt.setString(2, entidade.getDescricao());
            stmt.setFloat(3, entidade.getPreco());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao criar higiene: " + e.getMessage());
        }
    }

    @Override
    public void atualizar(Higiene entidade, String nomeAntigo) {
        String sql = "UPDATE Higiene SET nome = ?, descricao = ?, preco = ? WHERE nome = ?";
        try (Connection conn = ConexaoMercadoBanco.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entidade.getNome());
            stmt.setString(2, entidade.getDescricao());
            stmt.setFloat(3, entidade.getPreco());
            stmt.setString(4, nomeAntigo);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar higiene: " + e.getMessage());
        }
    }

    @Override
    public void deletar(Higiene entidade) {
        String sql = "DELETE FROM Higiene WHERE nome = ?";
        try (Connection conn = ConexaoMercadoBanco.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entidade.getNome());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao deletar higiene: " + e.getMessage());
        }
    }

    @Override
    public Higiene buscar(String nome) {
        String sql = "SELECT * FROM Higiene WHERE nome = ?";
        try (Connection conn = ConexaoMercadoBanco.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Higiene(
                            rs.getString("nome"),
                            rs.getString("descricao"),
                            rs.getFloat("preco")
                    );
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar higiene: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Higiene> buscarTodos() {
        List<Higiene> itens = new ArrayList<>();
        String sql = "SELECT * FROM Higiene";
        try (Connection conn = ConexaoMercadoBanco.getConexao();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                itens.add(new Higiene(
                        rs.getString("nome"),
                        rs.getString("descricao"),
                        rs.getFloat("preco")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar todas higienes: " + e.getMessage());
        }
        return itens;
    }
}
