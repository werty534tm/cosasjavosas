/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cosasjavosas;

import clases.Datos;
import interfaz.*;

/**
 * Carga el programa con el contenido de las clases almacenado en un archivo de texto
 * @author cojones
 */
public class Cosasjavosas {
    public static void main(String[] args) {
        Datos.recuperarDatos("./backup.txt");
        System.out.println("ZONADEINMUEBLESOTRAVEZ"+Datos.lista_inmuebles);
        //Datos.borrarDatos("./backup.txt");
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
    }
}
