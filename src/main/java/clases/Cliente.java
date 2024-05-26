package clases;

import java.time.LocalDate;

/**
 *
 * @author cojones
 */
public class Cliente extends Persona{
    
    private TarjetaDeCrédito tarjeta_de_crédito;
    private boolean vip;

    public TarjetaDeCrédito getTarjeta_de_crédito() {
        return tarjeta_de_crédito;
    }
    public void setTarjeta_de_crédito(TarjetaDeCrédito tarjeta_de_crédito) {
        this.tarjeta_de_crédito = tarjeta_de_crédito;
    }

    public boolean isVip() {
        return vip;
    }
    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Cliente(TarjetaDeCrédito tarjeta_de_crédito, boolean vip, String DNI, String nombre, String email, String clave, String teléfono) {
        super(DNI, nombre, email, clave, teléfono);
        this.tarjeta_de_crédito = tarjeta_de_crédito;
        this.vip = vip;
    }

    @Override
    public String toString() {
        return nombre+' '+DNI+' '+teléfono+' '+email+' '+clave+' '+tarjeta_de_crédito.getTitular()+' '+tarjeta_de_crédito.getNúmero_tarjeta()+' '+tarjeta_de_crédito.getCaducidad()+' '+vip;
    }
    
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
