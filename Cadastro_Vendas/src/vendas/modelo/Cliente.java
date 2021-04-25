/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendas.modelo;

import utils.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author 69146
 */
public class Cliente {
    private int idcliente;
    protected String nome;
    protected String email;
    protected String fone;

    
    public Cliente(String nome, String email, String fone) {
        this.nome = nome;
        this.email = email;
        this.fone = fone;
    }

    public Cliente(int idcliente, String nome, String email, String fone) {
        this.idcliente = idcliente;
        this.nome = nome;
        this.email = email;
        this.fone = fone;
    }
    
    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}
