package domain;

import java.util.Date;

//Clase hija de Producto
public class Alimentos extends Producto {

    //Atributos
    protected Date fechaexpiracion;
    protected boolean procesado;

    //Constructores
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

    //Metodos set y get de cada atributo    
    public Date getFechaexpiracion() {
        return fechaexpiracion;
    }

    public void setFechaexpiracion(Date fechaexpiracion) {
        this.fechaexpiracion = fechaexpiracion;
    }

    public String isProcesado() {
        String procesamiento = null;
        if (disponible) {
            procesamiento = "Es un producto procesado";
        } else if (!disponible) {
            procesamiento = "Es un producto natural";
        }
        return procesamiento;
    }

    public void setProcesado(boolean procesado) {
        this.procesado = procesado;
    }

    //Metodo toString para mostrar informacion
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha de expiracion : ").append(fechaexpiracion).append("\n");
        sb.append("Procesado : ").append(isProcesado()).append("\n");
        sb.append(super.toString());
        return sb.toString();
    }

}
