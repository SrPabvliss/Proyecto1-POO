package domain;

import java.util.Date;
import java.util.GregorianCalendar;

public class Zapatos extends Vestimenta {

    //Atributos
    protected String TipoZapato;
    protected int Talla;

    //Constructores
    public Zapatos() {
        super(new GregorianCalendar(2065, 7, 12).getTime(), "Baja", 70.34, true, "Adidas", "F-12");
        this.TipoZapato = "Deportivos";
        this.Talla = 38;
    }

    public Zapatos(int cantidad) {
        super(new GregorianCalendar(2080, 5, 25).getTime(), "Alta", 130.65, true, "CalvinKlein", "Eliot");
        this.TipoZapato = "Formales";
        this.Talla = 40;

    }

    //Metodos
    public String getTipoZapato() {
        return TipoZapato;
    }

    public int getTalla() {
        return Talla;
    }

    public void setTipoZapato(String TipoZapato) {
        this.TipoZapato = TipoZapato;
    }

    public void setTalla(int Talla) {
        this.Talla = Talla;
    }

    //Metodo para mostrar informacion
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("El tipo de zapato es: ").append(TipoZapato).append("\n");
        sb.append("La talla de su zapato es: ").append(Talla).append("\n");
        sb.append("").append(super.toString()).append("\n");
        return sb.toString();
    }
}
