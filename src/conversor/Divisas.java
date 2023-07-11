package conversor;

import javax.swing.JOptionPane;


public class Divisas extends javax.swing.JFrame {
double valor; 

    public Divisas() {
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

        texto_divisas = new javax.swing.JTextField();
        DIVISA2 = new javax.swing.JComboBox<>();
        divisa1 = new javax.swing.JComboBox<>();
        convertir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        texto_divisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_divisasActionPerformed(evt);
            }
        });

        DIVISA2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "LIB", "YEN", "WON-SC", "PESO" }));
        DIVISA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIVISA2ActionPerformed(evt);
            }
        });

        divisa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "LIB", "YEN", "WON-SC", "PESO" }));
        divisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisa1ActionPerformed(evt);
            }
        });

        convertir.setText("CONVERTIR");
        convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirActionPerformed(evt);
            }
        });

        resultado.setColumns(20);
        resultado.setRows(5);
        jScrollPane1.setViewportView(resultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DIVISA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_divisas, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(convertir)
                    .addComponent(divisa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_divisas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divisa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(convertir)
                            .addComponent(DIVISA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texto_divisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_divisasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_divisasActionPerformed

    private void DIVISA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIVISA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DIVISA2ActionPerformed

    private void divisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisa1ActionPerformed
        
    }//GEN-LAST:event_divisa1ActionPerformed

    private void convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirActionPerformed
        valor= Double.parseDouble(texto_divisas.getText());
        int divisa= divisa1.getSelectedIndex();
        int  divisa2= DIVISA2.getSelectedIndex();        
        
        
        //puente
        Operaciones puente= new Operaciones();
        puente.setValor(valor);
        puente.setDivisa(divisa);
        puente.setDivisa2(divisa2);
        //ejecutar metodo
        
         
       double resultadoFinal= puente.convertir();
        
        resultado.setText("");
        resultado.append(""+resultadoFinal);
        
          int opcion = JOptionPane.showConfirmDialog(null, "¿Desea hacer otra conversión?", "Confirmar", JOptionPane.YES_NO_OPTION);

   if (opcion == JOptionPane.YES_OPTION) {
       // Reiniciar la interfaz para hacer otra conversión
       texto_divisas.setText("");
       resultado.setText("");
   } else {
       // Cerrar la ventana actual y mostrar MainApp
       dispose();
       MainApp mainApp = new MainApp();
       mainApp.setVisible(true);
   }
        
    }//GEN-LAST:event_convertirActionPerformed

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
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Divisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DIVISA2;
    private javax.swing.JButton convertir;
    private javax.swing.JComboBox<String> divisa1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultado;
    private javax.swing.JTextField texto_divisas;
    // End of variables declaration//GEN-END:variables
}
