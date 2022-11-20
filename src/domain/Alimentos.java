package domain;

import java.util.Date;

public class Alimentos extends Producto {

    protected Date fechaexpiracion;
    protected boolean procesado;

    public Alimentos(Date fechaexpiracion, boolean procesado) {
        this.fechaexpiracion = fechaexpiracion;
        this.procesado = procesado;
    }

    public Alimentos(Date fechaexpiracion, boolean procesado, double precio, boolean disponibilidad, String marca, String name) {
        super(precio, disponibilidad, marca, name);
        this.fechaexpiracion = fechaexpiracion;
        this.procesado = procesado;
    }
        public Alimentos(Date fechaexpiracion, boolean procesado, double precio, boolean disponibilidad, String marca, String name, int cantidad) {
        super(precio, disponibilidad, marca, name, cantidad);
        this.fechaexpiracion = fechaexpiracion;
        this.procesado = procesado;
    }

    public Date getFechaexpiracion() {
        return fechaexpiracion;
    }

    public void setFechaexpiracion(Date fechaexpiracion) {
        this.fechaexpiracion = fechaexpiracion;
    }

    public boolean isProcesado() {
        return procesado;
    }

    public void setProcesado(boolean procesado) {
        this.procesado = procesado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Feecha de expiracion : ").append(fechaexpiracion).append("\n");
        sb.append("Procesado : ").append(procesado).append("\n");
        sb.append(super.toString()).append("\n");
        return sb.toString();
    }

}
