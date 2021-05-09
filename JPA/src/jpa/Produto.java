/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Produto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idproduto;
    private String nome;
    private float preco;
    
    @ManyToOne
    @JoinColumn(name = "idcategoria")
    private Categoria idcategoria;

    public Produto() {
    }

    public Produto(String nome, float preco, Categoria idcategoria) {
        this.nome = nome;
        this.preco = preco;
        this.idcategoria = idcategoria;
    }


    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public long getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(long idproduto) {
        this.idproduto = idproduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Categoria idcategoria) {
        this.idcategoria = idcategoria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produto{idproduto=").append(idproduto);
        sb.append(", nome=").append(nome);
        sb.append(", preco=").append(preco);
        sb.append(", idcategoria=").append(idcategoria);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
