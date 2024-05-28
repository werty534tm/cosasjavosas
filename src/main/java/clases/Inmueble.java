/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 * Clase que maneja los datos de los inmuebles
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

    /**
     * Obtiene el nombre del dueño del inmueble
     * @return String - Dueño del inmueble
     */
    public String getDueño() {
        return dueño;
    }

    /**
     * Sustituye al dueño del inmueble por el proporcionado
     * @param dueño Nombre del dueño del inmueble
     */
    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    /**
     * Obtiene las reseñas del inmueble
     * @return ArrayList<Reseñas> - ArrayList con las reseñas del inmueble
     */
    public ArrayList<Reseña> getReseñas() {
        return reseñas;
    }

    /**
     * Sustituye la lista de reseñas del inmueble por la proporcionada
     * @param reseñas ArrayList<Reseñas> con reseñas del inmueble
     */
    public void setReseñas(ArrayList<Reseña> reseñas) {
        this.reseñas = reseñas;
    }
    
    /**
     * Añade reseñas a la lista actual de reseñas del inmueble
     * @param res Reseña del inmueble
     */
    public void addReseñas(Reseña res) {
        this.reseñas.add(res);
    }

    /**
     * Obtiene el título del inmueble
     * @return String - Título del inmueble
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Sustituye el título del inmueble por el proporcionado
     * @param titulo String - Título del inmueble
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene la dirección del inmueble
     * @return Direccion - Datos de la dirección del inmueble
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Obtiene algunas cifras sobre aspectos del inmueble
     * @return DatosInmueble - Cifras sobre aspectos del inmueble
     */
    public DatosInmueble getDatos() {
        return datos;
    }

    /**
     * Obtiene el tipo de inmueble
     * @return String - Valores posibles: "Casa", "Apartamento"
     */
    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    /**
     * Cambia el tipo de propiedad por el proporcionado
     * @param tipoPropiedad Valores posibles: "Casa", "Apartamento"
     */
    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    /**
     * Obtiene el precio por noche del inmueble
     * @return double - Precio / Noche
     */
    public double getPrecioNoche() {
        return precioNoche;
    }

    /**
     * Sustituye el precio por noche del inmueble por el proporcionado
     * @param precioNoche Precio / Noche
     */
    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    /**
     * Obtiene la lista de servicios proporcionados por el inmueble
     * @return ArrayList<String> - Lista de servicios
     */
    public ArrayList<String> getServicios() {
        return servicios;
    }
    
    /**
     * Sustituye la lista de servicios proporcionados por el inmueble por la proporcionada
     * @param servicios Lista de servicios
     */
    public void setServicios(ArrayList<String> servicios) {
        this.servicios = servicios;
    }

    /**
     * Obtiene el nombre del fichero de la foto a mostrar del inmueble
     * @return Strong - Nombre del fichero de la foto del inmueble
     */
    public String getFotografia() {
        return fotografia;
    }

    /**
     * Sustituye el nombre de la foto a mostrar del inmueble por el proporcionado
     * @param fotografia Nombre del fichero de la foto del inmueble
     */
    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    /**
     * Obtiene la media de calificaciones del inmueble
     * @return double - Media de calificaciones
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Actualiza la media de calificaciones
     */
    public void setCalificacion() {
        if(!reseñas.isEmpty()){
            Double sum = 0.0;
            for(int i=0;i<reseñas.size();i++){sum += reseñas.get(i).getNota();}
        this.calificacion = sum/reseñas.size();
        }
        else{this.calificacion = 0;}
    }

    /**
     * Crea un inmueble
     * @param titulo Título del inmueble
     * @param direccion Dirección del inmueble, con sus respectivos datos
     * @param datos Cifras de algunos aspectos del inmueble
     * @param tipoPropiedad Tipo de inmueble
     * @param precioNoche Precio / Noche
     * @param servicios Lista de servicios
     * @param fotografia Nombre del fichero de la foto a mostrar del inmueble
     * @param dueño Nombre del anfitrión al que pertenece el inmueble
     */
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

    /**
     * Genera un String con los datos del inmueble
     * @return String - String con los datos del inmueble
     */
    @Override
    public String toString() {
        return titulo+'ඞ'+direccion.toString()+'ඞ'+datos.toString()+'ඞ'+tipoPropiedad+'ඞ'+precioNoche+'ඞ'+servicios+'ඞ'+fotografia+'ඞ'+reseñas+'ඞ'+dueño;
    }
}
