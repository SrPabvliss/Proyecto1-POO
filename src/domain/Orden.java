package domain;

public class Orden {

    //Atributos
    protected int idOrden;
    protected Producto producto[];
    protected static int contadorOrdenes;
    protected int contadorProductos;
    protected final static int MAXPRODUCTOS = 30;

    //Constructor
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.producto = new Producto[MAXPRODUCTOS];
    }

    //metodo para agregar productos al vector productos
    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAXPRODUCTOS) {
            this.producto[this.contadorProductos++] = producto;

        } else {
            System.out.println("Ha excedido el maximo de productos");
        }

    }

    //Metodo para calcular el total a pagar de la orden
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += (this.producto[i].getPrecio()) * this.producto[i].getCantidad();
        }
        return total;
    }

    //Metodo para mostrar los productos agregados a la orden
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
