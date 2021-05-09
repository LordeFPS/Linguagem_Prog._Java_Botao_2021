/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpadb.classes;

/**
 *
 * @author 69146
 */
public class JpaDBClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(Produto p : DAO.getAllProdutos()){
           System.out.println(p.toString());
       }
    }
    
}
