package domain;

import java.io.File;
import java.util.Date;

public class Factura {

    //Metodos
    private String NombreCliente;
    private int CedulaCliente;
    private Date fechaEmision;

    //Constructor
    public Factura(String NombreCliente, int CedulaCliente) {
        this.NombreCliente = NombreCliente;
        this.CedulaCliente = CedulaCliente;
        this.fechaEmision = new Date();
    }

    //Metodo para generar factura fisica
    public void generarFactura(Orden orden) {

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

    public int getCedulaCliente() {
        return CedulaCliente;
    }

    public void setCedulaCliente(int CedulaCliente) {
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
