
package domain;

import java.util.GregorianCalendar;

public class Pan extends Alimentos {
    private String tipoMasa;
    private boolean isFresco;

    public Pan() {
        super(new GregorianCalendar(2023, 2, 11).getTime(), false, 1.50, false, "SuCasa", "Funda de pan");
        this.tipoMasa = "Blanco";
        this.isFresco = true;
    }

    public String getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public boolean isIsFresco() {
        return isFresco;
    }

    public void setIsFresco(boolean isFresco) {
        this.isFresco = isFresco;
    }
    
    
        @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo de masa del pan : ").append(this.tipoMasa).append("\n");
        sb.append("El pan es fresco : ").append(this.isFresco).append("\n");
        sb.append("").append(super.toString()).append("\n");
        return sb.toString();
    }
}
