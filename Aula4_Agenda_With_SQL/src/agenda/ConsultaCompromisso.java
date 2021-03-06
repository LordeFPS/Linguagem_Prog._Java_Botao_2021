/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import agenda.modelo.Compromisso;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 69146
 */
public class ConsultaCompromisso extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaCompromisso
     */
    
    public void ativaInformeData(boolean ativa){
        jFTFDataInicio.setVisible(ativa);
        jFTFDataFim.setVisible(ativa);
        jLDataInicio.setVisible(ativa);
        jLDataFim.setVisible(ativa); 
    }
    
    public void ativaHora(boolean ativa){
        jFTFHoraInicio.setVisible(ativa);
        jFTFHoraFim.setVisible(ativa);
        jLHoraInicio.setVisible(ativa);
        jLHoraFim.setVisible(ativa);
    }
    
    public void ativaLocal(boolean ativa){
        jTFLocal.setVisible(ativa); 
        jLLocal.setVisible(ativa); 
    }
    public void ativaContato(boolean ativa){
        jTFContato.setVisible(ativa);
        jLContato.setVisible(ativa);
    }
    
    public ConsultaCompromisso() {
        initComponents();
        ativaInformeData(false); 
        ativaHora(false);
        ativaLocal(false); 
        ativaContato(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCompromisso = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLDataInicio = new javax.swing.JLabel();
        jLDataFim = new javax.swing.JLabel();
        jFTFDataInicio = new javax.swing.JFormattedTextField();
        jFTFDataFim = new javax.swing.JFormattedTextField();
        jTFContato = new javax.swing.JTextField();
        jFTFHoraInicio = new javax.swing.JFormattedTextField();
        jFTFHoraFim = new javax.swing.JFormattedTextField();
        jLHoraInicio = new javax.swing.JLabel();
        jLHoraFim = new javax.swing.JLabel();
        jLContato = new javax.swing.JLabel();
        jLLocal = new javax.swing.JLabel();
        jTFLocal = new javax.swing.JTextField();

        jTableCompromisso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Contato", "Data", "Hora", "Local", "Observação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCompromisso);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Escolha as opções desejadas para listar na tabela");

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Geral", "Contato", "Data", "Hora", "Local" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLDataInicio.setText("Data Inicio");

        jLDataFim.setText("Data Fim");

        try {
            jFTFDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFTFDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTFContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFContatoActionPerformed(evt);
            }
        });

        try {
            jFTFHoraInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFHoraInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFHoraInicioActionPerformed(evt);
            }
        });

        try {
            jFTFHoraFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFHoraFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFHoraFimActionPerformed(evt);
            }
        });

        jLHoraInicio.setText("Hora Inicio");

        jLHoraFim.setText("Hora Fim");

        jLContato.setText("Informe Contato");

        jLLocal.setText("Informe Local");

        jTFLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFLocalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel1)
                .addContainerGap(261, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFTFDataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jLDataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLDataFim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFTFDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFTFHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFTFHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFContato, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLContato, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTFLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLContato)
                        .addGap(10, 10, 10)
                        .addComponent(jTFContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLLocal)
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLDataFim)
                                    .addComponent(jLHoraInicio)
                                    .addComponent(jLHoraFim))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jFTFDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFTFDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFTFHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFTFHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            ResultSet rs = null;
            Compromisso cp = new Compromisso();
            /*
            if (jComboBox1.getSelectedIndex() == 1){
                rs = cp.getFilterContato(jTFContato.getText());
            } else if(jComboBox1.getSelectedIndex() == 2){ 
                rs = cp.getFilterData(jFTFDataInicio.getText(), jFTFDataFim.getText());
            }else if(jComboBox1.getSelectedIndex() == 3){ 
                rs = cp.getFilterHora(jFTFHoraInicio.getText(), jFTFHoraFim.getText());
            }else if(jComboBox1.getSelectedIndex() == 4){ 
                rs = cp.getFilterLocal(jTFLocal.getText());
            }else{
                rs = cp.getAll();
            }*/
            
            switch (jComboBox1.getSelectedIndex()){
                case 1: rs = cp.getFilterContato(jTFContato.getText());
                        break;
                case 2: rs = cp.getFilterData(jFTFDataInicio.getText(), jFTFDataFim.getText());
                        break;
                case 3: rs = cp.getFilterHora(jFTFHoraInicio.getText(), jFTFHoraFim.getText());
                        break;
                case 4: rs = cp.getFilterLocal(jTFLocal.getText());
                        break;
                default:
                        rs = cp.getAll();
            }
            
            
            
        
            DefaultTableModel dtm = (DefaultTableModel) jTableCompromisso.getModel();
            dtm.setNumRows(0);
            while(rs.next()){
               dtm.addRow(new Object[]{rs.getString("nome"),
                                        rs.getString("datacp"),
                                        rs.getString("hora"),
                                        rs.getString("localcp"),
                                        rs.getString("observacao")
                                        }); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaCompromisso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        ativaContato(jComboBox1.getSelectedIndex() == 1);
        ativaInformeData(jComboBox1.getSelectedIndex() == 2);
        ativaHora(jComboBox1.getSelectedIndex() == 3);
        ativaLocal(jComboBox1.getSelectedIndex() == 4);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jTFContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFContatoActionPerformed

    private void jFTFHoraInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFHoraInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFHoraInicioActionPerformed

    private void jFTFHoraFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFHoraFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFHoraFimActionPerformed

    private void jTFLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFLocalActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaCompromisso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFTFDataFim;
    private javax.swing.JFormattedTextField jFTFDataInicio;
    private javax.swing.JFormattedTextField jFTFHoraFim;
    private javax.swing.JFormattedTextField jFTFHoraInicio;
    private javax.swing.JLabel jLContato;
    private javax.swing.JLabel jLDataFim;
    private javax.swing.JLabel jLDataInicio;
    private javax.swing.JLabel jLHoraFim;
    private javax.swing.JLabel jLHoraInicio;
    private javax.swing.JLabel jLLocal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFContato;
    private javax.swing.JTextField jTFLocal;
    private javax.swing.JTable jTableCompromisso;
    // End of variables declaration//GEN-END:variables
}
