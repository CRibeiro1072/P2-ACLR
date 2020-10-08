/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ARAÍ
 */
public class UsuarioDAO {
    
     /*  private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/mvc_dao";
    private static final String USER = "root";
    private static final String PASS = "123456";*/
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/aclr";
    private static final String USER = "phpmyadmin";
    private static final String PASS = "123456";

    public static Connection getConnection() {

        try {
            Class.forName(DRIVER);

            return DriverManager.getConnection(URL, USER, PASS);


        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na Conexao ao BD.", ex);
        }
    }

    //Metodos de Fechamento conforme documentaçao MySql
    //Fecha conexao
    public static void closeConnection(Connection con) {

        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro ao fechar conexao: " + ex);
            }
        }

    }

    //Fecha conexao, e PreparedStatement
    public static void closeConnection(Connection con, PreparedStatement stmt) {

        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.err.println("Erro ao fechar conexao e stmt: " + ex);
            }
        }

        closeConnection(con);

    }

    //Fecha conexao, e PreparedStatement e ResultSet
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro ao fechar conexao, stmt e rs: " + ex);
            }
        }
        closeConnection(con, stmt);

    }

}
    

