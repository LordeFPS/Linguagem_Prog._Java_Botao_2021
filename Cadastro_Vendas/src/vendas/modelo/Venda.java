/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendas.modelo;

import DAO.interfaces.DaoInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import utils.ConexaoDB;

/**
 *
 * @author 69146
 */
public class Venda implements DaoInterface{
    private int idvenda;
    private Date data;
    private String status;
    private int idcliente;

    public Venda() {
    }

    public Venda(Date data, String status, int idcliente) {
        this.data = data;
        this.status = status;
        this.idcliente = idcliente;
    }

    public Venda(int idvenda, Date data, String status, int idcliente) {
        this.idvenda = idvenda;
        this.data = data;
        this.status = status;
        this.idcliente = idcliente;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean salvar() {
        try {
            //conectar ao banco
            Connection  con = ConexaoDB.getConexao();
            //montar sql
            String sql = " insert into venda (data, status, idcliente)" +
                         " values (?,?,?);";
            //envia sql para o banco de dados
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setDate(1, this.getData());
            stm.setString(2, this.getStatus());
            stm.setInt(3, this.idcliente);
            stm.execute();
            
            stm = con.prepareStatement(" select max(idvenda) as idvenda from venda;");
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                this.setIdvenda(rs.getInt("idvenda"));
            }
            
            
        } catch (SQLException ex){
            throw new RuntimeException("Erro cadastro produto: " + ex.getMessage());
            //System.out.println("Erro: " + ex.getMessage());
            //return false;
        }
        return true;
        
    }

    @Override
    public boolean editar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet getAll(String filtro) {
        ResultSet rs = null;

        try {
            String sql = " select * from venda v, cliente c" +
                         " where v.idcliente = c.idcliente"+
                         " and lower(nome) like lower('%"+ filtro +"%');";
                         
            Connection con = ConexaoDB.getConexao();
            PreparedStatement stm = con.prepareStatement(sql);
            rs = stm.executeQuery();

        } catch (SQLException ex) {
            //
        } 
        return rs;
    }

    @Override
    public Object getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
}
