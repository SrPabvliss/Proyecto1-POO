package domain;

import java.util.GregorianCalendar;
//Clase hija de alimentos

public class Arroz extends Alimentos {

    //Atributos
    private String tipoArroz;
    private int cantidadLibras;

    //Constructor
    public Arroz() {
        super(new GregorianCalendar(2023, 2, 11).getTime(), true, 3.75, true, "SuperExtra", "Saco de arroz");
        this.tipoArroz = "Blanco";
        this.cantidadLibras = 5;
    }

    //Metodos
    public String getTipoArroz() {
        return tipoArroz;
    }

    public void setTipoArroz(String tipoArroz) {
        this.tipoArroz = tipoArroz;
    }

    public int getCantidadLibras() {
        return cantidadLibras;
    }

    public void setCantidadLibras(int cantidadLibras) {
        this.cantidadLibras = cantidadLibras;
    }

    //Metodo para mostrar informacion
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo de Arroz : ").append(tipoArroz).append("\n");
        sb.append("Libras de arroz : ").append(cantidadLibras).append("\n");
        sb.append("").append(super.toString()).append("\n");
        return sb.toString();
    }
}
