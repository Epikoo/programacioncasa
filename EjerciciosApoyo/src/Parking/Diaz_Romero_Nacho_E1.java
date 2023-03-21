/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Parking;

import java.util.Scanner;

public class Diaz_Romero_Nacho_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        final int TAMANOG = 10, TAMANOP = 14; //tamaño del parking
        String tamanocoche, nuevocoche, plazasG[] = new String[TAMANOG], plazasP[] = new String[TAMANOP];
        boolean habiaplaza = false;//si las plazas estan libres pasa a true
        int plaza, nummenu;//numero para manejar el menu
        //cargamos las plazas libres por defecto
        for (int i = 0; i < plazasG.length; i++) {
            plazasG[i] = "L";
        }
        for (int i = 0; i < plazasP.length; i++) {
            plazasP[i] = "L";
        }
        //comenzamos con el trabajo del menú
        do {
            System.out.println("APARCAMIENTO WEB NOVA");
            System.out.println("- - - - - - - - - - - - - - - - - - - - -");
            System.out.println(" 1) Aparcar vehículos \n 2) Sacar Vehiculo \n 3) Mostrar aparcamiento \n 4) Salir ");
            System.out.println("OPCION? - ");
            nummenu = t.nextInt();
            switch (nummenu) {
                //Caso 1 --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                case 1:
                    do {
                        do {
                            System.out.println("Tamaño del vehiculo: G/P ");
                            tamanocoche = t.next();
                        } while (!tamanocoche.equalsIgnoreCase("G") && (!tamanocoche.equalsIgnoreCase("P")));
                        //Si viene coche grande
                        if (tamanocoche.equalsIgnoreCase("G")) {
                            for (int i = 0; i < plazasG.length && !habiaplaza; i++) {
                                if (plazasG[i].equalsIgnoreCase("L")) {
                                    plazasG[i] = "O";
                                    System.out.println("Vehiculo aparcado en G" + i);
                                    habiaplaza = true;
                                }
                            }
                            if (!habiaplaza) {
                                System.out.println("Su coche no ha sido aparcado, el parking esta lleno");
                            }
                            habiaplaza = false;
                        }
                        //Si viene coche pequeño y hay espacio en el Parkinpequeño
                        if (tamanocoche.equalsIgnoreCase("P")) {
                            for (int i = 0; i < plazasP.length && !habiaplaza; i++) {
                                if (plazasP[i].equalsIgnoreCase("L")) {
                                    plazasP[i] = "O";
                                    habiaplaza = true;
                                    System.out.println("Vehiculo aparcado en P" + i);
                                }
                            }
                            //Si no quedaban plazas en el Parkingpequeño vamos a grande
                            if (!habiaplaza) {
                                for (int i = 0; i < plazasG.length && !habiaplaza; i++) {
                                    if (plazasG[i].equalsIgnoreCase("L")) {
                                        plazasG[i] = "O";
                                        habiaplaza = true;
                                        System.out.println("Vehiculo aparcado en G" + i);
                                    }
                                }
                            }
                            //si no hay plazas
                            if (!habiaplaza) {
                                System.out.println("Todos los aparcamientos estan llenos no se ha podido aparcar otro coche");
                            }
                        }
                        habiaplaza = false;
                        //Preguntamos si desea permanecer en el caso 1 o salir
                        do {
                            System.out.println("Desesa aparcar otro coche S/N ");
                            nuevocoche = t.next();
                        } while (!nuevocoche.equalsIgnoreCase("S") && (!nuevocoche.equalsIgnoreCase("N")));
                    } while (!nuevocoche.equalsIgnoreCase("N"));
                    break;
                //Caso 2-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                case 2:
                    do {
                        //Pedimos el tamaño del coche y la plaza a retirar
                        do {
                            System.out.println("Tamaño del vehiculo: G/P ");
                            tamanocoche = t.next();
                        } while (!tamanocoche.equalsIgnoreCase("G") && (!tamanocoche.equalsIgnoreCase("P")));
                        do {
                            System.out.println("Plaza del parking: ");
                            plaza = t.nextInt();
                        } while ((!tamanocoche.equalsIgnoreCase("G") && (plaza < 0 || plaza > plazasG.length)) && (!tamanocoche.equalsIgnoreCase("P") && (plaza < 0 || plaza > plazasP.length)));
                        //si nos piden sacar de las plazas grandes
                        if (tamanocoche.equalsIgnoreCase("G")) {
                            if (plazasG[plaza].equalsIgnoreCase("O")) {
                                plazasG[plaza] = "L";
                                System.out.println("La plaza se queda libre");
                            } else {
                                System.out.println("IMPOSIBLE: en esa plaza no hay ningun vehiculo");
                            }
                        }
                        // si nos piden sacar en las plazas pequeñas
                        if (tamanocoche.equalsIgnoreCase("P")) {
                            if (plazasP[plaza].equalsIgnoreCase("O")) {
                                plazasP[plaza] = "L";
                                System.out.println("La plaza queda disponible");
                            } else {
                                System.out.println("IMPOSIBLE: en esa plaza no hay ningun vehiculo");
                            }
                        }
                        //preguntamos si desea seguir en este menu o salir al principal
                        do {
                            System.out.println("Desesa sacar otro coche S/N ");
                            nuevocoche = t.next();
                        } while (!nuevocoche.equalsIgnoreCase("S") && (!nuevocoche.equalsIgnoreCase("N")));
                    } while (!nuevocoche.equalsIgnoreCase("N"));
                    break;
                //Caso 3-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                case 3:
                    //imprimimos el parking pequeño
                    System.out.print("Las plazas del parking pequeño ");
                    for (int i = 0; i < plazasP.length; i++) {
                        if (i < plazasP.length - 1) {
                            System.out.print(plazasP[i] + " ,");
                        } else {
                            System.out.println(plazasP[i]);
                        }
                    }
                    //imprimimos el parking grande
                    System.out.print("Las plazas del parking grande ");
                    for (int i = 0; i < plazasG.length; i++) {
                        if (i < plazasG.length - 1) {
                            System.out.print(plazasG[i] + " ,");
                        } else {
                            System.out.println(plazasG[i]);
                        }
                    }
                    break;
                default:
                    break;
            }
        } while (nummenu != 4);
        System.out.println(" APARCAMIENTOS WEB  NOVA OS DESEA UN FELIZ HALLOWEEN");
        t.close();
    }
}
