/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Categoria;
import model.Marca;
import model.Produto;

/**
 * 
 * @author Claudinei
 */
public class ProdutoDAO {

    private Connection con = null;

    public ProdutoDAO() {

        con = ConnectionDB.getConnection();
    }

    public boolean inserirProdutoDAO(Produto produto) {

        String sql = "INSERT INTO produto (produtoDescricao, "
                + "produtoQuantidade, "
                + "produtoValor, "
                + "produtoCategoria) "
                + "produtoMarca) "
                + "values (?, ?, ?, ?)";

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getProdutoDescricao());
            stmt.setInt(2, produto.getProdutoQuantidade());
            stmt.setDouble(3, produto.getProdutoValor());
            stmt.setInt(4, produto.getProdutoCategoria().getCategoriaCodigo());
            stmt.setInt(5, produto.getProdutoMarca().getMarcaCodigo());
            stmt.executeUpdate();
                        

            return true;

        } catch (SQLException ex) {
            System.err.println("Erro salvarProdutoDAO: " + ex);
            return false;

        } finally {

            ConnectionDB.closeConnection(con, stmt);

        }

    }

    public List<Produto> buscarProdutosDAO() {
        String sql = " SELECT p.produtoCodigo, p.produtoDescricao, p.produtoQuantidade, "
                + " p.produtoValor, "
                + " c.categoriaDescricao FROM produto p INNER JOIN categoria c "
                + " ON p.produtoCategoria = c.categoriaCodigo "
                + " INNER JOIN marca m ON p.produtoMarca = m.marcaCodigo ";
       // String sql = "SELECT * FROM vw_ProdutoPesquisar";
        /* String sql = " SELECT p.produtoCodigo, p.produtoDescricao, p.produtoQuantidade, "
                + " p.produtoValor, p.produtoCategoria, c.categoriaMarca, "
                + " c.categoriaDescricao FROM produto p INNER JOIN categoria c "
                + " ON p.produtoCategoria = c.categoriaCodigo ";*/
         
//System.out.println(sql);

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtoLista = new ArrayList<>();

        try {

            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                //produto.setProdutoCodigo(rs.getInt("produtoCodigo"));
                //produto.setProdutoDescricao(rs.getString("produtoDescricao"));
                produto.setProdutoCodigo(rs.getInt(Produto.PRODUTO_CODIGO));
                produto.setProdutoDescricao(rs.getString(Produto.PRODUTO_DESCRICAO));
                produto.setProdutoQuantidade(rs.getInt(Produto.PRODUTO_QUANTIDADE));
                produto.setProdutoValor(rs.getDouble(Produto.PRODUTO_VALOR));
                
                Categoria categoria = new Categoria();
              //  categoria.setCategoriaCodigo(rs.getInt(Categoria.CATEGORIA_CODIGO));
                categoria.setCategoriaDescricao(rs.getString(Categoria.CATEGORIA_DESCRICAO));
                
                Marca marca = new Marca();
                marca.setMarcaDescricao(rs.getString(Marca.MARCA_DESCRICAO));

                produto.setProdutoCategoria(categoria);
                produto.setProdutoMarca(marca);
                produtoLista.add(produto);

            }

        } catch (SQLException ex) {
            System.err.println("Erro buscarProdutoDAO: " + ex);

        } finally {
            ConnectionDB.closeConnection(con, stmt, rs);
        }

        return produtoLista;

    }

    public List<Produto> buscarProdutosDAOComLike(String produtoDescricao) {

       // String sql = "SELECT * FROM vw_ProdutoPesquisar WHERE produtoDescricao LIKE ?";
        
        String sql = " SELECT p.produtoCodigo, p.produtoDescricao, p.produtoQuantidade, "
                + " p.produtoValor, p.produtoCategoria, c.categoriaCodigo, "
                + " c.categoriaDescricao FROM produto p INNER JOIN categoria c "
                + " ON p.produtoCategoria = c.categoriaCodigo "
                + " INNER JOIN marca m ON p.produtoMarca = m.marcaCodigo ";
         

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtoLista = new ArrayList<>();

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%"+produtoDescricao+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setProdutoCodigo(rs.getInt(Produto.PRODUTO_CODIGO));
                produto.setProdutoDescricao(rs.getString(Produto.PRODUTO_DESCRICAO));
                produto.setProdutoQuantidade(rs.getInt(Produto.PRODUTO_QUANTIDADE));
                produto.setProdutoValor(rs.getDouble(Produto.PRODUTO_VALOR));

                Categoria categoria = new Categoria();
              //  categoria.setCategoriaCodigo(rs.getInt(Categoria.CATEGORIA_CODIGO));
                categoria.setCategoriaDescricao(rs.getString(Categoria.CATEGORIA_DESCRICAO));
                
                Marca marca = new Marca();
                marca.setMarcaDescricao(rs.getString(Marca.MARCA_DESCRICAO));
              //  categoria.setCategoriaDescricao(rs.getString(Categoria.CATEGORIA_DESCRICAO));

                produto.setProdutoCategoria(categoria);
                produto.setProdutoMarca(marca);
                produtoLista.add(produto);

            }

        } catch (SQLException ex) {
            System.err.println("Erro buscarProdutoDAO: " + ex);

        } finally {
            ConnectionDB.closeConnection(con, stmt, rs);
        }

        return produtoLista;

    }

    public boolean atualizarProdutoDAO(Produto produto) {

        String sql = "UPDATE produto SET produtoDescricao = ?, produtoQuantidade = ?, produtoValor = ?, produtoCategoria = ?, produtoMarca = ? WHERE produtoCodigo = ?";

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getProdutoDescricao());
            stmt.setInt(2, produto.getProdutoQuantidade());
            stmt.setDouble(3, produto.getProdutoValor());
            stmt.setInt(4, produto.getProdutoCategoria().getCategoriaCodigo());
            stmt.setInt(5, produto.getProdutoCodigo());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso.");

            return true;

        } catch (SQLException ex) {
            System.err.println("Erro atualizarProdutoDAO: " + ex);
            return false;

        } finally {

            ConnectionDB.closeConnection(con, stmt);

        }

    }

    public boolean excluirProdutoDAO(Produto produto) {

        String sql = "DELETE FROM produto WHERE produtoCodigo = ?";

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement(sql);
            stmt.setInt(1, produto.getProdutoCodigo());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso.");            
            return true;

        } catch (SQLException ex) {
            System.err.println("Erro excluirProdutoDAO: " + ex);
            return false;

        } finally {

            ConnectionDB.closeConnection(con, stmt);

        }

    }

}
