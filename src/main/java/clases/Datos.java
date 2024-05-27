/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * @autor ricoyogur
 */
public class Datos {
    public static HashMap<String, Cliente> lista_clientes = new HashMap<>();
    public static HashMap<String, Anfitrión> lista_anfitriones = new HashMap<>();
    public static ArrayList<String> correos_clientes = new ArrayList<>();
    public static ArrayList<String> correos_anfitriones = new ArrayList<>();
    public static ArrayList<Inmueble> lista_inmuebles = new ArrayList<>();

    public Datos() {
        //xd
    }

    public static void guardarDatos(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Clientes:\n");
            for (String email : correos_clientes) {
                Cliente cliente = lista_clientes.get(email);
                writer.write(email + " " + cliente.toString() + "\n");
            }

            writer.write("\nAnfitriones:\n");
            for (String email : correos_anfitriones) {
                Anfitrión anfitrion = lista_anfitriones.get(email);
                writer.write(email + " " + anfitrion.toString() + "\n");
            }
            
            writer.write("\nInmuebles:\n");
            for (int i=0;i<lista_inmuebles.size();i++) {
                Inmueble inmueble = lista_inmuebles.get(i);
                writer.write(inmueble.toString() + "\n");
            }
            
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public static void recuperarDatos(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean sección_clientes = true;

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.equals("Clientes:")) {
                    sección_clientes = true;
                } else if (line.equals("Anfitriones:")) {
                    sección_clientes = false;
                } else if (!line.isEmpty()) {
                    if(sección_clientes){
                        String[] parts = line.split(" ", 10);
                        if (parts.length == 10) {
                            String email = parts[0];
                            String nombre = parts[1];
                            String DNI = parts[2];
                            String teléfono = parts[3];
                            String correo = parts[4];
                            String clave = parts[5];
                            String titular = parts[6];
                            String num_tarjeta = parts[7];
                            String caducidad = parts[8];
                            String vip = parts[9];
                            boolean esVip = (vip.equals("true"));
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                            try {
                                LocalDate fecha = LocalDate.parse(caducidad, formatter);
                                TarjetaDeCrédito tarjeta = new TarjetaDeCrédito(titular, num_tarjeta, fecha);
                                Cliente cliente = new Cliente(tarjeta, esVip, DNI, nombre, correo, clave, teléfono);
                                Datos.lista_clientes.put(correo, cliente);
                                Datos.correos_clientes.add(correo);
                            } catch (DateTimeParseException ex) {
                                System.out.println("Error al parsear la fecha del cliente");
                            }
                        }
                    }
                    else{
                        String[] parts = line.split(" ", 8);
                        if (parts.length == 8) {
                            String email = parts[0];
                            String nombre = parts[1];
                            String DNI = parts[2];
                            String teléfono = parts[3];
                            String correo = parts[4];
                            String clave = parts[5];
                            String fecha_registro = parts[6];
                            System.out.println(fecha_registro);
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                            String superanfitrión = parts[7];
                            boolean esSuper = (superanfitrión.equals("true"));
                            try {
                                LocalDate fecha = LocalDate.parse(fecha_registro, formatter);
                                Anfitrión anf = new Anfitrión(fecha, esSuper, DNI, nombre, correo, clave, teléfono);
                                Datos.lista_anfitriones.put(correo, anf);
                                Datos.correos_anfitriones.add(correo);
                            } catch (DateTimeParseException ex) {
                                System.out.println("Error al parsear la fecha del anf");
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al recuperar los datos: " + e.getMessage());
        }
    }

    public static void borrarDatos(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            //borra el contenido
        } catch (IOException e) {
            System.err.println("Error al borrar los datos: " + e.getMessage());
        }
    }
}
