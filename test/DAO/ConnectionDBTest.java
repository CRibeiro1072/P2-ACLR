/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import org.junit.Test;


/**
 *
 * @author claudinei
 */
public class ConnectionDBTest {
    private Connection con = null;

    /**
     * Test of getConnection method, of class ConnectionDB.
     */
    @Test
    public void ConnectionDBTest() {
        con = ConnectionDB.getConnection();
        System.out.println("Conectado com sucesso");
    }    
}
