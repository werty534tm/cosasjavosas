/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

/**
 * Permite al particular seleccionar los días de entrada y salida del inmueble para reservarlo.
 * En caso de que el inmueble no esté disponible en las fechas seleccionadas no se procederá con la transacción
 * @author luver
 */

import clases.Reserva;
import clases.Inmueble;
import clases.Cliente;
import clases.Datos;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ReservaInmueble extends javax.swing.JFrame {

    InmuebleSeleccionado main;
    Inmueble inmueble;
    Cliente cliente;
    
    /**
     * Creates new form ReservaInmueble
     */
    public ReservaInmueble() {
        initComponents();
    }
    /**
     * Creates new form ReservaInmueble
     * @param is Panel de origen
     * @param i Inmueble seleccionado
     * @param c Cliente de la sesión
     */
    public ReservaInmueble(InmuebleSeleccionado is, Inmueble i, Cliente c) {
        initComponents();
        main = is;
        inmueble = i;
        cliente = c;
        main.setVisible(false);
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 2, 18)); // NOI18N
        jLabel2.setText("Reserva");

        jLabel1.setFont(new java.awt.Font("C059", 0, 36)); // NOI18N
        jLabel1.setText("JavaBnB");

        jLabel3.setText("Fecha de entrada:");

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        jLabel4.setText("Fecha de salida:");

        jButton1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jButton1.setText("Reservar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Volver a los detalles");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextField2)
                                    .addComponent(jFormattedTextField1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        main.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fe = this.jFormattedTextField1.getText();
        String fs = this.jFormattedTextField2.getText();
        LocalDate fechaEntrada = LocalDate.parse(fe,dtf);
        LocalDate fechaSalida = LocalDate.parse(fs, dtf);
        boolean ocupado = false;
        
        for (int i = 0;i < Datos.lista_reservas.size();i++) {
            Reserva r = Datos.lista_reservas.get(i);
            LocalDate fen = r.getEntrada();
            LocalDate fsl = r.getSalida();
            List<LocalDate> diasReservados = new ArrayList<>();
            long numDias = ChronoUnit.DAYS.between(fen, fsl);
            for (long j = 0;j <= numDias;j++) {
                diasReservados.add(fen.plusDays(j));
            }
            System.out.println(diasReservados.toString());
            if (diasReservados.contains(fechaEntrada) || diasReservados.contains(fechaSalida)) {
                ocupado = true; 
            }
        } if (ocupado==false) {
            long dias = ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
            double importe;
            if (cliente.isVip()==true) {
                importe = (inmueble.getPrecioNoche() * dias) * 0.9;
            } else {
                importe = inmueble.getPrecioNoche() * dias;
            }
            String mensaje = "El importe total de la reserva queda en: "+importe+
                    "\n\n"+ "¿Desea proceder con la transacción?";
            Object[] options = {"Si", "No, volver"};
            int ok = JOptionPane.showOptionDialog(null, mensaje, "Información de la reserva",
                    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
                    null,options,options[0]);
            if (ok == JOptionPane.YES_OPTION) {
                Reserva reserva = new Reserva(cliente.getEmail(), inmueble.getTitulo(), fechaEntrada, fechaSalida, importe);
                System.out.println("Reserva creada");
                System.out.println("Datos de la reserva: "+reserva.toString());
                Datos.lista_reservas.add(reserva);
                System.out.println(Datos.lista_reservas.toString());
                // Creación de factura
                String directorio = System.getProperty("user.dir")+"/facturas/";
                int numFactura = Datos.lista_reservas.indexOf(reserva);
                String nombreFactura = "factura_"+numFactura+".txt";
                try (FileWriter factura = new FileWriter(new File(directorio, nombreFactura))) {
                    factura.write("\n    JavaBnB\n");
                    factura.write("---------------");
                    factura.write("\n\nInmueble reservado:");
                    factura.write("\n\n"+inmueble.getTitulo());
                    factura.write("\n"+inmueble.getDireccion().getCalle()+", "+inmueble.getDireccion().getNumero()+
                            "\n"+inmueble.getDireccion().getCodigoPostal()+
                            "\n"+inmueble.getDireccion().getCiudad());
                    factura.write("\n\n"+"Tipo de inmueble: "+inmueble.getTipoPropiedad());
                    factura.write("\nCapacidad de "+inmueble.getDatos().getHuespedes()+" huéspedes.");
                    factura.write("\nContiene "+inmueble.getDatos().getHabitaciones()+" habitaciones, "+
                            inmueble.getDatos().getCamas()+" camas y "+
                            inmueble.getDatos().getBaños()+" baños.");
                    factura.write("\n\nListado de servicios: ");
                    String serviciosFactura = "";
                    if (inmueble.getServicios().isEmpty()) {
                        factura.write("\n");
                    } else if (inmueble.getServicios().size()==1) {
                        factura.write("\n"+inmueble.getServicios().get(0));
                    } else {
                        for (int i = 0;i < inmueble.getServicios().size()-1;i++) {
                            serviciosFactura += inmueble.getServicios().get(i)+", ";
                        } serviciosFactura += inmueble.getServicios().get(inmueble.getServicios().size()-1);
                        factura.write("\n"+serviciosFactura);
                    }
                    factura.write("\n\n---------------");
                    factura.write("\n\nFecha de entrada: "+fe);
                    factura.write("\nFecha de salida: "+fs);
                    factura.write("\n\nPrecio por noche: "+inmueble.getPrecioNoche()+" €");
                    factura.write("\nNúmero de días reservados: "+dias);
                    factura.write("\nImporte total: "+importe+" €");
                    if (cliente.isVip()) {
                        factura.write("\n\n(Se le ha aplicado un descuento del 10% por ser cliente V.I.P)");
                    }
                    factura.write("\n\n---------------");
                    factura.write("\n\nNombre del cliente: "+cliente.getNombre());
                    factura.write("\nEmail: "+cliente.getEmail());
                    factura.write("\nTeléfono: "+cliente.getTeléfono());
                    factura.write("\nTitular de la tarjeta: "+cliente.getTarjeta_de_crédito().getTitular());
                    factura.write("\n\n---------------");
                    factura.close();
                    System.out.println("Factura ubicada en: "+directorio);
                } catch (Exception e) {
                    e.toString();
                }
            } else {
                JOptionPane.getRootFrame().dispose();
            }
        } else {
            System.out.println("inmueble ocupado ):");
        }
        Datos.guardarDatos("./backup.txt");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ReservaInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservaInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservaInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservaInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservaInmueble().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
