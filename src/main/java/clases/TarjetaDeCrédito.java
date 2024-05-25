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

    public LocalDate getCaducidad() {
        return caducidad;
    }
    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    public String getNúmero_tarjeta() {
        return número_tarjeta;
    }
    public void setNúmero_tarjeta(String número_tarjeta) {
        this.número_tarjeta = número_tarjeta;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public TarjetaDeCrédito(String titular, String número_tarjeta, LocalDate caducidad) {
        this.titular = titular;
        this.número_tarjeta = número_tarjeta;
        this.caducidad = caducidad;
    }

    @Override
    public String toString() {
        return "TarjetaDeCr\u00e9dito{" + "titular=" + titular + ", n\u00famero_tarjeta=" + número_tarjeta + ", caducidad=" + caducidad + '}';
    }
}
