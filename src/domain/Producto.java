package domain;
//Clase padre de todos lo objetos que vamos a crear

public class Producto {

    //Atributos
    private int idProducto;
    protected double precio;
    protected boolean disponible;
    protected String name;
    protected String marca;
    private static int contadorProductos;
    private int cantidad;

    //Constructores
    protected Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(double precio, boolean disponibilidad, String marca, String name) {
        this();
        this.precio = precio;
        this.disponible = disponibilidad;
        this.marca = marca;
        this.name = name;
        this.cantidad = 1;
    }

    public Producto(double precio, boolean disponibilidad, String marca, String name, int cantidad) {
        this();
        this.precio = precio;
        this.disponible = disponibilidad;
        this.marca = marca;
        this.name = name;
        this.cantidad = cantidad;
    }

    //Metodos get y set para cada atributo
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String isDisponibile() {
        String disponibilidad = null;
        if (disponible) {
            disponibilidad = "Esta disponible";
        } else if (!disponible) {
            disponibilidad = "Agotado";
        }
        return disponibilidad;
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

    //Metodo especial toString para mostrar informacion
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID del producto: ").append(idProducto).append("\n");
        sb.append("Precio del producto: ").append(precio).append("\n");
        sb.append("Disponibilidad : ").append(isDisponibile()).append("\n");
        sb.append("Cantidad de este producto : ").append(cantidad).append("\n");
        sb.append("Marca del Producto : ").append(marca);
        return sb.toString();
    }

}
