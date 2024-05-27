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
    private Cliente cliente;
    private Inmueble inmueble;
    private LocalDate entrada;
    private LocalDate salida;
    
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Inmueble getInmueble() {
        return inmueble;
    }
    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
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
    public Reserva(Cliente cliente, Inmueble inmueble, LocalDate entrada, LocalDate salida){
        this.cliente = cliente;
        this.inmueble = inmueble;
        this.entrada = entrada;
        this.salida = salida;
    }
    @Override
    public String toString() {
        return cliente.getEmail()+'ඞ'+ inmueble.getTitulo()+'ඞ'+entrada.toString()+'ඞ'+salida.toString();
    }
}
