package domain;

import java.util.GregorianCalendar;

public class Leche extends Alimentos {

    private double cantidadLitros;
    private String tipoLeche;

    public Leche() {
        super(new GregorianCalendar(2023, 2, 11).getTime(), true, 2.50, true, "nutrileche");
        this.cantidadLitros = 2;
        this.tipoLeche = "Entera";
    }

    public double getCantidadLitros() {
        return cantidadLitros;
    }

    public void setCantidadLitros(double cantidadLitros) {
        this.cantidadLitros = cantidadLitros;
    }

    public String getTipoLeche() {
        return tipoLeche;
    }

    public void setTipoLeche(String tipoLeche) {
        this.tipoLeche = tipoLeche;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cantidad de litros : ").append(cantidadLitros).append("\n");
        sb.append("Tipo de leche : ").append(tipoLeche).append("\n");
        sb.append("").append(super.toString()).append("\n");
        return sb.toString();
    }

}
