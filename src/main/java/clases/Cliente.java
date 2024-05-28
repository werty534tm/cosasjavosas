package clases;

import java.time.LocalDate;

/**
 * Clase que maneja los datos de los particulares
 * @author cojones
 */
public class Cliente extends Persona{
    
    private TarjetaDeCrédito tarjeta_de_crédito;
    private boolean vip;

    /**
     * Obtiene los datos de la tarjeta de crédito del particular
     * @return TarjetaDeCrédito - Datos de la tarjeta de crédito del particular
     */
    public TarjetaDeCrédito getTarjeta_de_crédito() {
        return tarjeta_de_crédito;
    }
    
    /**
     * Sustituye los datos de la tarjeta de crédito del particular por los proporcionados en la función
     * @param tarjeta_de_crédito Tarjeta de crédito a la cual se va a cambiar
     */
    public void setTarjeta_de_crédito(TarjetaDeCrédito tarjeta_de_crédito) {
        this.tarjeta_de_crédito = tarjeta_de_crédito;
    }

    /**
     * Comprueba si el particular es un cliente V.I.P.
     * @return boolean - true si es un cliente V.I.P., false en caso contrario
     */
    public boolean isVip() {
        return vip;
    }
    
    /**
     * Establece si el particular es un cliente V.I.P.
     * @param vip boolean - true si es un cliente V.I.P., false en caso contrario
     */
    public void setVip(boolean vip) {
        this.vip = vip;
    }

    /**
     * Crea un particular
     * @param tarjeta_de_crédito Tarjeta de crédito
     * @param vip true si es un cliente V.I.P., false en caso contrario
     * @param DNI DNI
     * @param nombre Nombre
     * @param email Correo electrónico
     * @param clave Contraseña
     * @param teléfono Número de teléfono
     */
    public Cliente(TarjetaDeCrédito tarjeta_de_crédito, boolean vip, String DNI, String nombre, String email, String clave, String teléfono) {
        super(DNI, nombre, email, clave, teléfono);
        this.tarjeta_de_crédito = tarjeta_de_crédito;
        this.vip = vip;
    }

    /**
     * Genera un String con los datos del particular
     * @return String - Datos del particular
     */
    @Override
    public String toString() {
        return nombre+'ඞ'+DNI+'ඞ'+teléfono+'ඞ'+email+'ඞ'+clave+'ඞ'+tarjeta_de_crédito.getTitular()+'ඞ'+tarjeta_de_crédito.getNúmero_tarjeta()+'ඞ'+tarjeta_de_crédito.getCaducidad()+'ඞ'+vip;
    }
    
    /**
     * Actualiza los datos del particular
     * @param nombre Nombre
     * @param DNI DNI
     * @param teléfono Número de teléfono
     * @param correo Correo electrónico
     * @param contraseña Contraseña
     * @param titular Titular de la tarjeta de crédito
     * @param num_tarjeta Número de la tarjeta de crédito
     * @param caducidad Fecha de caducidad de la tarjeta de crédito
     * @param vip Indica si el particular es un cliente VIP (true si lo es, false en caso contrario)
     */
    public void actualizarDatos(String nombre, String DNI, String teléfono,
                                String correo, String contraseña, String titular,
                                String num_tarjeta, LocalDate caducidad, boolean vip){
        TarjetaDeCrédito tarjeta = new TarjetaDeCrédito(titular, num_tarjeta, caducidad);
        this.setTarjeta_de_crédito(tarjeta);
        this.setNombre(nombre);
        this.setDNI(DNI);
        this.setTeléfono(teléfono);
        this.setClave(contraseña);
        this.setVip(vip);
        this.setEmail(correo);
    }
}
