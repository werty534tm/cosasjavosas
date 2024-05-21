package clases;
import java.time.LocalDate;
/**
 *
 * @author cojones
 */
public class TarjetaDeCrédito {
    
    private String titular;
    private String número_tarjeta;
    private String caducidad;

    public String getCaducidad() {
        return caducidad;
    }
    public void setCaducidad(String caducidad) {
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

    public TarjetaDeCrédito(String titular, String número_tarjeta, String caducidad) {
        this.titular = titular;
        this.número_tarjeta = número_tarjeta;
        this.caducidad = caducidad;
    }

    @Override
    public String toString() {
        return "TarjetaDeCr\u00e9dito{" + "titular=" + titular + ", n\u00famero_tarjeta=" + número_tarjeta + ", caducidad=" + caducidad + '}';
    }
}
