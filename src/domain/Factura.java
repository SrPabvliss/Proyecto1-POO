package domain;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Factura {

    //Metodos
    private String NombreCliente;
    private String CedulaCliente;
    private Date fechaEmision;

    //Constructor
    public Factura(String NombreCliente, String CedulaCliente) {
        this.NombreCliente = NombreCliente;
        this.CedulaCliente = CedulaCliente;
        this.fechaEmision = new Date();
    }

    //Metodo para generar factura fisica
    public void generarFactura(Orden orden) {
        boolean repetir = true;
        int cont = 1;
        
        do {
            File file = new File("\\C:\\Users\\USER\\Desktop\\Factura"+cont+".txt");
            repetir = true;
            try {
                if (!file.exists()) {

                    file.createNewFile();

                } else {
                    repetir = false;
                    cont++;
                }
                FileWriter wr = new FileWriter(file);
                BufferedWriter bf = new BufferedWriter(wr);

                bf.write("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
                bf.write("Nombre del cliente: " + this.NombreCliente + "\n");
                bf.write("C.I: " + this.CedulaCliente + "\n");
                bf.write("Fecha de emision: " + this.fechaEmision + "\n");
                bf.write("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
                bf.write("Detalles de la compra\n");

                for (int i = 0; i < orden.contadorProductos; i++) {
                    bf.write("\nProducto: " + orden.producto[i].getName() + "\t\t");
                    bf.write("Cantidad de este producto: " + orden.producto[i].getCantidad() + "\n");
                    bf.write("Precio por unidad: " + orden.producto[i].getPrecio() + "\t\t");
                    bf.write("Precio total : " + (orden.producto[i].getPrecio()) * orden.producto[i].getCantidad() + "\n");
                }
                bf.write("\nValor total de la orden : " + orden.calcularTotal() + "\n");
                bf.write("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
                bf.write("Gracias por preferirnos, vuelva pronto :)");
                bf.close();

            } catch (IOException ex) {
                repetir = false;
                System.out.println("Hola");
            }
        } while (!repetir);

    }

    //Metodo para generar factura virtual
    public void generarFactura(Orden orden, String correo) {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("Nombre del cliente: " + this.NombreCliente);
        System.out.println("C.I: " + this.CedulaCliente);
        System.out.println("Correo electronico: " + correo);
        System.out.println("Fecha de emision: " + this.fechaEmision);
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("Detalles de la compra");
        orden.mostrarOrden();
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("Gracias por preferirnos, vuelva pronto :)");
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

        public String getCedulaCliente() {
        return CedulaCliente;
    }

    public void setCedulaCliente(String CedulaCliente) {
        this.CedulaCliente = CedulaCliente;
    }

    //Metodo para mostrar informacion
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura{NombreCliente=").append(NombreCliente);
        sb.append(", CedulaCliente=").append(CedulaCliente);
        sb.append(", fechaEmision=").append(fechaEmision);
        sb.append('}');
        return sb.toString();
    }

}
