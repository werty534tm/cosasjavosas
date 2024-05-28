/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 * Clase que maneja los datos de las reseñas
 * @author ricoyogur
 */
public class Reseña {
    
    private String titulo;
    private String nombre_cliente;
    private int nota;
    private String texto;
    private String titulo_inm;

    /**
     * Obtiene el título del inmueble de la reseña
     * @return String - Título del inmueble
     */
    public String getTitulo_inm() {
        return titulo_inm;
    }
    
    /**
     * Sustituye el título del inmueble de la reseña por el proporcionado
     * @param titulo_inm Título nuevo
     */
    public void setTitulo_inm(String titulo_inm) {
        this.titulo_inm = titulo_inm;
    }

    /**
     * Obtiene el contenido del texto de la reseña
     * @return String - Comentario de la reseña
     */
    public String getTexto() {
        return texto;
    }
    
    /**
     * Sustituye el contenido del texto de la reseña por el proporcionado
     * @param texto Comentario nuevo en la reseña
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * Obtiene la nota que se ha proporcionado en la reseña
     * @return int - Puntuación dada
     */
    public int getNota() {
        return nota;
    }
    
    /**
     * Sustituye la nota puesta en la reseña por la proporcionada
     * @param nota Puntuación nueva
     */
    public void setNota(int nota) {
        this.nota = nota;
    }

    /**
     * Obtiene el nombre del cliente que ha puesto la reseña
     * @return String - Nombre del cliente
     */
    public String getNombre_cliente() {
        return nombre_cliente;
    }
    
    /**
     * Sustituye el nombre del cliente en la reseña por el proporcionado
     * @param nombre_cliente Nombre nuevo
     */
    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    /**
     * Obtiene el título de la reseña
     * @return String - Titulo de la reseña
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Sustituye el título de la reserva por el proporcionado
     * @param titulo Título nuevo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Crea una reseña
     * @param titulo_inm Título del inmueble de la reseña
     * @param titulo Título de la reseña
     * @param nombre_cliente Nombre del cliente
     * @param nota Nota proporcionada por el cliente
     * @param texto Contenido del texto la reseña
     */
    public Reseña(String titulo_inm, String titulo, String nombre_cliente, int nota, String texto) {
        this.titulo = titulo;
        this.nombre_cliente = nombre_cliente;
        this.nota = nota;
        this.texto = texto;
        this.titulo_inm = titulo_inm;
    }
    
    /**
     * Genera un String con la información de la reseña
     * @return String - Información de la reseña
     */
    @Override
    public String toString(){
        return titulo+'<'+nombre_cliente+'<'+nota+'<'+texto;
    }
}
