package domain;

public class Orden {

    private int idOrden;
    private Producto producto[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private final static int MAXPRODUCTOS = 30;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.producto = new Producto[MAXPRODUCTOS];
    }
    
    //metodo para agregar productos al vector productos
    //hola
    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAXPRODUCTOS) {
            this.producto[this.contadorProductos++] = producto;

        } else {
            System.out.println("Ha excedido el maximo de productos");
        }

    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += (this.producto[i].getPrecio()) * this.producto[i].getCantidad();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Id orden : " + this.idOrden + "\n");

        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.print("Producto: " + this.producto[i].getName() + "\t\t");
            System.out.println("Cantidad de este producto: " + this.producto[i].getCantidad());
            System.out.print("Precio por unidad: " + this.producto[i].getPrecio() + "\t\t");
            System.out.println("Precio total : " + (this.producto[i].getPrecio()) * this.producto[i].getCantidad() + "\n");
        }

        System.out.println("Valor total de la orden : " + this.calcularTotal());

    }

}
