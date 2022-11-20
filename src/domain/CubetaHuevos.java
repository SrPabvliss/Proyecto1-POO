
package domain;

import java.util.Date;
import java.util.GregorianCalendar;

public class CubetaHuevos extends Alimentos {
    private String tipoHuevos;
    private String tamanio;

    public CubetaHuevos(){
        super(new GregorianCalendar(2023, 2, 11).getTime(), false, 3.5, true, "Aki");
        this.tipoHuevos = "Runas";
        this.tamanio = "Extra grandes";
    }

    public String getTipoHuevos() {
        return tipoHuevos;
    }

    public void setTipoHuevos(String tipoHuevos) {
        this.tipoHuevos = tipoHuevos;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

        @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo de Huevos : ").append(tipoHuevos).append("\n");
        sb.append("Tamanio de los huevos : ").append(tamanio).append("\n");
        sb.append("").append(super.toString()).append("\n");
        return sb.toString();
    }
    
    
}
