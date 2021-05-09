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
import java.util.Date;

/**
 *
 * @author 69146
 */
@Entity
public class Venda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idvenda;
    private Date dataVenda;

    public Venda() {
    }

    public Venda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Date getData() {
        return dataVenda;
    }

    public void setData(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Long getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(Long idvenda) {
        this.idvenda = idvenda;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venda{idvenda=").append(idvenda);
        sb.append(", Data=").append(dataVenda);
        sb.append('}');
        return sb.toString();
    }
     
}
