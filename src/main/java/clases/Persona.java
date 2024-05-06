/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author cojones
 */
public class Persona {
    String DNI;
    String nombre;
    String email;
    String clave;
    String teléfono;
    
    public String getDNI(){
        return this.DNI;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getEmail(){
        return this.email;
    }
    public String getClave(){
        return this.clave;
    }
    public String getTeléfono(){
        return this.teléfono;
    }
    
    public void setDNI(String DNI){
        this.DNI = DNI;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setClave(String clave){
        this.clave = clave;
    }
    public void setTeléfono(String teléfono){
        this.teléfono = teléfono;
    }

    public Persona(String DNI, String nombre, String email, String clave, String teléfono) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
        this.teléfono = teléfono;
    }
}
