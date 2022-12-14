package domain;

import java.util.GregorianCalendar;

//Clase hija de salud
public class Paracetamol extends Salud {

    //Atributos
    private String tipodeparacetamol;
    private int dosisdeparacetamol;

    //Constructor
    public Paracetamol() {
        super(new GregorianCalendar(2027, 12, 28).getTime(), "Jarabe", 400, 16.98, true, "MK", "Paracetamol");
        this.tipodeparacetamol = "Comercial";
        this.dosisdeparacetamol = 10;
    }

    //Metodos
    public void setTipodeparacetamol(String tipodeparacetamol) {
        this.tipodeparacetamol = tipodeparacetamol;
    }

    public String getTipodeparacetamol() {
        return tipodeparacetamol;
    }

    public void setDosisdeparacetamol(int dosisdeparacetamol) {
        this.dosisdeparacetamol = dosisdeparacetamol;
    }

    public int getDosisdeparacetamol() {
        return dosisdeparacetamol;
    }

    //Metodo para mostrar informacion
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("El paracetamol es de tipo: ").append(tipodeparacetamol).append("\n");
        sb.append("La dosis que debe ingerir es de: ").append(dosisdeparacetamol).append("mg \n");
        sb.append("").append(super.toString()).append("\n");
        return sb.toString();
    }

}
