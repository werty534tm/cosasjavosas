/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ricoyogur
 */
public class Datos {
    public static HashMap<String, Cliente> lista_clientes = new HashMap<>();
    public static HashMap<String, Anfitrión> lista_anfitriones;
    public static ArrayList<String> correos_clientes = new ArrayList<>();
    public static ArrayList<String> correos_anfitriones;
    public Datos(){
        this.lista_clientes = new HashMap<>();
        this.correos_clientes = new ArrayList<>();
    }
}
