/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.time.LocalDate;

/**
 * Clase que maneja las reservas de los inmuebles
 * @author ricoyogur
 */
public class Reserva {
    private String emailCliente;
    private String tituloInmueble;
    private LocalDate entrada;
    private LocalDate salida;
    private double importe;
    
    /**
     * Obtiene el correo electrónico del cliente que ha hecho la reserva
     * @return String - Email del cliente
     */
    public String getEmailCliente() {
        return emailCliente;
    }
    
    /**
     * Cambia el correo electrónico registrado en la reserva por el proporcionado
     * @param cliente Email nuevo
     */
    public void setEmailCliente(String cliente) {
        this.emailCliente = cliente;
    }
    
    /**
     * Obtiene el título del inmueble reservado
     * @return String - Título del inmueble
     */
    public String getTituloInmueble() {
        return tituloInmueble;
    }
    
    /**
     * Cambia el título del inmueble en la reserva por el proporcionado
     * @param inmueble Título del inmueble nuevo
     */
    public void setTituloInmueble(String inmueble) {
        this.tituloInmueble = inmueble;
    }
    
    /**
     * Obtiene la fecha de entrada del cliente al inmueble de la reserva
     * @return LocalDate - Fecha de entrada al inmueble
     */
    public LocalDate getEntrada() {
        return entrada;
    }
    
    /**
     * Sustituye la fecha de entrada del cliente al inmueble por la proporcionada
     * @param entrada Fecha de entrada al inmueble nueva
     */
    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }
    
    /**
     * Obtiene la fecha de salida del cliente del inmueble de la reserva
     * @return LocalDate - Fecha de salida del inmueble
     */
    public LocalDate getSalida() {
        return salida;
    }
    
    /**
     * Sustituye la fecha de salida del cliente del inmueble por la proporcionada
     * @param salida Fecha de salida del inmueble nueva
     */
    public void setSalida(LocalDate salida) {
        this.salida = salida;
    }
    
    /**
     * Obtiene el importe total de la reserva
     * @return double - Importe total de la reserva
     */
    public double getImporte() {
        return importe;
    }
    
    /**
     * Sustituye el importe total indicado en la reserva por el proporcionado
     * @param importe Importe total nuevo
     */
    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    /**
     * Crea una reserva
     * @param emailCliente Correo electrónico del cliente
     * @param tituloInmueble Título del inmueble
     * @param entrada Fecha de entrada
     * @param salida Fecha de salida
     * @param importe Importe total de la reserva
     */
    public Reserva(String emailCliente, String tituloInmueble, LocalDate entrada, LocalDate salida, double importe){
        this.emailCliente = emailCliente;
        this.tituloInmueble = tituloInmueble;
        this.entrada = entrada;
        this.salida = salida;
        this.importe = importe;
    }
    
    /**
     * Genera un String con los datos de la reserva
     * @return String - Datos de la reserva
     */
    @Override
    public String toString() {
        return emailCliente+'ඞ'+ tituloInmueble+'ඞ'+entrada.toString()+'ඞ'+salida.toString()+'ඞ'+importe;
    }
}
