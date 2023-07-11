/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conversor;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Usuario
 */
public class MainApp extends javax.swing.JFrame {

   
    public MainApp() {
   setTitle("Conversor de Unidades");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Crear componentes
        JLabel lblTitulo = new JLabel("Seleccione una opción:");
        JButton btnMonedas = new JButton("Convertir Monedas");
        JButton btnTemperaturas = new JButton("Convertir Temperaturas");

        // Establecer diseño
        setLayout(new GridLayout(3, 1));
        add(lblTitulo);
        add(btnMonedas);
        add(btnTemperaturas);

        // Agregar evento de acción al botón Convertir Monedas
        btnMonedas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Divisas conversorMonedas = new Divisas();
                conversorMonedas.setVisible(true);
                dispose();
            }
        });

        // Agregar evento de acción al botón Convertir Temperaturas
        btnTemperaturas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConversorTemperaturas conversorTemperaturas = new ConversorTemperaturas();
                conversorTemperaturas.setVisible(true);
                dispose();
            }
        });
    }



   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


       
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables


public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainApp mainApp = new MainApp();
                mainApp.setVisible(true);
            }
        });
    }
}
