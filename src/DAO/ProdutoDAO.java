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
    //Corrigido dia 25/09/2020
    public boolean inserirProdutoDAO(Produto produto) {

        String sql = "INSERT INTO produto (produtoDescricao, "
                + "produtoQuantidade, "
                + "produtoValor, "
                + "produtoCategoria, "
                + "produtoMarca) "
                + "values (?, ?, ?, ?, ?)";

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
    //Corrigido dia 25/09/2020
    public List<Produto> buscarProdutosDAO() {
        
        String sql = " SELECT p.produtoCodigo, p.produtoDescricao, p.produtoQuantidade, "
                + " p.produtoValor, c.categoriaDescricao, m.marcaDescricao "
                + " FROM produto p INNER JOIN categoria c ON p.produtoCategoria = c.categoriaCodigo "
                + " INNER JOIN marca m ON p.produtoMarca = m.marcaCodigo ";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtoLista = new ArrayList<>();

        try {

            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();
                produto.setProdutoCodigo(rs.getInt(Produto.PRODUTO_CODIGO));
                produto.setProdutoDescricao(rs.getString(Produto.PRODUTO_DESCRICAO));
                produto.setProdutoQuantidade(rs.getInt(Produto.PRODUTO_QUANTIDADE));
                produto.setProdutoValor(rs.getDouble(Produto.PRODUTO_VALOR));
                
                Categoria categoria = new Categoria();
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
    //Corrigido dia 26/09/2020
    public List<Produto> buscarProdutosDAOComLike(String produtoDescricao) {
        
      //    String sql = " SELECT * FROM produto WHERE produtoDescricao LIKE ? ";
        
            String sql = " SELECT p.produtoCodigo, p.produtoDescricao, p.produtoQuantidade, "
                + " p.produtoValor, c.categoriaDescricao, m.marcaDescricao "
                + " FROM produto p INNER JOIN categoria c ON p.produtoCategoria = c.categoriaCodigo "
                + " INNER JOIN marca m ON p.produtoMarca = m.marcaCodigo "
                + " WHERE p.produtoDescricao LIKE ? ORDER BY p.produtoDescricao ";

     /*   String sql = " SELECT p.produtoCodigo, p.produtoDescricao, p.produtoQuantidade, "
                + " p.produtoValor, p.produtoCategoria, c.categoriaCodigo, "
                + " c.categoriaDescricao FROM produto p INNER JOIN categoria c "
                + " ON p.produtoCategoria = c.categoriaCodigo "
                + " INNER JOIN marca m ON p.produtoMarca = m.marcaCodigo ";*/
         

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
    //Corrigido dia 25/09/2020
    public boolean atualizarProdutoDAO(Produto produto) {

        String sql = "UPDATE produto SET produtoDescricao = ?, produtoQuantidade = ?, produtoValor = ?, produtoCategoria = ?, produtoMarca = ? WHERE produtoCodigo = ?";

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getProdutoDescricao());
            stmt.setInt(2, produto.getProdutoQuantidade());
            stmt.setDouble(3, produto.getProdutoValor());
            stmt.setInt(4, produto.getProdutoCategoria().getCategoriaCodigo());
            stmt.setInt(5, produto.getProdutoMarca().getMarcaCodigo());
            stmt.setInt(6, produto.getProdutoCodigo());
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
    
    public Produto buscaProduto(int id){
        String sql = "SELECT produtoCodigo, produtoDescricao, produtoValor FROM produto WHERE produtoCodigo = ?";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        Produto produto = new Produto();

        try {

            stmt = con.prepareStatement(sql);   
            stmt.setInt(1, id);
            rs = stmt.executeQuery(); 
            
            if(rs.next()){
                produto.setProdutoCodigo(rs.getInt("produtoCodigo"));
                produto.setProdutoDescricao(rs.getString("produtoDescricao"));
                produto.setProdutoValor(rs.getFloat("produtoValor"));
            }
            
            return produto;

        } catch (SQLException ex) {
            System.err.println("ERRO buscaProdutoDAO: " + ex); 
            
            return produto;

        } finally {

            ConnectionDB.closeConnection(con, stmt);

        }

    }
    
    public boolean addProdutoVenda(int idProduto, int idVenda, int qtd, float valor, float total){
        String sql = "INSERT INTO venda_produto (vendaCodigo, produtoCodigo, qtd, total) values (?, ?, ?, ?)";
        
        String sql_consulta = "SELECT * FROM venda_produto WHERE vendaCodigo = ? AND produtoCodigo = ?";
        
        String sql_atualiza_qtd = "UPDATE venda_produto SET qtd = qtd+?, total = total+(?*?) WHERE vendaCodigo = ? AND produtoCodigo = ?";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            
            stmt = con.prepareStatement(sql_consulta);
            stmt.setInt(1, idVenda);
            stmt.setInt(2, idProduto);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                stmt = con.prepareStatement(sql_atualiza_qtd);
                stmt.setInt(1, qtd);     
                stmt.setFloat(2, valor);
                stmt.setFloat(3, qtd);
                stmt.setInt(4, idVenda);
                stmt.setInt(5, idProduto);                
//                stmt.setFloat(4, total);
                stmt.executeUpdate();
                
                return true;
            }else{

                stmt = con.prepareStatement(sql);
                stmt.setInt(1, idVenda);
                stmt.setInt(2, idProduto);
                stmt.setInt(3, qtd);      
                stmt.setFloat(4, total);
                stmt.executeUpdate();
                        
                return true;
            }

        } catch (SQLException ex) {
            System.err.println("Erro addProdutoVendaDAO: " + ex);
            return false;

        } finally {

            ConnectionDB.closeConnection(con, stmt);

        }
    }
}
