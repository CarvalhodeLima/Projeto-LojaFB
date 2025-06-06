package com.LojaFB.dao;
import com.LojaFB.DatabaseConnection.DatabaseConnection;
import com.LojaFB.entidades.Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ProdutoDAO {

    public void adicionarProduto(Produto produto) {
        String sql = "INSERT INTO produto (nome, preco) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Produto> listarProdutos() {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produto";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Produto p = new Produto(rs.getInt("id"), rs.getString("nome"), rs.getDouble("preco"));
                produtos.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }

    public void atualizarProduto(Produto produto) {
        String sql = "UPDATE produto SET nome = ?, preco = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removerProduto(int id) {
        String sql = "DELETE FROM produto WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
