package domain;

import java.util.Date;
//Clase hija de producto

public class Vestimenta extends Producto {

    //Atributos
    protected String material;
    protected String promocion;

    //Constructor
    public Vestimenta(Date fechaExpi, String calidad, double precio, boolean disponibilidad, String marca, String name) {
        super(precio, disponibilidad, marca, name);
        this.material = material;
        this.promocion = promocion;
    }

    //Metodos
    public String getMaterial() {
        return material;
    }

    public String isPromocion() {
        return promocion;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPromocion(String promocion) {
        this.promocion = promocion;
    }

    //Metodo para mostrar informacion
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("El material del que esta hecha la vestimenta es :").append(material).append("\n");
        sb.append("Tiene una promocion la prenda: ").append(promocion).append("\n");
        sb.append(super.toString());
        return sb.toString();
    }

}
