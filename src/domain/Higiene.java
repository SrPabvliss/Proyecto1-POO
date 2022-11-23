package domain;

import java.util.Date;

public class Higiene extends Producto {
    
    protected Date fechaExpi;
    protected boolean calidad;

    public Higiene(Date fechaExpi, boolean calidad, double precio, boolean disponibilidad, String marca, String name) {
        super(precio, disponibilidad, marca, name);
        this.fechaExpi = fechaExpi;
        this.calidad = calidad;
    }

    public Date getFechaExpi() {
        return fechaExpi;
    }

    public void setFechaExpi(Date fechaExpi) {
        this.fechaExpi = fechaExpi;
    }

    public boolean isCalidad() {
        return calidad;
    }

    public void setCalidad(boolean calidad) {
        this.calidad = calidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha de expiracion: ").append(fechaExpi).append("\n");
        sb.append("La calidad es: ").append(calidad).append("\n");
        sb.append(super.toString()).append("\n");
        return sb.toString();
    }
    
    
}
