package domain;

import java.util.Date;
import java.util.GregorianCalendar;

public class PastaDental extends Higiene{
    private String sabor;
    private String elimbacterias;

    public PastaDental() {
        super(new GregorianCalendar(2023, 2, 11).getTime(), true, 2 , true, "Colgate", "Caja de dentifrico");
        this.sabor = "Menta";
        this.elimbacterias = "99.9 %";
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getElimbacterias() {
        return elimbacterias;
    }

    public void setElimbacterias(String elimbacterias) {
        this.elimbacterias = elimbacterias;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("El sabor del dentifrico es: ").append(sabor).append("\n");
        sb.append("Elimina bacterias hasta: ").append(elimbacterias).append("\n");
        sb.append(super.toString()).append("\n");
        return sb.toString();
    }
    
    
}
