/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroswing.telas;

import cadastroswing.entidades.Carro;
import cadastroswing.entidades.ListaCarros;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 69146
 */
public class CadastroCarros extends javax.swing.JFrame {

    ListaCarros listaCarros = new ListaCarros();
    
    List<String> listaFord = new ArrayList<>();
    private void preencheListaFord(){
        listaFord.removeAll(listaFord);
        listaFord.add("Ka");
        listaFord.add("Fiesta");
    }
    
    List<String> listaHyundai = new ArrayList<>();
    private void preencheListaHyundai(){
        listaHyundai.removeAll(listaHyundai);
        listaHyundai.add("HB20");
        listaHyundai.add("Creta");
    }
    
    List<String> listaMercedes = new ArrayList<>();
    private void preencheListaMercedes(){
        listaMercedes.removeAll(listaMercedes);
        listaMercedes.add("AMG A 45 S");
        listaMercedes.add("Class S S500");
        
    }
    
    private boolean validaDados(){
        if (jTPlaca.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Informe a placa");
            jTPlaca.requestFocus();
            return false;
        }else if (jCMarca.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(rootPane, "Informe a marca");
            jCMarca.requestFocus();
        }else if(jCMarca.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(rootPane, "Informe o modelo");
            jCModelo.requestFocus();
        }else if(jTAnoFabricao.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Informe o ano de fabricação");
            jTAnoFabricao.requestFocus();
        }
            return true;
    }
    private void limpaDados(){
        DefaultTableModel dtm = (DefaultTableModel) jTableCarros.getModel();
        dtm.setNumRows(0);
    }
    
    public CadastroCarros() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitulo = new javax.swing.JLabel();
        jLPlaca = new javax.swing.JLabel();
        jTPlaca = new javax.swing.JTextField();
        jLMarca = new javax.swing.JLabel();
        jCMarca = new javax.swing.JComboBox<>();
        jLModelo = new javax.swing.JLabel();
        jCModelo = new javax.swing.JComboBox<>();
        jLAnoFabricacao = new javax.swing.JLabel();
        jTAnoFabricao = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jBListarTodos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCarros = new javax.swing.JTable();
        jBInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTitulo.setText("Cadastro de Carros");

        jLPlaca.setText("Placa");

        jTPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPlacaActionPerformed(evt);
            }
        });

        jLMarca.setText("Marca");

        jCMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ford", "Hyundai", "Mercedes", "Chevrolette", "Toyota", "Volkswagen" }));
        jCMarca.setSelectedIndex(-1);
        jCMarca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCMarcaItemStateChanged(evt);
            }
        });
        jCMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCMarcaActionPerformed(evt);
            }
        });

        jLModelo.setText("Modelo");

        jCModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ka", "Fiesta", "Onix", "Corsa", "Gol", "Saveiro", "Corolla", "Hylux", "HB20", "AMG A 45 S" }));
        jCModelo.setSelectedIndex(-1);
        jCModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCModeloActionPerformed(evt);
            }
        });

        jLAnoFabricacao.setText("Ano de Fabricação");

        jTAnoFabricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTAnoFabricaoActionPerformed(evt);
            }
        });

        jButton1.setText("Salvar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBListarTodos.setText("Listar");
        jBListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarTodosActionPerformed(evt);
            }
        });

        jTableCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Marca", "Modelo", "Ano de Fabricação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCarros.setToolTipText("");
        jScrollPane1.setViewportView(jTableCarros);

        jBInserir.setText("Limpar");
        jBInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLModelo)
                                    .addComponent(jLMarca)
                                    .addComponent(jLPlaca)
                                    .addComponent(jLAnoFabricacao)
                                    .addComponent(jCMarca, 0, 93, Short.MAX_VALUE)
                                    .addComponent(jCModelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTAnoFabricao)
                                    .addComponent(jTPlaca)))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jBListarTodos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBInserir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLTitulo)
                .addContainerGap(227, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLPlaca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLAnoFabricacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTAnoFabricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBListarTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBInserir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPlacaActionPerformed

    private void jCMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCMarcaActionPerformed
        
    }//GEN-LAST:event_jCMarcaActionPerformed

    private void jTAnoFabricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTAnoFabricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTAnoFabricaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (validaDados()){
            Carro c = new Carro();
            c.setPlaca(jTPlaca.getText());
            c.setMarca(jCMarca.getItemAt(jCMarca.getSelectedIndex()));
            c.setModelo(jCModelo.getItemAt(jCModelo.getSelectedIndex()));
            c.setAnoFabricacao(Integer.parseInt(jTAnoFabricao.getText()));
            listaCarros.adiciona(c);
        }
        jTPlaca.setText("");
        jTAnoFabricao.setText("");
        jCMarca.setSelectedIndex(-1);
        jCModelo.setSelectedIndex(-1);
        jTPlaca.requestFocus();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jBListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarTodosActionPerformed
        
        DefaultTableModel dtm = (DefaultTableModel) jTableCarros.getModel();
        dtm.setNumRows(0);
        List<Carro> lista = listaCarros.getLista();
        int size = dtm.getRowCount();
        
        for (Carro carro : lista){
            
            dtm.addRow(new Object[]{carro.getPlaca(),
                                    carro.getMarca(),
                                    carro.getModelo(),
                                    carro.getAnoFabricacao()
                                    });
        }
        jTPlaca.setText("");
        jTAnoFabricao.setText("");
        jCMarca.setSelectedIndex(-1);
        jCModelo.setSelectedIndex(-1);
        jTPlaca.requestFocus();
        
    }//GEN-LAST:event_jBListarTodosActionPerformed

    private void jCModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCModeloActionPerformed
        
    }//GEN-LAST:event_jCModeloActionPerformed

    private void jCMarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCMarcaItemStateChanged
        /*
        ## Método manual para preecher os campos do Modelo.
        jCModelo.removeAllItems();
        if (jCMarca.getSelectedIndex() == 0){//Ford
            jCModelo.addItem("Ka");
            jCModelo.addItem("Fiesta");
        }
        */
        jCModelo.removeAllItems();
        switch (jCMarca.getSelectedIndex()) {
            case 0:
                //Ford
                jCModelo.removeAllItems();
                preencheListaFord();
                for(String item : listaFord){
                    jCModelo.addItem(item);
                }   
                break;
            case 1:
                //Hyundai
                jCModelo.removeAllItems();
                preencheListaHyundai();
                for(String item : listaHyundai){
                    jCModelo.addItem(item);
                }   
                break;
            case 2:
                //Mercedes
                jCModelo.removeAllItems();
                preencheListaMercedes();
                for(String item: listaMercedes){
                    jCModelo.addItem(item);
                }   
                break;
            default:
                jCModelo.addItem("Não existe modelo");
        }
    }//GEN-LAST:event_jCMarcaItemStateChanged

    private void jBInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInserirActionPerformed
        limpaDados();
    }//GEN-LAST:event_jBInserirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCarros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBInserir;
    private javax.swing.JButton jBListarTodos;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCMarca;
    private javax.swing.JComboBox<String> jCModelo;
    private javax.swing.JLabel jLAnoFabricacao;
    private javax.swing.JLabel jLMarca;
    private javax.swing.JLabel jLModelo;
    private javax.swing.JLabel jLPlaca;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAnoFabricao;
    private javax.swing.JTextField jTPlaca;
    private javax.swing.JTable jTableCarros;
    // End of variables declaration//GEN-END:variables
}
