/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author luver
 */

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.*;

public class FuncionesImagenes {
    public static void cargarImagen(JLabel JLimg, String img) {
        JLimg.setSize(180,180);
        ImageIcon imagen = new ImageIcon(img);
        ImageIcon imgRed = new ImageIcon(imagen.getImage().getScaledInstance(JLimg.getWidth(),JLimg.getHeight(),1));
        JLimg.setIcon(imgRed);
    }
    
    public static void guardarImagen(File img) {
        try {
            String path = System.getProperty("user.dir")+"/imagenes/"+img.getName();
            System.out.println(path); // debug
            InputStream is = null;
            OutputStream os = null;
            try {
                is = new FileInputStream(img);
                os = new FileOutputStream(path);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = is.read(buffer)) > 0) {
                    os.write(buffer, 0, length);
                }
            } finally {
                is.close();
                os.close();
            }
        } catch (IOException ioe) {
            System.out.println("Error: " + ioe.toString());
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(null, 
                    "No se ha seleccionado ninún archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }    
    }
}
