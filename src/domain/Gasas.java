package domain;

import java.util.GregorianCalendar;
//Clase hija de salud

public class Gasas extends Salud {

    //Atributos
    private String tipodegasas;
    private String adherencia;

    //Constructor
    public Gasas() {
        super(new GregorianCalendar(2021, 8, 23).getTime(), "Tela", 24, 3.57, true, "CureBand", "Gasa Esteril");
        this.tipodegasas = "Monofilamento";
        this.adherencia = "Adherente";

    }

    //Metodos
    public void setTipodegasas(String tipodegasas) {
        this.tipodegasas = tipodegasas;
    }

    public String getTipodegasas() {
        return tipodegasas;
    }

    public void setAdherencia(String adherencia) {
        this.adherencia = adherencia;
    }

    public String getAdherencia() {
        return adherencia;
    }

    //Metodo para mostrar informacion
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("El tipo de gasa es: ").append(tipodegasas).append("\n");
        sb.append("Con respecto a su adherencia es: ").append(adherencia).append("\n");
        sb.append("").append(super.toString()).append("\n");
        return sb.toString();
    }

}
