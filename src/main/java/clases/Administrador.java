/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 * Clase que maneja los datos de los administradores
 * @author luver
 */
public class Administrador {
    
    private String correo;
    private String clave;

    /**
     * Obtiene el correo electrónico del administrador
     * @return String - Devuelve un String con el correo de la cuenta del administrador
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Cambia el correo del adminstrador al que se pasa en la función
     * @param correo Correo al cual se va a cambiar
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene la clave del adminstrador
     * @return String - Devuelve un String con la clave de la cuenta del administrador
     */
    public String getClave() {
        return clave;
    }

    /**
     * Cambia la clave del administrador al que se pasa en la función
     * @param clave Clave a la cual se va a cambiar
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Crea un administrador
     * @param correo Correo electrónico del administrador
     * @param clave  Clave del administrador
     */
    public Administrador(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }

    /**
     * Genera un String con la información del administrador
     * @return String - Información del administrador
     */
    @Override
    public String toString() {
        return "Administrador{" + "correo=" + correo + ", clave=" + clave + '}';
    }
    // AAA
}
