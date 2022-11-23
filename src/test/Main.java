package test;

import domain.*;
import domain.OpcionAlimentacion;
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
                    OpcionAlimentacion opcion2 = new OpcionAlimentacion();
                    boolean go = true;
                    do {
                        System.out.println("Te presento los productos de higiene disponibles");
                        System.out.println("1.Jabon\n2.PastaDental\n3.Champu\n4.Regresar ");
                         regresarMenu = false;
                        int accion = sc.nextInt();
                        switch (accion) {
                            case 1:
                                System.out.println("Contamos con 2 opciones de jabon:\n1.Piel Neutra\n2.Piel Seca\n3.Piel Grasa");
                                Jabon jabon1 = new Jabon();
                                Jabon jabon2 = new Jabon();
                                Jabon jabon3 = new Jabon();
                                jabon2.setTipojabon("Piel Seca");
                                jabon2.setAcabado("Brilloso");
                                jabon2.setMarca("Nivea");
                                jabon2.setPrecio(1);
                                jabon3.setTipojabon("Piel Grasa");
                                jabon3.setAcabado("Natural");
                                jabon3.setMarca("Palmolive");
                                jabon3.setPrecio(1.25);
                                opcion2.desplegarMenu(jabon1, jabon2, jabon3, orden);
                                orden.mostrarOrden();
                                
                                break;
                             case 2:
                                 System.out.println("Contamos con 2 opciones de dentifrico:\n1.Sabor menta\n2.Sabor chicle\n3.Sin sabor");
                                 PastaDental pasta1 = new PastaDental();
                                 PastaDental pasta2 = new PastaDental();
                                 PastaDental pasta3 = new PastaDental();
                                 pasta2.setElimbacterias("97.3 %");
                                 pasta2.setSabor("Chicle");
                                 pasta2.setMarca("Fortident");
                                 pasta2.setPrecio(1.75);
                                 pasta3.setElimbacterias("99 %");
                                 pasta3.setSabor("Neutro");
                                 pasta3.setPrecio(0.75);
                                 opcion2.desplegarMenu(pasta1, pasta2, pasta3, orden);
                                 orden.mostrarOrden();
                                break;
                             case 3:
                                System.out.println("Contamos con 2 opciones de dentifrico:\n1.Caacao\n2.Menta\n3.Coco");
                                 Champu champu1 = new Champu();
                                 Champu champu2 = new Champu();
                                 Champu champu3 = new Champu();
                                 champu2.setFragancia("Menta");
                                 champu2.setCantidadsales("Contiene sales");
                                 champu2.setMarca("ColaDeCaballo");
                                 champu2.setPrecio(4.25);
                                 champu3.setFragancia("Coco");
                                 champu3.setCantidadsales("Sin sales");
                                 champu3.setMarca("Pantene");
                                 champu3.setPrecio(3.25);
                                 opcion2.desplegarMenu(champu1, champu2, champu3, orden);
                                 orden.mostrarOrden();
                                break;
                             case 4:
                                regresarMenu = true;
                                break;
                            default:
                                go = false;
                                System.out.println("Opcion invalida");

                                throw new AssertionError();
                        }
                         if (go == true && regresarMenu == false) {
                            avanzar = opcion2.repetirOpcion(go);
                            regresarMenu = true;
                         }
                    } while (go == false);
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
