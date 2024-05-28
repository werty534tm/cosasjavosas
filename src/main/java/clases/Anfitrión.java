package clases;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 * Clase que maneja los datos de los anfitriones
 * @author Tomás
 */
public class Anfitrión extends Persona{
    private LocalDate fecha_de_registro;
    private boolean superanfitrión;
    
    /**
     * Obtiene la fecha de registro del anfitrión
     * @return LocalDate - Fecha de registro del anfitrión
     */
    public LocalDate getFecha() {
        return this.fecha_de_registro;
    }
    
    /**
     * Cambia la fecha de registro del anfitrión a la proporcionada en la función
     * @param fecha Fecha a la cual se va a cambiar
     */
    public void setFecha(LocalDate fecha) {
        this.fecha_de_registro = fecha;
    }
    
    /**
     * Obtiene el valor que determina si el anfitrión es un superanfitrión o no
     * @return boolean - true si el anfitrión es un superanfitrión, false en caso contrario
     */
    public boolean isSuperanfitrión() {
        return superanfitrión;
    }
    
    /**
     * Cambia el valor de si el anfitrión es suèranfitrión o no
     */
    public void setSuperanfitrión() {
        Double sum = 0.0;
        Double contador = 0.0;
        for(int i=0;i<Datos.lista_inmuebles.size();i++){
            if(Datos.lista_inmuebles.get(i).getDueño().equals(this.nombre)){
                sum += Datos.lista_inmuebles.get(i).getCalificacion();
                contador += 1;
            }
        }
        if((sum/contador)>4){
            this.superanfitrión=true;
        }
    }

    /**
     * Crea un anfitrión
     * @param fecha_de_registro Fecha de registro del anfitrión
     * @param superanfitrión true si el anfitrión es un superanfitrión, false en caso contrario
     * @param DNI DNI
     * @param nombre Nombre completo
     * @param email Correo electrónico
     * @param clave Contraseña
     * @param teléfono Número de teléfono
     */
    public Anfitrión(LocalDate fecha_de_registro, boolean superanfitrión, String DNI, String nombre, String email, String clave, String teléfono) {
        super(DNI, nombre, email, clave, teléfono);
        this.fecha_de_registro = fecha_de_registro;
        this.superanfitrión = false;
    }

    /**
     * Genera un String con la información del anfitrión
     * @return String - String con la información del anfitrión
     */
    @Override
    public String toString() {
        return nombre+'ඞ'+DNI+'ඞ'+teléfono+'ඞ'+email+'ඞ'+clave+'ඞ'+fecha_de_registro+'ඞ'+superanfitrión;
    }
    
    /**
     * Actualiza los datos del anfitrión
     * @param nombre Nombre
     * @param DNI DNI
     * @param teléfono Número de teléfono
     * @param correo Correo electrónico
     * @param contraseña Contraseña
     */
    public void actualizarDatos(String nombre, String DNI, String teléfono,
                                String correo, String contraseña){
        this.setNombre(nombre);
        this.setDNI(DNI);
        this.setTeléfono(teléfono);
        this.setClave(contraseña);
        this.setEmail(correo);
    }
}
