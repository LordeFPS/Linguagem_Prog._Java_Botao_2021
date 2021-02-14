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
        if (carros.contains(carro)){
            System.out.println("Ja existe este Carro.");
        }else{
            carros.add(carro);
        }
    }
    
    public void alterarCarro(int item, Carro carro) {
        carros.set(item, carro);
    }
    
    public void removerItem(int item) {
        carros.remove(item);
    }
    
    public void removerCarro(Carro carro) {
        int ret = carros.indexOf(carro.getPlaca());
        if (ret >= 0){
            carros.remove(carro);
        }else{
            System.out.println("Não existe esta placa.");
        }
    }
    
    public void listarCarro() {
        for (int i = 0; i < carros.size(); i++){
            System.out.println(i + " - " + carros.get(i));
        }
    }
}
