
package domain;

import java.util.GregorianCalendar;

public class Vitaminas extends Salud  {
    private String tipodevitamina;
    private String sabordelavitamina;
    
    public Vitaminas() {
        super(new GregorianCalendar(2025, 1, 12).getTime(), "Pastillas", 400, 12, true, "Almirall", "Hidroxil");
        this.tipodevitamina = "B12";
        this.sabordelavitamina = "Sandia";
    }

    
    public void setTipodevitamina(String tipodevitamina) {
        this.tipodevitamina = tipodevitamina;
    }

    public void setSabordelavitamina(String sabordelavitamina) {
        this.sabordelavitamina = sabordelavitamina;
    }

    public String getTipodevitamina() {
        return tipodevitamina;
    }

    public String getSabordelavitamina() {
        return sabordelavitamina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("El tipo de vitamina es: ").append(tipodevitamina).append("\n");
        sb.append("El sabor de la vitamina es: ").append(sabordelavitamina).append("\n");
        sb.append("").append(super.toString()).append("\n");
        return sb.toString();
    }
    
    
   
    
    
    }
    

