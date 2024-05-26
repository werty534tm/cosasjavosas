/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cosasjavosas;
import clases.Anfitrión;
import clases.Cliente;
import clases.Datos;
import interfaz.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author cojones
 */
public class Cosasjavosas {
    public static void main(String[] args) {
        System.out.println("Datos");
        System.out.println(Datos.lista_clientes);
        System.out.println(Datos.correos_clientes);
        Datos.recuperarDatos("./backup.txt");
        System.out.println("Datos");
        System.out.println(Datos.lista_clientes);
        System.out.println(Datos.correos_clientes);
        //Datos.borrarDatos("./backup.txt");
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
    }
}
