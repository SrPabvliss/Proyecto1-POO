package domain;

import java.util.Date;
import java.util.GregorianCalendar;
//Clase hija de higiene

public class Champu extends Higiene {

    private String fragancia;
    private String cantidadsales;

    //Constructor
    public Champu() {
        super(new GregorianCalendar(2023, 2, 11).getTime(), "Buena", 4.50, true, "Biolans", "Frassco de Champu");
        this.fragancia = "Cacao";
        this.cantidadsales = "Sin sales";
    }

    //Metodos
    public String getFragancia() {
        return fragancia;
    }

    public void setFragancia(String fragancia) {
        this.fragancia = fragancia;
    }

    public String getCantidadsales() {
        return cantidadsales;
    }

    public void setCantidadsales(String cantidadsales) {
        this.cantidadsales = cantidadsales;
    }

    //Metodo para mostrar informacion
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("El olor de su fragancia es:").append(fragancia).append("\n");
        sb.append("La cantidad de sales presentes es:").append(cantidadsales).append("\n");
        sb.append(super.toString()).append("\n");
        return sb.toString();
    }

}
