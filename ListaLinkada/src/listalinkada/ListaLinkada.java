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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        carros();
    }
    
    public static void carros() {
        Carro carro = new Carro("abs-123", "AMG A45S", "Mercedes", 2021, "Preto");
        
        ListaCarros lista = new ListaCarros();
        lista.inserirCarro(carro);
        
        lista.listarCarro();
        
        boolean continuar = true;
        
        while (continuar){
            
            int menu = menuLista();
            
            if (menu == 1){
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
                lista.inserirCarro(new Carro(placa, modelo, marca, 
                                                anoFabricado, cor));   
            }else if (menu == 2){
                System.out.print("Digite a posição: ");
                int posicao = leitor.nextInt();
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
                lista.alterarCarro(posicao, new Carro(placa, modelo, marca, 
                                                anoFabricado, cor));
            }else if (menu == 3){
                System.out.print("Digite a posicao para excluir: ");
                int posicao = leitor.nextInt();
                lista.removerItem(posicao);
            }else if (menu == 4){
                
                //System.out.print("Digite a placa: ");
                //String placa = leitor.next();
                //lista.removerCarro(placa);
                
            }else if (menu == 5){
                System.out.println("Lista Criada ↓");
                lista.listarCarro();
            }else if (menu == 6){
                System.out.println("Saiu da lista.");
                break;
            }
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
    
}
