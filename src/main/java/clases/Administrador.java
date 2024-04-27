/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author luver
 */
public class Administrador {
    
    private String correo;
    private String clave;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Administrador(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Administrador{" + "correo=" + correo + ", clave=" + clave + '}';
    }
    // AAA
}
