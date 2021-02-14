/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 69146
 */
public class Aula1 {
    static Scanner leitor = new Scanner(System.in);
    static List<String> lista = new ArrayList<>();
            
    public static void main(String[] args) {
        //manipulandoListas();
        usuarioLista();
    }
    
    public static void manipulandoListas() {
        List<String> carros = new ArrayList<>();
        carros.add("Fusca");
        carros.add("Kombi");
        carros.add("Chevette");
        carros.add("Brasilia");
        
        for (int i = 0; i < carros.size(); i++){
            System.out.println(carros.get(i));
        }
        
        System.out.println("");
            
        carros.add(0,"Troller");
        carros.add("TL");
        for (String carro: carros ){
            System.out.println(carro);
        }
        
        //System.out.println(carros.indexOf("Troller"));
        
        if (carros.indexOf("TL") != -1){
            System.out.println("TL - Já existe");
        }else {
            System.out.println("TL - Não existe");
        }
    }
    
    public static void usuarioLista() {
         /*
        1 - Criar um método para inserir dados na lista;
            O usuário vai digitar os dados;
            Não permitir registros duplicados na lista;
        2 - Criar um método para listar os registros inseridos;
        */
        boolean continuar = true;
        while (continuar){
            System.out.println("Digite uma marca");
            String marca = leitor.next();
            inserirLista(marca);
            
            System.out.println("Deseja continuar? (S/N) ");
            String opcao = leitor.next();
            
            continuar = opcao.toUpperCase().equals("S");
        }
        
        listarLista();
    }
    public static void inserirLista(String str) {
        /*
        1 - Criar um método para inserir dados na lista;
            O usuário vai digitar os dados;
            Não permitir registros duplicados na lista;
        2 - Criar um método para listar os registros inseridos;
        */
        if (lista.contains(str)){//verificar se existe algo dentro da lista
        //if (lista.indexOf(str) >= 0){
            System.out.println("Este valor ja existe");  
        }else {
            lista.add(str);
        }
    }
    
    public static void listarLista() {
        /*
        1 - Criar um método para inserir dados na lista;
            O usuário vai digitar os dados;
            Não permitir registros duplicados na lista;
        2 - Criar um método para listar os registros inseridos;
        */
        System.out.println("Lista ↓");
        for (String listar : lista){
            System.out.println(listar);
        }
    }
}
