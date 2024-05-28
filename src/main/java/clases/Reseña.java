/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ricoyogur
 */
public class Reseña {
    
    private String titulo;
    private String nombre_cliente;
    private int nota;
    private String texto;
    private String titulo_inm;

    public String getTitulo_inm() {
        return titulo_inm;
    }
    public void setTitulo_inm(String titulo_inm) {
        this.titulo_inm = titulo_inm;
    }

    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }


    public String getNombre_cliente() {
        return nombre_cliente;
    }
    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Reseña(String titulo_inm, String titulo, String nombre_cliente, int nota, String texto) {
        this.titulo = titulo;
        this.nombre_cliente = nombre_cliente;
        this.nota = nota;
        this.texto = texto;
        this.titulo_inm = titulo_inm;
    }
    @Override
    public String toString(){
        return titulo+'<'+nombre_cliente+'<'+nota+'<'+texto;
    }
}
