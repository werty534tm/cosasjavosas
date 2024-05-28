/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.time.LocalDate;

/**
 *
 * @author ricoyogur
 */
public class Reserva {
    private String emailCliente;
    private String tituloInmueble;
    private LocalDate entrada;
    private LocalDate salida;
    private double importe;
    
    public String getEmailCliente() {
        return emailCliente;
    }
    public void setEmailCliente(String cliente) {
        this.emailCliente = cliente;
    }
    
    public String getTituloInmueble() {
        return tituloInmueble;
    }
    public void setTituloInmueble(String inmueble) {
        this.tituloInmueble = inmueble;
    }
    
    public LocalDate getEntrada() {
        return entrada;
    }
    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }
    
    public LocalDate getSalida() {
        return salida;
    }
    public void setSalida(LocalDate salida) {
        this.salida = salida;
    }
    
    public double getImporte() {
        return importe;
    }
    
    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    public Reserva(String emailCliente, String tituloInmueble, LocalDate entrada, LocalDate salida, double importe){
        this.emailCliente = emailCliente;
        this.tituloInmueble = tituloInmueble;
        this.entrada = entrada;
        this.salida = salida;
        this.importe = importe;
    }
    @Override
    public String toString() {
        return emailCliente+'ඞ'+ tituloInmueble+'ඞ'+entrada.toString()+'ඞ'+salida.toString()+'ඞ'+importe;
    }
}
