
package domain;
import java.util.Date;

public class Salud  extends Producto{
    
    protected Date expiracion;
    protected String presentacion;
    protected int contenido;

    public Salud(Date expiracion, String presentacion, int contenido, double precio, boolean disponibilidad, String marca, String name) {
        super(precio, disponibilidad, marca, name);
        this.expiracion = expiracion;
        this.presentacion = presentacion;
        this.contenido = contenido;
    }

    public Salud(Date expiracion, String presentacion, int contenido, double precio, boolean disponibilidad, String marca, String name, int cantidad) {
        super(precio, disponibilidad, marca, name, cantidad);
        this.expiracion = expiracion;
        this.presentacion = presentacion;
        this.contenido = contenido;
    }
    
    
     public Date getexpiracion() {
        return expiracion;
    }

    public void setexpiracion(Date expiracion) {
        this.expiracion = expiracion;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("La Fecha de expiracion es: ").append(expiracion).append("\n");
        sb.append("Presentacion: ").append(presentacion).append("\n");
        sb.append("El contenido del medicamento es de: ").append(contenido).append(" \n");
        sb.append("").append(super.toString()).append("\n");
        
        return sb.toString();
    }

   
}
