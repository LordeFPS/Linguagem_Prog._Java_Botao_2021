/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpadb.classes;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author 69146
 */
public class DAO {

    public void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaDB-classesPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public static List<Produto> getAllProdutos() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaDB-classesPU");
        EntityManager em = emf.createEntityManager();
        TypedQuery<Produto> tp = em.createQuery("SELECT p FROM Produto p", Produto.class);
        return tp.getResultList();
    }   
    
}
