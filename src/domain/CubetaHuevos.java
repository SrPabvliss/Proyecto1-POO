package domain;

import java.util.Date;
import java.util.GregorianCalendar;
//Clase hija de alimentos

public class CubetaHuevos extends Alimentos {

    //Atributos
    private String tipoHuevos;
    private String tamanio;

    //Constructor
    public CubetaHuevos() {
        super(new GregorianCalendar(2023, 2, 11).getTime(), false, 4.50, true, "Supermaxi", "Cubeta de huevos");
        this.tipoHuevos = "Runas";
        this.tamanio = "Medianos";
    }

    //Metodos
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

    //Metodo para mostrar informacion
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo de Huevos : ").append(tipoHuevos).append("\n");
        sb.append("Tamanio de los huevos : ").append(tamanio).append("\n");
        sb.append("").append(super.toString()).append("\n");
        return sb.toString();
    }

}
