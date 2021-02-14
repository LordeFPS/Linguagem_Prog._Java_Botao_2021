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
            System.out.println("");
            //System.out.println("Escolha uma opção");
            int opcao = menuLista();
            
            if (opcao == 1){
                System.out.print("Digite uma marca: ");
                String marca = leitor.next();
                inserirLista(marca);
            }else if (opcao == 2){
                System.out.print("Informe a posição desejada: ");
                int posicao = leitor.nextInt();
                System.out.print("Informe uma marca: ");
                String marcaAtt = leitor.next();
                atualizarLista(posicao, marcaAtt);
            }else if (opcao == 3){
                System.out.print("Informe o nome para remover: ");
                String remover = leitor.next();
                removerLista(remover);
            }else if (opcao == 4){
                System.out.println("Lista criada ↓");
                listarLista();
            }else if (opcao == 5){
                System.out.println("Saiu da Lista");
                break;
            }else {
                System.out.println("Opção inválida!!");
            }
            continue;
        }
    }
    
    public static int menuLista() {
        System.out.println("___________________");
        System.out.println("__ 1 - Inserir   __");
        System.out.println("__ 2 - Atualizar __");
        System.out.println("__ 3 - Remover   __");
        System.out.println("__ 4 - Listar    __");
        System.out.println("__ 5 - Sair      __");
        System.out.println("___________________");
        
        return leitor.nextInt();
    }
    
    public static void inserirLista(String str) {
        /*
        1 - Criar um método para inserir dados na lista;
            O usuário vai digitar os dados;
            Não permitir registros duplicados na lista;
        2 - Criar um método para listar os registros inseridos;
        */
        if (lista.contains(str)){
        //"contains" verifica se existe algo dentro da lista
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
        
        for (int i = 0; i < lista.size(); i++){
            
            System.out.println(i + " - " + lista.get(i));
             
        }
    }
    
    public static void atualizarLista(int item, String valor) {
        
        lista.set(item, valor);
    }
    
    public static void removerLista(String valor) {
        
        lista.remove(valor);
    }
}
