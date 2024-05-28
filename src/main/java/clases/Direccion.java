/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 * Clase que controla los datos de las direcciones de los inmuebles
 * @author luver
 */
public class Direccion {
    
    private String calle;
    private int numero;
    private String codigoPostal;
    private String ciudad;

    /**
     * Obtiene la calle en la que se ubica el inmueble
     * @return String - Calle en la que se ubica el inmueble
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Sustituye la calle en la que se ubica el inmueble por la proporcionada
     * @param calle Calle en la que se ubica el inmueble 
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el número de la calle en la que se ubica el inmueble
     * @return int - Número de la calle en la que se ubica el inmueble
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Sustituye el número de la calle en la que se ubica el inmueble por el proporcionado
     * @param numero número de la calle en la que se ubica el inmueble
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Obtiene el código postal del inmueble
     * @return String - Código postal del inmueble
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Sustituye el código postal del inmueble por el proporcionado
     * @param codigoPostal Cófigo postal del inmueble
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * Obtiene la ciudad en la que se ubica el inmueble
     * @return String - Ciudad en la que se ubica el inmueble
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Sustituye la ciudad en la que se ubica el inmueble por la proporcionada
     * @param ciudad Ciudad en la que se ubica el inmueble
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Crea la dirección del inmueble
     * @param calle Calle en la que se ubica el inmueble
     * @param numero Número de la calle en la que se ubica el inmueble
     * @param codigoPostal Código postal del inmueble
     * @param ciudad Ciudad en la que se ubica el inmueble
     */
    public Direccion(String calle, int numero, String codigoPostal, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }

    /**
     * Genera un String con la información de la dirección del inmueble, con una separación específica dependiendo de su uso
     * @return String - Información de la dirección del inmueble
     */
    @Override
    public String toString() {
        return ""+calle+'ඞ'+numero+'ඞ'+codigoPostal+'ඞ'+ciudad;
    }
    public String toStringNoAmogos(){
        return calle+" "+numero+" "+ciudad+" "+codigoPostal;
    }
}
