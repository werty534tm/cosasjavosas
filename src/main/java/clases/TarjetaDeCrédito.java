package clases;
import java.time.LocalDate;
/**
 *
 * @author cojones
 */
public class TarjetaDeCrédito {
    
    private String titular;
    private String número_tarjeta;
    private LocalDate caducidad;

    /**
     * Obtiene la fecha de caducidad de la tarjeta de crédito
     * @return LocalDate - Fecha de caducidad de la tarjeta de crédito
     */
    public LocalDate getCaducidad() {
        return caducidad;
    }
    
    /**
     * Sustituye la fecha de caducidad de la tarjeta de crédito por la proporcionada
     * @param caducidad Fecha de caducidad nueva
     */
    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    /**
     * Obtiene el número de la tarjeta de crédito
     * @return String - Número de la tarjeta de crédito
     */
    public String getNúmero_tarjeta() {
        return número_tarjeta;
    }
    
    /**
     * Sustituye el número de la tarjeta de crédito por el proporcionado
     * @param número_tarjeta - Número nuevo
     */
    public void setNúmero_tarjeta(String número_tarjeta) {
        this.número_tarjeta = número_tarjeta;
    }

    /**
     * Obtiene el nombre del titular de la tarjeta de crédito
     * @return String - Nombre del titular de la tarjeta de crédito
     */
    public String getTitular() {
        return titular;
    }
    
    /**
     * Sustituye el nombre del titular de la tarjeta de crédito por el proporcionado
     * @param titular String - Nombre nuevo
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * Creae una tarjeta de crédito
     * @param titular Titular
     * @param número_tarjeta Número de la tarjeta de crédito
     * @param caducidad Fecha de caducidad de la tarjeta de crédito
     */
    public TarjetaDeCrédito(String titular, String número_tarjeta, LocalDate caducidad) {
        this.titular = titular;
        this.número_tarjeta = número_tarjeta;
        this.caducidad = caducidad;
    }

    /**
     * Genera un String con la información de la tarjeta de crédito
     * @return 
     */
    @Override
    public String toString() {
        return "TarjetaDeCr\u00e9dito{" + "titular=" + titular + ", n\u00famero_tarjeta=" + número_tarjeta + ", caducidad=" + caducidad + '}';
    }
}
