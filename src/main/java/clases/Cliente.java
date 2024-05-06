package clases;
import clases.TarjetaDeCrédito;
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
        return "Cliente{" + "tarjeta_de_cr\u00e9dito=" + tarjeta_de_crédito + ", vip=" + vip + '}';
    }
}
