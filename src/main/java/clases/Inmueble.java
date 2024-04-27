/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author luver
 */

import java.util.ArrayList;

public class Inmueble {
    
    private String titulo;
    private Direccion direccion;
    private DatosInmueble datos;
    private String tipoPropiedad;
    private double precioNoche;
    private ArrayList<String> servicios;
    private String fotografia;
    private double calificacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public DatosInmueble getDatos() {
        return datos;
    }

    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public ArrayList<String> getServicios() {
        return servicios;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public Inmueble(String titulo, Direccion direccion, DatosInmueble datos, String tipoPropiedad, double precioNoche, ArrayList<String> servicios, String fotografia, double calificacion) {
        this.titulo = titulo;
        this.direccion = direccion;
        this.datos = datos;
        this.tipoPropiedad = tipoPropiedad;
        this.precioNoche = precioNoche;
        this.servicios = servicios;
        this.fotografia = fotografia;
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "titulo=" + titulo + ", direccion=" + direccion + ", datos=" + datos + ", tipoPropiedad=" + tipoPropiedad + ", precioNoche=" + precioNoche + ", servicios=" + servicios + ", fotografia=" + fotografia + ", calificacion=" + calificacion + '}';
    }
    
}
