/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listalinkada;

import controller.ListaCarros;
import java.util.Scanner;
import modelo.Carro;

/**
 *
 * @author 69146
 */
public class ListaLinkada {
    static Scanner leitor = new Scanner(System.in);
    static ListaCarros lista = new ListaCarros();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        carros();
    }
    
    public static void carros() {
        Carro carro = new Carro("abc-1234", "Fiesta", "Ford", 2021, "Preto");
        
        
        lista.inserirCarro(carro);
        
        lista.listarCarro();
        
        boolean continuar = true;
        
        while (continuar){
            
            int menu = menuLista();
            
            if (menu == 1){
                inserir(); 
            }else if (menu == 2){
                atualizar();
            }else if (menu == 3){
                removerItem();
            }else if (menu == 4){
                removerObj();               
            }else if (menu == 5){
                listar();
            }else if (menu == 6){
                System.out.println("Saiu da lista.");
                break;
            }
            System.out.println("Deseja continuar? S-sim");
            String opcao = leitor.next();
            continuar = opcao.toUpperCase().equals("S");
        }
        
    }
    
    public static int menuLista() {
        System.out.println("_____________________");
        System.out.println("__ 1 - Inserir     __");
        System.out.println("__ 2 - Atualizar   __");
        System.out.println("__ 3 - RemoverItem __");
        System.out.println("__ 4 - RemoverCarro__");
        System.out.println("__ 5 - Listar      __");
        System.out.println("__ 6 - Sair        __");
        System.out.println("_____________________");
        
        return leitor.nextInt();
    }
    
    static void inserir(){
        System.out.print("Digite a placa: ");
        String placa = leitor.next();
        System.out.print("Digite o modelo: ");
        String modelo = leitor.next();
        System.out.print("Digite a marca: ");
        String marca = leitor.next();
        System.out.print("Digite o ano Fabricado: ");
        int anoFabricado = leitor.nextInt();
        System.out.print("Digite a cor: ");
        String cor = leitor.next();
        lista.inserirCarro(new Carro(placa, modelo, marca, anoFabricado, cor));  
    }
    static void atualizar(){
        //System.out.print("Digite a posição: ");
        //int posicao = leitor.nextInt();
        System.out.print("Digite a placa existente: ");
        String placa = leitor.next();
        System.out.print("Digite a placa nova: ");
        String placaNova = leitor.next();
        System.out.print("Digite o modelo: ");
        String modelo = leitor.next();
        System.out.print("Digite a marca: ");
        String marca = leitor.next();
        System.out.print("Digite o ano Fabricado: ");
        int anoFabricado = leitor.nextInt();
        System.out.print("Digite a cor: ");
        String cor = leitor.next();
        lista.alterarCarro(lista.posicao(placa), new Carro(placaNova, modelo, marca, 
                                                anoFabricado, cor));
    }
    static void removerItem(){
        System.out.print("Digite a posicao para excluir: ");
        int posicao = leitor.nextInt();
        lista.removerItem(posicao);
        
    }
    static void removerObj(){
        //System.out.print("Digite a placa: ");
                //String placa = leitor.next();
                //lista.removerCarro(placa);
    }
    static void listar(){
        System.out.println("Lista Criada ↓");
        lista.listarCarro();
    }
    
}
