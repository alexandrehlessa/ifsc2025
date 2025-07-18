package br.edu.ifsc.sistema.mercado.persistencia;

import br.edu.ifsc.sistema.mercado.modelo.Padaria;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PadariaDAO implements DAO<Padaria, String> {
    private static PadariaDAO instancia;

    private PadariaDAO() {}

    public static PadariaDAO getInstancia() {
        if (instancia == null) {
            instancia = new PadariaDAO();
        }
        return instancia;
    }

    @Override
    public void criar(Padaria entidade) {
        String sql = "INSERT INTO Padaria (nome, descricao, preco, possuiGluten) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexaoMercadoBanco.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entidade.getNome());
            stmt.setString(2, entidade.getDescricao());
            stmt.setFloat(3, entidade.getPreco());
            stmt.setBoolean(4, entidade.isPossuiGluten());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao criar padaria: " + e.getMessage());
        }
    }

    @Override
    public void atualizar(Padaria entidade, String nomeAntigo) {
        String sql = "UPDATE Padaria SET nome = ?, descricao = ?, preco = ?, possuiGluten = ? WHERE nome = ?";
        try (Connection conn = ConexaoMercadoBanco.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entidade.getNome());
            stmt.setString(2, entidade.getDescricao());
            stmt.setFloat(3, entidade.getPreco());
            stmt.setBoolean(4, entidade.isPossuiGluten());
            stmt.setString(5, nomeAntigo);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar padaria: " + e.getMessage());
        }
    }

    @Override
    public void deletar(Padaria entidade) {
        String sql = "DELETE FROM Padaria WHERE nome = ?";
        try (Connection conn = ConexaoMercadoBanco.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entidade.getNome());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao deletar padaria: " + e.getMessage());
        }
    }

    @Override
    public Padaria buscar(String nome) {
        String sql = "SELECT * FROM Padaria WHERE nome = ?";
        try (Connection conn = ConexaoMercadoBanco.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Padaria(
                            rs.getString("nome"),
                            rs.getString("descricao"),
                            rs.getFloat("preco"),
                            rs.getBoolean("possuiGluten")
                    );
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar padaria: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Padaria> buscarTodos() {
        List<Padaria> itens = new ArrayList<>();
        String sql = "SELECT * FROM Padaria";
        try (Connection conn = ConexaoMercadoBanco.getConexao();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                itens.add(new Padaria(
                        rs.getString("nome"),
                        rs.getString("descricao"),
                        rs.getFloat("preco"),
                        rs.getBoolean("possuiGluten")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar todas padarias: " + e.getMessage());
        }
        return itens;
    }
}
