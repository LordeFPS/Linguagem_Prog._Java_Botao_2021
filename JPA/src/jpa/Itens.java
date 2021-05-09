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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author 69146
 */
@Entity
public class Itens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int quantidade;
    private float preco;
    
    @OneToOne
    @JoinColumn(name = "idproduto")
    private Produto idproduto;
    
    @OneToOne
    @JoinColumn(name = "idvenda")
    private Venda idvenda;

    public Itens() {
    }

    public Itens(int quantidade, float preco, Produto idproduto, Venda idvenda) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.idproduto = idproduto;
        this.idvenda = idvenda;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Produto getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Produto idproduto) {
        this.idproduto = idproduto;
    }

    public Venda getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(Venda idvenda) {
        this.idvenda = idvenda;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Itens{id=").append(id);
        sb.append(", quantidade=").append(quantidade);
        sb.append(", preco=").append(preco);
        sb.append(", idproduto=").append(idproduto);
        sb.append(", idvenda=").append(idvenda);
        sb.append('}');
        return sb.toString();
    }
    
    
        
    
}
