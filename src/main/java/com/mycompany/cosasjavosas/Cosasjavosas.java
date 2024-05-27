/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cosasjavosas;

import clases.Datos;
import interfaz.*;

/**
 *
 * @author cojones
 */
public class Cosasjavosas {
    public static void main(String[] args) {
        System.out.println("Datos");
        System.out.println(Datos.lista_clientes);
        System.out.println(Datos.correos_clientes);
        System.out.println(Datos.lista_anfitriones);
        System.out.println(Datos.correos_anfitriones);
        System.out.println(Datos.lista_inmuebles);
        Datos.recuperarDatos("./backup.txt");
        System.out.println("Datos");
        System.out.println(Datos.lista_clientes);
        System.out.println(Datos.correos_clientes);
        System.out.println(Datos.lista_anfitriones);
        System.out.println(Datos.correos_anfitriones);
        System.out.println(Datos.lista_inmuebles);
        //Datos.borrarDatos("./backup.txt");
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
    }
}
