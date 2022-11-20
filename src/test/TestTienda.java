
package test;

import domain.*;

public class TestTienda {
    public static void main(String[] args) {
        Leche leche = new Leche ();
        leche.setCantidad(3);
//        System.out.println("Leche \n" + leche);
        CubetaHuevos huevos = new CubetaHuevos ();
        huevos.setCantidad(3);
//        System.out.println("Cubeta de huevos \n" + huevos);
        Pan pan = new Pan ();
        pan.setCantidad(5);
//        System.out.println("Pan \n" + pan);
        Arroz arroz = new Arroz ();
//        System.out.println("Arroz \n" + arroz);
        
        Orden orden1 = new Orden ();
        orden1.agregarProducto(arroz);
        orden1.agregarProducto(pan);
        orden1.agregarProducto(huevos);
        orden1.agregarProducto(leche);
        orden1.mostrarOrden();
        
//        Factura factura = new Factura ("Pablo Villacres", 1850046317);
//        factura.generarFactura(orden1, "pablomartinvillacres@gmail.com");
    }
    
}
