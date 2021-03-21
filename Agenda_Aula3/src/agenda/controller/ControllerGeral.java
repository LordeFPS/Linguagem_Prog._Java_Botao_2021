/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.controller;

import agenda.modelo.Contato;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 69146
 */
public class ControllerGeral {
    public List<Contato> contatos = new ArrayList<>();
    
    public void listarContatos(){
        for(Contato ct : contatos){
            System.out.println(ct.toString());
        }
    }
    
}
