/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.modelo;

import java.sql.Date;
import java.sql.Time;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import utils.ConexaoDB;

/**
 *
 * @author 69146
 */
public class Compromisso {
    private Contato contato;
    private String data;
    private String hora;
    private String local;
    private String observacao;
    
    public Compromisso() {    
    }

    public Compromisso(Contato contato, String data, String hora, String local, String observacao) {
        this.contato = contato;
        this.data = data;
        this.hora = hora;
        this.local = local;
        this.observacao = observacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Compromisso{" + "contato=" + contato + ", data=" + data + ", hora=" + hora + ", local=" + local + ", observacao=" + observacao + '}';
    }
    
    public boolean salvar(){
        try {
        //conectar ao banco
            Connection  con = ConexaoDB.getConexao();
            //montar sql
            String sql = "insert into compromisso (contatoid, datacp, hora, localcp, observacao)" +
                         "values (?,?,?,?,?)";

            //envia sql para o banco de dados
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, this.contato.getContatoid());
            stm.setString(2, this.data);
            stm.setString(3, this.hora);
            stm.setString(4, this.local);
            stm.setString(5, this.observacao);
            stm.execute();// Execute manda as informalções para o banco
        } catch (SQLException ex){
            System.out.println("Erro: " + ex.getMessage());
            return false;
        }
        return true;
    }
    
}
