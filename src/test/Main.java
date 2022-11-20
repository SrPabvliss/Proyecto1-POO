package test;

import domain.*;
import domain.OpcionAlimentacion;
import domain.Orden;
import domain.Orden;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Orden orden = new Orden();
        System.out.println("Bienvenido al minimarket Don Bartolo");
        boolean regresarMenu;
        do {
            regresarMenu = false;

            System.out.println("Que tipo de producto estas buscando?");
            System.out.println("1.Alimentos\n2.Higiene\n3.Salud\n4.Vestimenta");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    OpcionAlimentacion opcion1 = new OpcionAlimentacion();
                    boolean avanzar = false;
                    do {
                        System.out.println("Te presento los productos de alimentacion disponibles");
                        System.out.println("1.Cubeta de huevos\n2.Funda de leche\n3.Saco de arroz\n4.Funda de pan\n5.Regresar ");
                        int seleccion = sc.nextInt();
                        avanzar = true;
                        regresarMenu = false;
                        switch (seleccion) {
                            case 1 -> {
                                System.out.println("Contamos con 3 opciones de huevos:\n1.Medianos\n2.Grandes\n3.Extra Grandes");
                                CubetaHuevos huevos1 = new CubetaHuevos();
                                CubetaHuevos huevos2 = new CubetaHuevos();
                                CubetaHuevos huevos3 = new CubetaHuevos();
                                huevos2.setTamanio("Grandes");
                                huevos2.setMarca("Aki");
                                huevos2.setPrecio(6.00);
                                huevos3.setTamanio("Extra Grandes");
                                huevos3.setMarca("BiO");
                                huevos3.setPrecio(7.50);
                                opcion1.desplegarMenu(huevos1, huevos2, huevos3, orden);
                                orden.mostrarOrden();

                            }
                            case 2 -> {
                                System.out.println("Contamos con 3 opciones de leche:\n1.Entera\n2.Semidescremada\n3.Descremada");
                                Leche leche1 = new Leche();
                                Leche leche2 = new Leche();
                                Leche leche3 = new Leche();
                                leche2.setTipoLeche("Semidescremada");
                                leche2.setPrecio(0.90);
                                leche3.setTipoLeche("Descremada");
                                leche3.setPrecio(1.10);
                                opcion1.desplegarMenu(leche1, leche2, leche3, orden);
                                orden.mostrarOrden();

                            }
                            case 3 -> {
                                System.out.println("Contamos con 2 opciones de arroz:\n1.Blanco\n2.Integral ");
                                Arroz arroz1 = new Arroz();
                                Arroz arroz2 = new Arroz();
                                arroz2.setMarca("Conejo");
                                arroz2.setTipoArroz("Integral");
                                arroz2.setPrecio(4.25);
                                opcion1.desplegarMenu(arroz1, arroz2, orden);
                                orden.mostrarOrden();
                            }
                            case 4 -> {
                                System.out.println("Contamos con 2 opciones de pan:\n1.Blanco\n2.Integral");
                                Pan pan1 = new Pan();
                                Pan pan2 = new Pan();
                                pan2.setTipoMasa("Integral");
                                pan2.setPrecio(2.0);
                                pan2.setMarca("Bimbo");
                                opcion1.desplegarMenu(pan1, pan2, orden);
                                orden.mostrarOrden();
                            }
                            case 5 -> {
                                regresarMenu = true;
                            }
                            default -> {
                                avanzar = false;
                                System.out.println("Opcion invalida");
                            }
                        }
                        if (avanzar == true && regresarMenu == false) {
                            avanzar = opcion1.repetirOpcion(avanzar);
                            regresarMenu = true;
                        }

                    } while (avanzar == false);

                    break;

                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    throw new AssertionError();
            }

        } while (regresarMenu);

    }

}
