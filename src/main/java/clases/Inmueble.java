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
    private ArrayList<String> servicios = new ArrayList<>();
    private String fotografia;
    private double calificacion;
    private ArrayList<Reseña> reseñas = new ArrayList<>();
    private String dueño;

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public ArrayList<Reseña> getReseñas() {
        return reseñas;
    }

    public void setReseñas(ArrayList<Reseña> reseñas) {
        this.reseñas = reseñas;
    }
    
    public void addReseñas(Reseña res) {
        this.reseñas.add(res);
    }


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

    public void setCalificacion() {
        if(reseñas.isEmpty()){
            Double sum = 0.0;
            for(int i=0;i<reseñas.size();i++){sum += reseñas.get(i).getNota();}
        this.calificacion = sum/reseñas.size();
        }
        else{this.calificacion = 0;}
    }

    public Inmueble(String titulo, Direccion direccion, DatosInmueble datos, String tipoPropiedad, double precioNoche, ArrayList<String> servicios, String fotografia, String dueño) {
        this.titulo = titulo;
        this.direccion = direccion;
        this.datos = datos;
        this.tipoPropiedad = tipoPropiedad;
        this.precioNoche = precioNoche;
        this.servicios = servicios;
        this.fotografia = fotografia;
        this.dueño = dueño;
        this.setCalificacion();
    }

    @Override
    public String toString() {
        return titulo+'ඞ'+direccion.toString()+'ඞ'+datos.toString()+'ඞ'+tipoPropiedad+'ඞ'+precioNoche+'ඞ'+servicios+'ඞ'+fotografia+'ඞ'+reseñas+'ඞ'+dueño;
    }
}
