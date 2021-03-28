/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author 69146
 */
public class ConexaoDB {
    public static Connection getConexao(){
        Connection con = null;
        String url = "jdbc:postgresql://localhost:5432/aula4java";
        String user = "postgres";
        String password = "123";
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao conectar com o banco");
        }
        return con;
    }
}
