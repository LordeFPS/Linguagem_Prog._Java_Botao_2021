/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroswing;

import cadastroswing.telas.CadastroUsuario;

/**
 *
 * @author 69146
 */
public class CadastroSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        telaUsuario();
    }
    public static void telaUsuario() {
        new CadastroUsuario().setVisible(true);
    }
}
