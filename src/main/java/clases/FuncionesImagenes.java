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
import java.io.File;

public class FuncionesImagenes {
    public static void cargarImagen(JLabel JLimg, String img) {
        JLimg.setSize(180,180);
        ImageIcon imagen = new ImageIcon(img);
        ImageIcon imgRed = new ImageIcon(imagen.getImage().getScaledInstance(JLimg.getWidth(),JLimg.getHeight(),1));
        JLimg.setIcon(imgRed);
    }
    public static void guardarImagen(File img) {
        
    }
}
