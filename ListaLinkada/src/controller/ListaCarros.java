/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.LinkedList;
import modelo.Carro;

/**
 *
 * @author 69146
 */
public class ListaCarros {
    LinkedList<Carro> carros = new LinkedList();
    
    public void inserirCarro(Carro carro){
        carros.add(carro);
    }
    
    public void alterarCarro(int item, Carro carro) {
        carros.set(item, carro);
    }
    
    public void removerItem(int item) {
        carros.remove(item);
    }
    
    public void removerCarro(Carro carro) {
        carros.remove(carro);
    }
    
    public void listarCarro() {
        for (Carro obj : carros){
            System.out.println(obj.toString());
        }
    }
}
