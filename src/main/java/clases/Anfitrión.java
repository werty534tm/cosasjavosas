package clases;
import java.time.LocalDate;
/**
 *
 * @author Tomás
 */
public class Anfitrión extends Persona{
    private LocalDate fecha_de_registro;
    private boolean superanfitrión;
    
    public LocalDate getFecha() {
        return this.fecha_de_registro;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha_de_registro = fecha;
    }
    
    public boolean isSuperanfitrión() {
        return superanfitrión;
    }
    public void setSuperanfitrión(boolean superanfitrión) {
        this.superanfitrión = superanfitrión;
    }

    public Anfitrión(LocalDate fecha_de_registro, boolean superanfitrión, String DNI, String nombre, String email, String clave, String teléfono) {
        super(DNI, nombre, email, clave, teléfono);
        this.fecha_de_registro = fecha_de_registro;
        this.superanfitrión = superanfitrión;
    }

    @Override
    public String toString() {
        return "Anfitri\u00f3n{" + "fecha_de_registro=" + fecha_de_registro + ", superanfitri\u00f3n=" + superanfitrión + '}';
    }
}
