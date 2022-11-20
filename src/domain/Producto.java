package domain;

public class Producto {

    private int idProducto;
    protected double precio;
    protected boolean disponible;
    protected String marca;
    private static int contadorProductos;

    protected Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(double precio, boolean disponibilidad, String marca) {
        this();
        this.precio = precio;
        this.disponible = disponibilidad;
        this.marca = marca;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponibile() {
        return disponible;
    }

    public void setDisponibile(boolean disponibilidad) {
        this.disponible = disponibilidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID del producto: ").append(idProducto).append("\n");
        sb.append("Precio del producto: ").append(precio).append("\n");
        sb.append("Disponibilidad : ").append(disponible).append("\n");
        sb.append("Marca del Producto : ").append(marca);
        return sb.toString();
    }

}
