/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 * Clase que maneja los datos de los clientes (particulares, anfitriones)
 * @author cojones
 */
public class Persona {
    String DNI;
    String nombre;
    String email;
    String clave;
    String teléfono;
    
    /**
     * Obtiene el DNI de los clientes
     * @return String - DNI
     */
    public String getDNI(){
        return this.DNI;
    }
    
    /**
     * Obtiene el nombre de los clientes
     * @return String - Nombre
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Obtiene el correo electrónico de los clientes
     * @return String - Correo electrónico
     */
    public String getEmail(){
        return this.email;
    }
    
    /**
     * Obtiene la contraseña de la cuenta de los clientes
     * @return String - Contraseña
     */
    public String getClave(){
        return this.clave;
    }
    
    /**
     * Obtiene el número de los clientes
     * @return String - Número de teléfono
     */
    public String getTeléfono(){
        return this.teléfono;
    }
    
    /**
     * Sustituye el DNI del cliente por el proporcionado
     * @param DNI DNI
     */
    public void setDNI(String DNI){
        this.DNI = DNI;
    }
    
    /**
     * Sustituye el nombre del cliente por el proporcionado
     * @param nombre Nombre
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    /**
     * Sustituye el correo electrónico del cliente por el proporcionado
     * @param email Correo electrónico
     */
    public void setEmail(String email){
        this.email = email;
    }
    
    /**
     * Sustituye la contraseña del cliente por la proporcionada
     * @param clave Contraseña
     */
    public void setClave(String clave){
        this.clave = clave;
    }
    
    /**
     * Sustituye el número de teléfono del cliente por el proporcionado
     * @param teléfono Número de teléfono
     */
    public void setTeléfono(String teléfono){
        this.teléfono = teléfono;
    }

    /**
     * Crea una persona
     * @param DNI DNI
     * @param nombre Nombre
     * @param email Correo electrónico
     * @param clave Contraseña
     * @param teléfono Número de teléfono
     */
    public Persona(String DNI, String nombre, String email, String clave, String teléfono) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
        this.teléfono = teléfono;
    }
}
