package domain;

import java.util.Date;
import java.util.GregorianCalendar;
//Clase hija de vestimenta

public class Pantalon extends Vestimenta {

    //Atributos
    protected String TipoPantalon;
    protected int Talla;

    //Constructores
    public Pantalon() {
        super(new GregorianCalendar(2077, 4, 14).getTime(), "Media", 30, true, "Berksha", "Ex-t2");
        this.TipoPantalon = "Capri";
        this.Talla = 32;
    }

    public Pantalon(int cantidad) {
        super(new GregorianCalendar(2050, 4, 14).getTime(), "Alta", 25, true, "RM", "Verdanks");
        this.TipoPantalon = "Skinny";
        this.Talla = 28;
    }

    //Metodos
    public String getTipoPantalon() {
        return TipoPantalon;
    }

    public int getTalla() {
        return Talla;
    }

    public void setTipoPantalon(String TipoPantalon) {
        this.TipoPantalon = TipoPantalon;
    }

    public void setTalla(int Talla) {
        this.Talla = Talla;
    }

    //Metodo para mostrar informacion
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("El tipo de pantalon es: ").append(TipoPantalon).append("\n");
        sb.append("La talla de su pantalon es: ").append(Talla).append("\n");
        sb.append("").append(super.toString()).append("\n");
        return sb.toString();
    }
}
