package domain;

import java.util.Date;
//Clase hija de producto

public class Higiene extends Producto {

    //Atributos
    protected Date fechaExpi;
    protected String calidad;

    //Constructor
    public Higiene(Date fechaExpi, String calidad, double precio, boolean disponibilidad, String marca, String name) {
        super(precio, disponibilidad, marca, name);
        this.fechaExpi = fechaExpi;
        this.calidad = calidad;
    }

    //Metodos
    public Date getFechaExpi() {
        return fechaExpi;
    }

    public void setFechaExpi(Date fechaExpi) {
        this.fechaExpi = fechaExpi;
    }

    public String isCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    //Metodo para mostrar informacion
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha de expiracion: ").append(fechaExpi).append("\n");
        sb.append("La calidad es: ").append(calidad).append("\n");
        sb.append(super.toString()).append("\n");
        return sb.toString();
    }

}
