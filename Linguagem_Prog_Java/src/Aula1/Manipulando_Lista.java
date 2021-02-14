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
public class Manipulando_Lista {
    static List<Pessoa> lista = new ArrayList<>();
    static Scanner leitor = new Scanner(System.in);
    
    public static void main(String[] args) {
        manipularLista();
    }
    public static void manipularLista() {
        lista.add(new Pessoa("José","12345","jose@gmail.com"));
        lista.add(new Pessoa("João","789456","joao@gmail.com"));
        lista.add(new Pessoa("Maria","654895","maria@gmail.com"));
        //listarLista();
        
        
        boolean continuar = true;
        
        while (continuar){
            
            int menu = menuLista();
            
            if (menu == 1){
                System.out.print("Digite seu nome: ");
                String nome = leitor.next();
                System.out.print("Digite seu numero de telefone: ");
                String fone = leitor.next();
                System.out.print("Digite seu email: ");
                String email = leitor.next();
                inserirLista(nome, fone, email);
            }else if (menu == 2){
                System.out.print("Digite a posição: ");
                int posicao = leitor.nextInt();
                System.out.print("Insira um nome: ");
                String nome = leitor.next();
                System.out.print("Insira um numero de telefone: ");
                String fone = leitor.next();
                System.out.print("Insira um email: ");
                String email = leitor.next();
                atualizarLista(posicao, new Pessoa(nome, fone, email));
            }else if (menu == 3){
                System.out.print("Digige o ID para remover: ");
                int  remover = leitor.nextInt();
                removerLista(remover);
            }else if (menu == 4){
                
            }
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
    
    public static void inserirLista(String nome, String fone, String email) {
        if (lista.contains(email)){
            System.out.println("Já existe este email");
        }else{
            lista.add(new Pessoa(nome, fone, email));
        }
    }
    
    public static void atualizarLista(int posicao, Pessoa valor) {
        lista.set(posicao, valor);
    }
    
    public static void removerLista(int indice) {
        lista.remove(indice);
    }
    
    static void listarLista() {
        for (Pessoa obj : lista){
            System.out.println(obj.toString());
        }       
    }
}
