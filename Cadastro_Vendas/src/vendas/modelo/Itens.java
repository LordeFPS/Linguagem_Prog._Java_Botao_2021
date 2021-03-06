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
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.ConexaoDB;

/**
 *
 * @author 69146
 */
public class Itens implements DaoInterface{
    private int iditem;
    private int idproduto;
    private int idvenda;
    private float qtde;
    private float precoItem;

    public Itens() {
    }

    public int getIditem() {
        return iditem;
    }

    public void setIditem(int iditem) {
        this.iditem = iditem;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    public float getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(float precoItem) {
        this.precoItem = precoItem;
    }
    
    public int getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
    }
    
    public static ResultSet getItensByVenda(String id){
        ResultSet rs = null;
        
        try {
            //conectar ao banco
            Connection con = ConexaoDB.getConexao();
            //montar sql
            String sql =  " select p.idproduto idproduto, "
                        + " p.descricao descricao, "
                        + " i.qtde quantidade, "
                        + " i.precoitem precoItem, "
                        + " (i.precoitem * i.qtde) subtotal "
                        + " from itens i, produto p "
                        + " where i.idproduto = p.idproduto"
                        + " and idvenda = ?";
            //envia sql para o banco de dados
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, Integer.parseInt(id));
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao consultar: " + ex.getMessage());
        }
        return rs;
    }
    
    @Override
    public boolean salvar() {
        try {
            //conectar ao banco
            Connection  con = ConexaoDB.getConexao();
            //montar sql
            String sql = " insert into itens (idproduto, idvenda, qtde, precoitem)" +
                         " values (?,?,?,?);";
            //envia sql para o banco de dados
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, this.getIdproduto());
            stm.setInt(2, this.getIdvenda());
            stm.setFloat(3, this.qtde);
            stm.setFloat(4, this.precoItem);
            stm.execute();
        } catch (SQLException ex){
            throw new RuntimeException("Erro cadastro itens: " + ex.getMessage());
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
