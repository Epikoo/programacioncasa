/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Futchampions;

import java.util.Scanner;

public class FutChampions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int partidost, puntos, partidosres, victorias = 0, derrotas = 0, aux;
        final int VICTORIA = 4, DERROTA = 1;
        Scanner t = new Scanner(System.in);
        System.out.println("Introduzca el numero de partidos restantes ");
        partidosres = t.nextInt();
        partidost = 20 - partidosres;
        System.out.println("Introduzca los puntos actuales");
        puntos = t.nextInt();
        if (partidost > 20 || partidost < 0) {
            System.out.println("Error debes jugar al menos un partido y no mas de 20");
        } else {
            if (partidost > puntos) {
                System.out.println("Error tus puntos no pueden ser menores que tus partidos");
            } else {
                if (partidost == puntos) {
                    System.out.println("Llevas " + partidost + " derrotas");
                } else {
                    derrotas = partidost;
                    aux = puntos - partidost;
                    victorias = aux / 3;
                    derrotas -= victorias;
                    System.out.println("El numero de victorias es de : " + victorias);
                    System.out.println("El numero de derrotas es de : " + derrotas);

                }
            }
        }

    }

}
