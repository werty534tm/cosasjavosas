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
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase que maneja los datos almacenados de la aplicación
 * @author ricoyogur
 */
public class Datos {
    public static HashMap<String, Cliente> lista_clientes = new HashMap<>();
    public static HashMap<String, Anfitrión> lista_anfitriones = new HashMap<>();
    public static ArrayList<String> correos_clientes = new ArrayList<>();
    public static ArrayList<String> correos_anfitriones = new ArrayList<>();
    public static ArrayList<Inmueble> lista_inmuebles = new ArrayList<>();
    public static ArrayList<Reserva> lista_reservas = new ArrayList<>();
    
    public Datos() {
        //xd
    }

    /**
     * Guarda los datos de la aplicación en un archivo con el nombre proporcionado a la función
     * @param filename Nombre del archivo
     */
    public static void guardarDatos(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Clientes:\n");
            for (String email : correos_clientes) {
                Cliente cliente = lista_clientes.get(email);
                writer.write(email + "ඞ" + cliente.toString() + "\n");
            }

            writer.write("\nAnfitriones:\n");
            for (String email : correos_anfitriones) {
                Anfitrión anfitrion = lista_anfitriones.get(email);
                writer.write(email + "ඞ" + anfitrion.toString() + "\n");
            }
            
            writer.write("\nInmuebles:\n");
            for (int i=0;i<lista_inmuebles.size();i++) {
                Inmueble inmueble = lista_inmuebles.get(i);
                writer.write(inmueble.toString() + "\n");
            }
            
            writer.write("\nReservas:\n");
            for (int i = 0;i < lista_reservas.size();i++) {
                Reserva reserva = lista_reservas.get(i);
                writer.write(reserva.toString() + "\n");
            }
            
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    /**
     * Carga los datos de la aplicacion almacenados en el archivo correspondiente
     * @param filename Nombre del archivo que almacena los datos de la aplicación
     */
    public static void recuperarDatos(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            String sección = "";

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.equals("Clientes:")) {
                    sección = "clientes";
                } else if (line.equals("Anfitriones:")) {
                    sección = "anfitriones";
                } else if(line.equals("Inmuebles:")){
                    sección = "inmuebles";
                } else if(line.equals("Reservas:")){
                    sección = "reservas";
                } else if (!line.isEmpty()) {
                    if(sección.equals("clientes")){
                        String[] parts = line.split("ඞ", 10);
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
                    else if(sección.equals("anfitriones")){
                        String[] parts = line.split("ඞ", 8);
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
                    } else if(sección.equals("inmuebles")){
                        String[] parts = line.split("ඞ", 15);
                        if (parts.length == 15) {
                            String titulo = parts[0];
                            String calle = parts[1];
                            int numero = Integer.parseInt(parts[2]);
                            String CP = parts[3];
                            String ciudad = parts[4];
                            int huespedes = Integer.parseInt(parts[5]);
                            int habitaciones = Integer.parseInt(parts[6]);
                            int camas = Integer.parseInt(parts[7]);
                            int baños = Integer.parseInt(parts[8]);
                            String tipo = parts[9];
                            Double precio = Double.valueOf(parts[10]);
                            String servicios = parts[11];
                            servicios = servicios.substring(1, servicios.length() - 1);
                            List<String> lista = Arrays.stream(servicios.split(","))
                                   .map(String::trim) // Eliminar espacios en blanco alrededor de cada palabra
                                   .collect(Collectors.toList());
                            ArrayList<String> servilista = new ArrayList<>(lista);
                            String fotografia = parts[12];
                            String reseñas_texto = parts[13];
                            reseñas_texto = reseñas_texto.substring(1, reseñas_texto.length() - 1);
                            List<String> lista2 = Arrays.stream(reseñas_texto.split(","))
                                   .map(String::trim) // Eliminar espacios en blanco alrededor de cada palabra
                                   .collect(Collectors.toList());
                            ArrayList<String> lista_reseñas_texto = new ArrayList<>(lista2);                            
                            System.out.println("Lista de reseñas en texto: "+lista_reseñas_texto);
                            String dueño = parts[14];
                            DatosInmueble datos = new DatosInmueble(huespedes, habitaciones, camas, baños);
                            Direccion dir = new Direccion(calle, numero, CP, ciudad);
                            Inmueble inm = new Inmueble(titulo, dir, datos, tipo, precio, servilista, fotografia, dueño);
                            System.out.println(lista_reseñas_texto);
                            System.out.println(lista_reseñas_texto.size());
                            for(int i=0;i<lista_reseñas_texto.size();i++){
                                String[] reseñita = lista_reseñas_texto.get(i).split("<");
                                if (reseñita.length==4) {
                                    Reseña reseña = new Reseña(titulo,reseñita[0],reseñita[1], Integer.parseInt(reseñita[2]), reseñita[3]);
                                    inm.getReseñas().add(reseña);
                                }
                            }
                            inm.setCalificacion();
                            Datos.lista_inmuebles.add(inm);
                            inm.toString();
                        }
                    } else if(sección.equals("reservas")){
                        String[] parts = line.split("ඞ", 5);
                        if(parts.length == 5){
                            String correo = parts[0];
                            String titulo = parts[1];
                            String entrada = parts[2];
                            String salida = parts[3];
                            Double importe = Double.valueOf(parts[4]);
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                            try{
                                LocalDate fecha_e = LocalDate.parse(entrada, formatter);
                                LocalDate fecha_s = LocalDate.parse(salida, formatter);
                                Reserva reserva = new Reserva(correo, titulo, fecha_e, fecha_s, importe);
                                Datos.lista_reservas.add(reserva);
                            } catch (DateTimeParseException ex) {
                                System.out.println("Error al parsear las fechas de entrada y salida.");
                            }
                            
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al recuperar los datos: " + e.getMessage());
        }
    }

    /**
     * Borra los datos de la aplicación
     * @param filename Nombre del archivo que almacena los datos de la aplicación
     */
    public static void borrarDatos(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            //borra el contenido
        } catch (IOException e) {
            System.err.println("Error al borrar los datos: " + e.getMessage());
        }
    }
}
