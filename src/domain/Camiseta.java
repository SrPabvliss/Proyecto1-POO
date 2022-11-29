package domain;

import java.util.Date;
import java.util.GregorianCalendar;
//Clase hija de vestimenta

public class Camiseta extends Vestimenta {

    //Atributos
    protected String TipoCuello;
    protected String TipoManga;

    //Contructores
    public Camiseta() {
        super(new GregorianCalendar(2050, 4, 14).getTime(), "Alta", 25, true, "RM", "Verdanks");
        this.TipoCuello = "Punta";
        this.TipoManga = "Rectangular";
    }

    public Camiseta(int cantidad) {
        super(new GregorianCalendar(2050, 4, 14).getTime(), "Alta", 25, true, "RM", "Verdanks");
        this.TipoCuello = "Rectangular";
        this.TipoManga = "Circular";
    }

    //Metodos
    public String getTipoCuello() {
        return TipoCuello;
    }

    public String getTipoManga() {
        return TipoManga;
    }

    public void setTipoCuello(String TipoCuello) {
        this.TipoCuello = TipoCuello;
    }

    public void setTipoManga(String TipoManga) {
        this.TipoManga = TipoManga;
    }

    //Metodo para mostrar informacion
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("El tipo de cuello de la camiseta es: ").append(TipoCuello).append("\n");
        sb.append("El tipo de manga de su pantalon es: ").append(TipoManga).append("\n");
        sb.append("").append(super.toString()).append("\n");
        return sb.toString();
    }
}
