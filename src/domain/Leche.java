package domain;

import java.util.GregorianCalendar;
//Clase hija de alimentos
public class Leche extends Alimentos {
    //Atributos
    private double cantidadLitros;
    private String tipoLeche;
    
    //Constructores
    public Leche() {
        super(new GregorianCalendar(2023, 2, 11).getTime(), true, 0.80, true, "Nutrileche", "Bolsa de leche");
        this.cantidadLitros = 1;
        this.tipoLeche = "Entera";
    }
    
    public Leche(int cantidad) {
        super(new GregorianCalendar(2023, 2, 11).getTime(), true, 2.50, true, "nutrileche", "Bolsa de leche", cantidad);
        this.cantidadLitros = 2;
        this.tipoLeche = "Entera";
    }
    //Metodo set y get para cada atributo
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
    //Metodo para mostrar informacion
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cantidad de litros : ").append(cantidadLitros).append("\n");
        sb.append("Tipo de leche : ").append(tipoLeche).append("\n");
        sb.append("").append(super.toString()).append("\n");
        return sb.toString();
    }

}
