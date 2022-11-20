
package test;

import domain.*;

public class TestTienda {
    public static void main(String[] args) {
        Leche leche = new Leche ();
        System.out.println("Leche \n" + leche);
        CubetaHuevos huevos = new CubetaHuevos ();
        System.out.println("Cubeta de huevos \n" + huevos);
        Pan pan = new Pan ();
        System.out.println("Pan \n" + pan);
        Arroz arroz = new Arroz ();
        System.out.println("Arroz \n" + arroz);
    }
    
}
