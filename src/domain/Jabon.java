package domain;

import java.util.Date;
import java.util.GregorianCalendar;
//Clase hija de higiene

public class Jabon extends Higiene {

    //Atributos
    private String acabado;
    private String tipojabon;

    //Constructor
    public Jabon() {
        super(new GregorianCalendar(2023, 2, 11).getTime(), "Buena", 1.50, true, "Dove", "Caja de jabones");
        this.acabado = "Mate";
        this.tipojabon = "Piel Neutra";
    }

    //Metodos
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

    //Metodo para mostrar informacion
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("El tipo de jabon es para:").append(tipojabon).append("\n");
        sb.append("El acabado en piel es: ").append(acabado).append("\n");
        sb.append("").append(super.toString()).append("\n");
        return sb.toString();
    }

}
