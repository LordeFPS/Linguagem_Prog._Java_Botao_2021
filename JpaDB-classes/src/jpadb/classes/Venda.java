/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpadb.classes;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author 69146
 */
@Entity
@Table(name = "venda")
@NamedQueries({
    @NamedQuery(name = "Venda.findAll", query = "SELECT v FROM Venda v"),
    @NamedQuery(name = "Venda.findByIdvenda", query = "SELECT v FROM Venda v WHERE v.idvenda = :idvenda"),
    @NamedQuery(name = "Venda.findByDatavenda", query = "SELECT v FROM Venda v WHERE v.datavenda = :datavenda")})
public class Venda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idvenda")
    private Long idvenda;
    @Column(name = "datavenda")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datavenda;
    @OneToMany(mappedBy = "idvenda")
    private Collection<Itens> itensCollection;

    public Venda() {
    }

    public Venda(Long idvenda) {
        this.idvenda = idvenda;
    }

    public Long getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(Long idvenda) {
        this.idvenda = idvenda;
    }

    public Date getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(Date datavenda) {
        this.datavenda = datavenda;
    }

    public Collection<Itens> getItensCollection() {
        return itensCollection;
    }

    public void setItensCollection(Collection<Itens> itensCollection) {
        this.itensCollection = itensCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvenda != null ? idvenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venda)) {
            return false;
        }
        Venda other = (Venda) object;
        if ((this.idvenda == null && other.idvenda != null) || (this.idvenda != null && !this.idvenda.equals(other.idvenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpadb.classes.Venda[ idvenda=" + idvenda + " ]";
    }
    
}
