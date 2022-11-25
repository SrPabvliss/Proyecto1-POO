package domain;

import java.util.Date;
import java.util.GregorianCalendar;

public class Jabon extends Higiene{
    private String acabado;
    private String tipojabon;
    public Jabon(){
        super(new GregorianCalendar(2023, 2, 11).getTime(), "Buena", 1.50, true, "Dove", "Caja de jabones");
        this.acabado = "Mate";
        this.tipojabon = "Piel Neutra";
    }

    public String getAcabado() {
        return acabado;
    }

    public void setAcabado(String acabado) {
        this.acabado = acabado;
    }

    public String getTipojabon() {
        return tipojabon;
    }

    public void setTipojabon(String tipojabon) {
        this.tipojabon = tipojabon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("El tipo de jabon es para:").append(tipojabon).append("\n");
        sb.append("El acabado en piel es: ").append(acabado).append("\n");
        sb.append("").append(super.toString()).append("\n");
        return sb.toString();
    }
    
    
  
}
