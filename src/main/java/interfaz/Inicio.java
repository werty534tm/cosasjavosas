/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import clases.Anfitrión;
import clases.Cliente;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Muestra al usuario las opciones de inicio de sesión
 * @author luver
 */
public class Inicio extends javax.swing.JFrame {
    HashMap<String, Cliente> lista_clientes = new HashMap<>();
    HashMap<String, Anfitrión> lista_anfitriones = new HashMap<>();
    ArrayList<String> correos_clientes = new ArrayList<>();
    ArrayList<String> correos_anfitriones = new ArrayList<>();
    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonAdmin = new javax.swing.JButton();
        jButtonCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("C059", 0, 36)); // NOI18N
        jLabel1.setText("JavaBnB");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 2, 18)); // NOI18N
        jLabel2.setText("Inicio");

        jButtonAdmin.setFont(new java.awt.Font("DejaVu Sans", 0, 16)); // NOI18N
        jButtonAdmin.setText("<html><p>Acceder como</p><center><p>administrador</p></center>");
        jButtonAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdminActionPerformed(evt);
            }
        });

        jButtonCliente.setFont(new java.awt.Font("DejaVu Sans", 0, 16)); // NOI18N
        jButtonCliente.setText("<html><p>Acceder como</p>\n<center><p>cliente</p></center>");
        jButtonCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Te lleva a la pantalla de inicio de sesión de administradores
     * @param evt Click en el botón
     */
    private void jButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdminActionPerformed
        InicioSesionAdmin inicio_admin = new InicioSesionAdmin(this);
        inicio_admin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAdminActionPerformed

    /**
     * Te lleva a la pantalla de inicio de sesión de clientes
     * @param evt Click en el botón
     */
    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
        InicioSesionCliente inicio_cliente = new InicioSesionCliente(this);
        inicio_cliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdmin;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
