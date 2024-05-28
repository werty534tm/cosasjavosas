/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

/**
 * Panel que maneja la búsqueda de inmuebles realizada por el usuario.
 * Éste podrá especificar ciertos aspectos de la búsqueda, tales como la ciudad del inmueble, el tipo de este y ordenar los resultados según lo escogido.
 * @author luver
 */

import clases.Cliente;
import clases.Inmueble;
import clases.Datos;
import java.util.ArrayList;
import javax.swing.JTable;

public class BusquedaInmuebles extends javax.swing.JFrame {

    PanelParticular main;
    Cliente cliente;
    int numInmuebles = Datos.lista_inmuebles.size();
    
    /**
     * Creates new form BusquedaInmuebles
     */
    public BusquedaInmuebles() {
        initComponents();
    }
    
    /**
     * Crea e inicializa la ventana.
     * Inicialmente se muestran los inmuebles en el orden en el que están en el ArrayList que los contiene
     * @param pp Panel de origen
     * @param c Cliente de la sesión
     */
    public BusquedaInmuebles(PanelParticular pp, Cliente c) {
        initComponents();
        main = pp;
        cliente = c;
        main.setVisible(false);
        for (int i = 0;i<Datos.lista_inmuebles.size();i++) {
            Inmueble in = Datos.lista_inmuebles.get(i);
            System.out.println(in.toString());
            this.jTable1.setValueAt(in.getTitulo(),i,0);
            this.jTable1.setValueAt(in.getDireccion().getCiudad(), i, 1);
            this.jTable1.setValueAt(in.getTipoPropiedad(), i, 2);
            this.jTable1.setValueAt(in.getPrecioNoche(), i , 3);
            this.jTable1.setValueAt(in.getCalificacion(), i, 4);
        }
        this.setVisible(true);
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
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("C059", 0, 36)); // NOI18N
        jLabel1.setText("JavaBnB");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 2, 18)); // NOI18N
        jLabel2.setText("Búsqueda de inmuebles");

        jLabel3.setText("Ordenar por:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Relevancia", "Precio (de menor a mayor)", "Precio (de mayor a menor)" }));

        jLabel4.setText("Tipo de inmueble:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cualquiera", "Casa", "Apartamento" }));

        jLabel5.setText("Ciudad:");

        jButton1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jButton1.setText("<html><center><p>Volver a</p><p>buscar</p></center>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<html><center><p>Ver detalles</p><p>del inmueble</p><p>seleccionado</p></center>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Volver al panel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Título", "Ciudad", "Tipo", "Precio / Noche", "Calificación media"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(84, 84, 84)))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        main.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    /**
     * Limpia la tabla
     * @param jt Tabla a limpiar
     */
    private void limpiarTabla(JTable jt) {
        for (int i = 0;i<numInmuebles;i++){
            jt.setValueAt(null,i,0);
            jt.setValueAt(null, i, 1);
            jt.setValueAt(null, i, 2);
            jt.setValueAt(null, i , 3);
            jt.setValueAt(null, i, 4);
        }
    }

    private void añadirInmueble(Inmueble in, JTable jt, int fila) {
        jt.setValueAt(in.getTitulo(),fila,0);
        jt.setValueAt(in.getDireccion().getCiudad(), fila, 1);
        jt.setValueAt(in.getTipoPropiedad(), fila, 2);
        jt.setValueAt(in.getPrecioNoche(), fila , 3);
        jt.setValueAt(in.getCalificacion(), fila, 4);
        
    }
    
    /**
     * Vuelve a realizar la búsqueda de inmuebles según los parámetros especificados
     * @param evt Click en el botón
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Limpieza de tabla
        limpiarTabla(this.jTable1);
        
        // Selección de inmuebles de la ciudad especificada
        ArrayList<Inmueble> inSel1 = new ArrayList<>();
        for (int i = 0;i<numInmuebles;i++) {
            Inmueble in = Datos.lista_inmuebles.get(i);
            if (jTextField1.getText().equals("")) {
                añadirInmueble(in,this.jTable1,i);
                inSel1.add(Datos.lista_inmuebles.get(i));
            } else {
                if (in.getDireccion().getCiudad().equals(jTextField1.getText())) {
                    inSel1.add(in);
                }
                for (int j = 0;j < inSel1.size();j++) {
                    Inmueble inselecc = inSel1.get(j);
                    añadirInmueble(inselecc, this.jTable1,j);
                }
            }
        }
        System.out.println(inSel1.toString());
        
        // Selección de inmuebles por tipo
        ArrayList<Inmueble> inSel2 = new ArrayList<>();
        if (this.jComboBox2.getSelectedIndex()==1) { // Mostrar casas
            for (int k = 0;k < inSel1.size();k++) {
                if (inSel1.get(k).getTipoPropiedad().equals("Casa")) {
                    inSel2.add(inSel1.get(k));
                }
            }
            limpiarTabla(this.jTable1);
            for (int l = 0;l < inSel2.size();l++) {
                añadirInmueble(inSel2.get(l),this.jTable1,l);
            }
        } else if (this.jComboBox2.getSelectedIndex()==2) { // Mostrar apartamentos
            for (int k = 0;k < inSel1.size();k++) {
                if (inSel1.get(k).getTipoPropiedad().equals("Apartamento")) {
                    inSel2.add(inSel1.get(k));
                }
            }
            limpiarTabla(this.jTable1);
            for (int l = 0;l < inSel2.size();l++) {
                añadirInmueble(inSel2.get(l),this.jTable1,l);
            }
        } else { // Mostrar todo
            for (int k = 0;k < inSel1.size();k++) {
                inSel2.add(inSel1.get(k));
            }
        }
        
        System.out.println(inSel2.toString());
        // Ordenación de inmuebles según la opción
        if (this.jComboBox1.getSelectedIndex()==0) { // Ordenar por relevancia
            Inmueble inTemp;
            int inTempIndex;
            boolean ordenado;
            for (int m = 0;m < inSel2.size() - 1;m++) {
                ordenado = true;
                for (int n = 0;n < inSel2.size()-m-1;n++) {
                    if (inSel2.get(n).getCalificacion() < inSel2.get(n+1).getCalificacion()) {
                        inTemp = inSel2.get(n);
                        inTempIndex = inSel2.indexOf(inTemp);
                        inSel2.set(inTempIndex, inSel2.get(n+1));
                        inSel2.set(inTempIndex+1, inTemp);
                        ordenado = false;
                    }
                } if (ordenado) {
                    limpiarTabla(this.jTable1);
                    for (int o = 0;o < inSel2.size();o++) {
                        añadirInmueble(inSel2.get(o),this.jTable1,o);
                    }
                }
            }
        } else if (this.jComboBox1.getSelectedIndex()==1) { // Ordenar de menor a mayor precio
            Inmueble inTemp;
            int inTempIndex;
            boolean ordenado;
            for (int m = 0;m < inSel2.size() - 1;m++) {
                ordenado = true;
                for (int n = 0;n < inSel2.size()-m-1;n++) {
                    if (inSel2.get(n).getPrecioNoche() > inSel2.get(n+1).getPrecioNoche()) {
                        inTemp = inSel2.get(n);
                        inTempIndex = inSel2.indexOf(inTemp);
                        inSel2.set(inTempIndex, inSel2.get(n+1));
                        inSel2.set(inTempIndex+1, inTemp);
                        ordenado = false;
                    }
                } if (ordenado) {
                    limpiarTabla(this.jTable1);
                    for (int o = 0;o < inSel2.size();o++) {
                        añadirInmueble(inSel2.get(o),this.jTable1,o);
                    }
                }
            }
        } else if (this.jComboBox1.getSelectedIndex()==2) { // Ordenar de mayor a menor precio
            Inmueble inTemp;
            int inTempIndex;
            boolean ordenado;
            for (int m = 0;m < inSel2.size() - 1;m++) {
                ordenado = true;
                for (int n = 0;n < inSel2.size()-m-1;n++) {
                    if (inSel2.get(n).getPrecioNoche() < inSel2.get(n+1).getPrecioNoche()) {
                        inTemp = inSel2.get(n);
                        inTempIndex = inSel2.indexOf(inTemp);
                        inSel2.set(inTempIndex, inSel2.get(n+1));
                        inSel2.set(inTempIndex+1, inTemp);
                        ordenado = false;
                    }
                } if (ordenado) {
                    limpiarTabla(this.jTable1);
                    for (int o = 0;o < inSel2.size();o++) {
                        añadirInmueble(inSel2.get(o),this.jTable1,o);
                    }
                }
            }
        } System.out.println(inSel2.toString());
        limpiarTabla(this.jTable1);
        for (int o = 0;o < inSel2.size();o++) {
            añadirInmueble(inSel2.get(o),this.jTable1,o);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Abre los detalles del inmueble seleccionado en una ventana nueva.
     * @param evt Click en el botón
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String nombreInm = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 0).toString();
        int index = 0;
        for (Inmueble i : Datos.lista_inmuebles) {
            if (i.getTitulo().equals(nombreInm)) {
                index = Datos.lista_inmuebles.indexOf(i);
            }
        }
        InmuebleSeleccionado is = new InmuebleSeleccionado(this, Datos.lista_inmuebles.get(index), cliente);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Te lleva de vuelta a la ventana anterior
     * @param evt Click en el botón
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(BusquedaInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaInmuebles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
