package br.edu.ifsc.sistema.mercado.persistencia;

import br.edu.ifsc.sistema.mercado.modelo.Verdura;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VerduraDAO implements DAO<Verdura, String> {
    private static VerduraDAO instancia;
    private VerduraDAO() {}
    public static VerduraDAO getInstancia() {
        if (instancia == null) {
            instancia = new VerduraDAO();
        }
        return instancia;
    }

    @Override
    public void criar(Verdura entidade) {
        String sql = "INSERT INTO Verdura (nome, descricao, tipo, preco) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexaoMercadoBanco.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entidade.getNome());
            stmt.setString(2, entidade.getDescricao());
            stmt.setString(3, entidade.getTipo());
            stmt.setFloat(4, entidade.getPreco());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao criar verdura: " + e.getMessage());
        }
    }

    @Override
    public void atualizar(Verdura entidade, String nomeAntigo) {
        String sql = "UPDATE Verdura SET nome = ?, descricao = ?, tipo = ?, preco = ? WHERE nome = ?";
        try (Connection conn = ConexaoMercadoBanco.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entidade.getNome());
            stmt.setString(2, entidade.getDescricao());
            stmt.setString(3, entidade.getTipo());
            stmt.setFloat(4, entidade.getPreco());
            stmt.setString(5, nomeAntigo);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar verdura: " + e.getMessage());
        }
    }

    @Override
    public void deletar(Verdura entidade) {
        String sql = "DELETE FROM Verdura WHERE nome = ?";
        try (Connection conn = ConexaoMercadoBanco.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entidade.getNome());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao deletar verdura: " + e.getMessage());
        }
    }

    @Override
    public Verdura buscar(String nome) {
        String sql = "SELECT * FROM Verdura WHERE nome = ?";
        try (Connection conn = ConexaoMercadoBanco.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Verdura(
                            rs.getString("nome"),
                            rs.getString("descricao"),
                            rs.getString("tipo"),
                            rs.getFloat("preco")
                    );
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar verdura: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Verdura> buscarTodos() {
        List<Verdura> itens = new ArrayList<>();
        String sql = "SELECT * FROM Verdura";
        try (Connection conn = ConexaoMercadoBanco.getConexao();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                itens.add(new Verdura(
                        rs.getString("nome"),
                        rs.getString("descricao"),
                        rs.getString("tipo"),
                        rs.getFloat("preco")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar todas verduras: " + e.getMessage());
        }
        return itens;
    }
}
