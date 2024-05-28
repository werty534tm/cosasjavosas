/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 * Clase que maneja algunas cifras de los inmuebles
 * @author luver
 */
public class DatosInmueble {
    
    private int huespedes;
    private int habitaciones;
    private int camas;
    private int baños;

    /**
     * Obtiene el número de huéspedes del inmueble
     * @return int - Número de huéspedes
     */
    public int getHuespedes() {
        return huespedes;
    }

    /**
     * Sustituye el número de huéspedes por el proporcionado
     * @param huespedes Número de huéspedes
     */
    public void setHuespedes(int huespedes) {
        this.huespedes = huespedes;
    }

    /**
     * Obtiene el número de habitaciones del inmueble
     * @return int - Número de habitaciones
     */
    public int getHabitaciones() {
        return habitaciones;
    }

    /**
     * Sustituye el número de habitaciones por el proporcionado
     * @param habitaciones Número de habitaciones
     */
    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    /**
     * Obtiene el número de camas del inmueble
     * @return int - Número de camas
     */
    public int getCamas() {
        return camas;
    }

    /**
     * Sustituye el número de camas por el proporcionado
     * @param camas Número de camas
     */
    public void setCamas(int camas) {
        this.camas = camas;
    }

    /**
     * Obtiene el número de baños del inmueble
     * @return int - Número de baños
     */
    public int getBaños() {
        return baños;
    }

    /**
     * Sustituye el número de baños por el proporcionado
     * @param baños Número de baños
     */
    public void setBaños(int baños) {
        this.baños = baños;
    }

    /**
     * Crea una lista de cifras de datos del inmueble
     * @param huespedes
     * @param habitaciones
     * @param camas
     * @param baños 
     */
    public DatosInmueble(int huespedes, int habitaciones, int camas, int baños) {
        this.huespedes = huespedes;
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.baños = baños;
    }

    /**
     * Genera un String con los datos de la clase "DatosInmueble"
     * @return String - Datos de la clase "DatosInmueble"
     */
    @Override
    public String toString() {
        return ""+huespedes+'ඞ'+habitaciones+'ඞ'+camas+'ඞ'+baños;
    }
    
}
