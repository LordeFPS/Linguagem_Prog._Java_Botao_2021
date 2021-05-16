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
import utils.ConexaoDB;
import vendas.modelo.Cliente;

/**
 *
 * @author 69146
 */
public class DaoCliente{
    public static boolean salvar(Cliente clt) {
        try {
            //conectar ao banco
            Connection  con = ConexaoDB.getConexao();
            //montar sql
            String sql = " insert into cliente (nome, fone, email)" +
                         " values (?,?,?);";
            //envia sql para o banco de dados
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, clt.getNome());
            stm.setString(2, clt.getFone());
            stm.setString(3, clt.getEmail());
            stm.execute();
        } catch (SQLException ex){
            throw new RuntimeException("Erro cadastro cliente: " + ex.getMessage());
            //System.out.println("Erro: " + ex.getMessage());
            //return false;
        }
        return true;
    }
    public ResultSet getAll(){
        ResultSet rs = null;

        try {
            String sql = " select idcliente, nome" +
                         " from cliente;";
            Connection con = ConexaoDB.getConexao();
            PreparedStatement stm = con.prepareStatement(sql);
            rs = stm.executeQuery();

        } catch (SQLException ex) {
            //
        } 
        return rs;
        
    }
    
    public ResultSet getAll(String filtro){
        ResultSet rs = null;

        try {
            String sql = " select * " 
                       + " from cliente c"
                       + " where lower(nome) like lower('%"+ filtro +"%');";
            Connection con = ConexaoDB.getConexao();
            PreparedStatement stm = con.prepareStatement(sql);
            rs = stm.executeQuery();

        } catch (SQLException ex) {
            //
        } 
        return rs;
        
    }
    
}
