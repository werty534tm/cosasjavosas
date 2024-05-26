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
        this.superanfitrión = false;
    }

    @Override
    public String toString() {
        return nombre+'-'+DNI+'-'+teléfono+'-'+email+'-'+clave+'-'+fecha_de_registro+'-'+superanfitrión;
    }
    
    public void actualizarDatos(String nombre, String DNI, String teléfono,
                                String correo, String contraseña){
        this.setNombre(nombre);
        this.setDNI(DNI);
        this.setTeléfono(teléfono);
        this.setClave(contraseña);
        this.setEmail(correo);
    }
}
