package domain;

import java.util.Scanner;

public class OpcionAlimentacion {

    private Scanner sc;
    Producto producto;

    {
        this.sc = new Scanner(System.in);

    }

    public void desplegarMenu(Producto producto, Producto producto2, Producto producto3, Orden orden) {

        System.out.println("--------------------------------------------------------------------------------\nOPCION 1");
        System.out.println(producto);
        System.out.println("--------------------------------------------------------------------------------\nOPCION 2");
        System.out.println(producto2);
        System.out.println("--------------------------------------------------------------------------------\nOPCION 3");
        System.out.println(producto3);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Escoge una de las opciones: ");

        boolean validez;
        do {
            validez = true;
            switch (sc.nextInt()) {
                case 1 ->
                    agregarUnidades(producto, orden);
                case 2 ->
                    agregarUnidades(producto2, orden);
                case 3 ->
                    agregarUnidades(producto3, orden);
                default -> {
                    System.out.println("Ingresa un valor valido");
                    validez = false;
                }

            }
        } while (validez == false);

    }

    public void desplegarMenu(Producto producto, Producto producto2, Orden orden) {

        System.out.println("--------------------------------------------------------------------------------\nOPCION 1");
        System.out.println(producto);
        System.out.println("--------------------------------------------------------------------------------\nOPCION 2");
        System.out.println(producto2);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Escoge una de las opciones: ");

        boolean validez;
        do {
            validez = true;
            switch (sc.nextInt()) {
                case 1 ->
                    agregarUnidades(producto, orden);
                case 2 ->
                    agregarUnidades(producto2, orden);
                default -> {
                    System.out.println("Ingresa un valor valido");
                    validez = false;
                }

            }
        } while (validez == false);

    }

    public void agregarUnidades(Producto producto, Orden orden) {
        System.out.println("Desea agregar mas de una unidad? 1.si, 2.no");
        boolean validez;
        do {
            validez = true;
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Indica la cantidad de unidades que deseas");
                    producto.setCantidad(sc.nextInt());
                    orden.agregarProducto(producto);
                    System.out.println("Se ha agregado el producto con exito");
                    break;
                case 2:
                    orden.agregarProducto(producto);
                    System.out.println("Se ha agregado el producto con exito");
                    break;

                default:
                    validez = false;
                    System.out.println("Ingresa un valor valido");

            }
        } while (validez == false);
    }

    public boolean repetirOpcion(Boolean avanzar) {
        System.out.println("Desea agregar mas productos de esta clase? 1.si, 2.no");
        boolean validez;
        do {
            validez =true;
            switch (sc.nextInt()) {
            case 1:
                avanzar = false;
                break;
            case 2:
                avanzar = true;
                break;
            default:
                validez = false;
                System.out.println("Opcion invalida");
        }
            
        } while (validez==false);
        
        return avanzar;
    }

}
