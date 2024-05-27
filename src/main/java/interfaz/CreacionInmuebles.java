/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

/**
 *
 * @author luver
 */

import clases.FuncionesImagenes;
import clases.Inmueble;
import clases.Direccion;
import clases.DatosInmueble;
import clases.Datos;
import clases.Reseña;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.ArrayList;

public class CreacionInmuebles extends javax.swing.JFrame {
    private PanelAnfitrion panel;
    private File imgTemp;
    DefaultListModel serviciosTemp = new DefaultListModel();
    
    /**
     * Creates new form CreacionInmuebles
     */
    public CreacionInmuebles(PanelAnfitrion panel) {
        initComponents();
        this.panel = panel;
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
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldCalle = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCiudad = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jFormattedTextFieldNhuespedes = new javax.swing.JFormattedTextField();
        jFormattedTextFieldNhabitaciones = new javax.swing.JFormattedTextField();
        jFormattedTextFieldNcamas = new javax.swing.JFormattedTextField();
        jFormattedTextFieldNbaños = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jFormattedTextFieldPrecioNoche = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListServicios = new javax.swing.JList<>();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldAñadirServicio = new javax.swing.JTextField();
        jButtonAñadirServicio = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldNombreImagen = new javax.swing.JTextField();
        jButtonSeleccImg = new javax.swing.JButton();
        jButtonCrearInmueble = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButtonGuardarImg = new javax.swing.JButton();
        jButtonBorrarServicio = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("C059", 0, 36)); // NOI18N
        jLabel1.setText("JavaBnB");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 2, 18)); // NOI18N
        jLabel2.setText("Creación de inmuebles");

        jLabel3.setText("Título");

        jLabel4.setText("Calle");

        jLabel5.setText("Número");

        jLabel6.setText("Tipo de propiedad");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Apartamento" }));

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 2, 14)); // NOI18N
        jLabel7.setText("Dirección");

        jLabel8.setText("Código postal");

        jLabel9.setText("Ciudad");

        jLabel10.setText("Número de huéspedes");

        jLabel11.setText("Numero de habitaciones");

        jLabel12.setText("Número de camas");

        jLabel13.setText("Número de baños");

        jFormattedTextFieldNhuespedes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jFormattedTextFieldNhabitaciones.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jFormattedTextFieldNcamas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jFormattedTextFieldNbaños.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel14.setText("Precio / noche");

        jFormattedTextFieldPrecioNoche.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel15.setFont(new java.awt.Font("DejaVu Sans", 2, 14)); // NOI18N
        jLabel15.setText("Servicios");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel16.setText("Lista de servicios");

        jListServicios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListServicios);

        jLabel17.setText("Servicio a añadir");

        jButtonAñadirServicio.setText("Añadir a lista");
        jButtonAñadirServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirServicioActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("DejaVu Sans", 2, 14)); // NOI18N
        jLabel18.setText("Fotografía");

        jLabel20.setText("Nombre de la imagen");

        jTextFieldNombreImagen.setEditable(false);

        jButtonSeleccImg.setText("Seleccionar imagen");
        jButtonSeleccImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccImgActionPerformed(evt);
            }
        });

        jButtonCrearInmueble.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jButtonCrearInmueble.setText("Crear inmueble");
        jButtonCrearInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearInmuebleActionPerformed(evt);
            }
        });

        jButton4.setText("Volver al panel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButtonGuardarImg.setText("Guardar imagen");
        jButtonGuardarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarImgActionPerformed(evt);
            }
        });

        jButtonBorrarServicio.setText("<html><center><p>Eliminar servicio</p><p>seleccionado</p></center>");
        jButtonBorrarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarServicioActionPerformed(evt);
            }
        });

        jLabel21.setText("€");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel14))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jFormattedTextFieldPrecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel21))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jFormattedTextFieldNbaños, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jFormattedTextFieldNcamas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel10))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jFormattedTextFieldNhuespedes, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                        .addComponent(jFormattedTextFieldNhabitaciones)))
                                .addComponent(jSeparator4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonCrearInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jButton4)))))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldAñadirServicio)
                                    .addComponent(jButtonAñadirServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jButtonBorrarServicio)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel18))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSeleccImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNombreImagen)
                                    .addComponent(jButtonGuardarImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCP, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2))
                                .addComponent(jSeparator2)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)))
                        .addGap(0, 23, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jFormattedTextFieldNhuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jFormattedTextFieldNhabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jFormattedTextFieldNcamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jFormattedTextFieldNbaños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jFormattedTextFieldPrecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButtonCrearInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAñadirServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAñadirServicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonBorrarServicio)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNombreImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSeleccImg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonGuardarImg)
                                .addGap(35, 35, 35))))
                    .addComponent(jSeparator3))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSeleccImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccImgActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("JPG, JPEG, PNG, GIF","jpg", "jpeg", "png", "gif");
        fc.setFileFilter(imgFilter);
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            // Mostrar imagen
            imgTemp = fc.getSelectedFile();
            String img = imgTemp.getPath();
            System.out.println(img);
            FuncionesImagenes.cargarImagen(jLabel19, img);
            // Mostrar ruta de imagen
            jTextFieldNombreImagen.setText(imgTemp.getName());
        }
    }//GEN-LAST:event_jButtonSeleccImgActionPerformed

    private void jButtonGuardarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarImgActionPerformed
        // TODO add your handling code here:
        FuncionesImagenes.guardarImagen(imgTemp);
    }//GEN-LAST:event_jButtonGuardarImgActionPerformed

    private void jButtonCrearInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearInmuebleActionPerformed
        // TODO add your handling code here:
        String titulo = this.jTextFieldTitulo.getText();
        String calle = this.jTextFieldCalle.getText();
        int numero = Integer.parseInt(this.jTextFieldNumero.getText());
        String codigoPostal = this.jTextFieldCP.getText();
        String ciudad = this.jTextFieldCiudad.getText();
        int huespedes = ((Number) this.jFormattedTextFieldNhuespedes.getValue()).intValue();
        int habitaciones = ((Number) this.jFormattedTextFieldNhabitaciones.getValue()).intValue();
        int camas = ((Number) this.jFormattedTextFieldNcamas.getValue()).intValue();
        int baños = ((Number) this.jFormattedTextFieldNbaños.getValue()).intValue();
        String tipoPropiedad = this.jComboBoxTipo.getSelectedItem().toString();
        double precioNoche = ((Number) this.jFormattedTextFieldPrecioNoche.getValue()).doubleValue();
        ArrayList<String> servicios = new ArrayList<>(); // funcionamiento a añadir
        for (int i = 0;i < serviciosTemp.getSize();i++) {
            servicios.add(serviciosTemp.get(i).toString());
        }
        String fotografia = this.jTextFieldNombreImagen.getText();
        if (!titulo.equals("")&!calle.equals("")&!codigoPostal.equals("")&!ciudad.equals("")&!tipoPropiedad.equals("")){
            if (!this.jTextFieldNumero.getText().equals("")&!this.jFormattedTextFieldPrecioNoche.getText().equals("") // falta comprobación de que esté el inmueble ya en el almacenamiento
                    &!this.jFormattedTextFieldNhuespedes.getText().equals("")&!this.jFormattedTextFieldNhabitaciones.getText().equals("")
                    &!this.jFormattedTextFieldNcamas.getText().equals("")&!this.jFormattedTextFieldNbaños.getText().equals("")){
                Direccion direccion = new Direccion(calle, numero, codigoPostal, ciudad);
                DatosInmueble datosInmueble = new DatosInmueble(huespedes, habitaciones, camas, baños);
                Inmueble inmueble = new Inmueble(titulo, direccion, datosInmueble, tipoPropiedad, precioNoche, servicios, fotografia, new ArrayList<Reseña>());
                if (Datos.lista_inmuebles.isEmpty()) {
                    System.out.println("¡Inmueble creado!");
                    System.out.println("Datos del inmueble creado: "+inmueble.toString());
                    Datos.lista_inmuebles.add(inmueble);
                    System.out.println(Datos.lista_inmuebles);
                } else {
                    boolean esisten = false;
                    for (int i = 0;i < Datos.lista_inmuebles.size();i++) {
                        Inmueble in = Datos.lista_inmuebles.get(i);
                        if (in.getTitulo().equals(titulo)) {
                            esisten = true;
                            JOptionPane.showMessageDialog(this,
                                    "Un inmueble con el mismo título ya ha sido añadido. No se ha procedido con la creación del inmueble",
                                    "Error al crear el inmueble", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    if(!esisten){
                        System.out.println("¡Inmueble creado!");
                                System.out.println("Datos del inmueble creado: "+inmueble.toString());
                                Datos.lista_inmuebles.add(inmueble);
                                System.out.println(Datos.lista_inmuebles);
                                Datos.guardarDatos("./backup.txt");
                    }
                }
                
                
            } else {
                System.out.println("Faltan datos");
            }
        } else {
            System.out.println("Faltan datos");
        }
        //Datos.guardarDatos("./backup.txt");
    }//GEN-LAST:event_jButtonCrearInmuebleActionPerformed

    private void jButtonAñadirServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirServicioActionPerformed
        // TODO add your handling code here:
        if (!this.jTextFieldAñadirServicio.getText().equals("")) {
            serviciosTemp.addElement(this.jTextFieldAñadirServicio.getText());
            this.jListServicios.setModel(serviciosTemp);
            this.jTextFieldAñadirServicio.setText("");
            System.out.println(serviciosTemp.toString());
        } else {
            JOptionPane.showMessageDialog(this,
                    "El campo de texto está vacío. No se ha añadido ningún servicio","Advertencia",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAñadirServicioActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.panel.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonBorrarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarServicioActionPerformed
        // TODO add your handling code here:
        serviciosTemp.remove(this.jListServicios.getSelectedIndex());
        this.jListServicios.setModel(serviciosTemp);
    }//GEN-LAST:event_jButtonBorrarServicioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAñadirServicio;
    private javax.swing.JButton jButtonBorrarServicio;
    private javax.swing.JButton jButtonCrearInmueble;
    private javax.swing.JButton jButtonGuardarImg;
    private javax.swing.JButton jButtonSeleccImg;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JFormattedTextField jFormattedTextFieldNbaños;
    private javax.swing.JFormattedTextField jFormattedTextFieldNcamas;
    private javax.swing.JFormattedTextField jFormattedTextFieldNhabitaciones;
    private javax.swing.JFormattedTextField jFormattedTextFieldNhuespedes;
    private javax.swing.JFormattedTextField jFormattedTextFieldPrecioNoche;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListServicios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextFieldAñadirServicio;
    private javax.swing.JTextField jTextFieldCP;
    private javax.swing.JTextField jTextFieldCalle;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldNombreImagen;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
