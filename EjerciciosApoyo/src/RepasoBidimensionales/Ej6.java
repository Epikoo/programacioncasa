/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package RepasoBidimensionales;

import java.util.Scanner;
import org.w3c.dom.css.CSSRule;


public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int matriz[][], n, mayor=0, sumadia=0, media=0;
        //introducir filas y columnas con controlador
        do {
            System.out.println("Introduzca un valor positivo para el numero de filas ");
            n = t.nextInt();
        } while (n < 1);
        matriz = new int[n][n];
         //Cargar matriz y sacar mayor
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) ((Math.random() * 10) + 1);
            }
        }
         //Recorrer diagonal principal y sacar su mayor asi como ir sumando valores
        for (int i = 0; i < matriz.length; i++) {
                sumadia+=matriz[i][i];
                if (matriz[i][i]>mayor) {
                    mayor=matriz[i][i];
                }
        }
        media=sumadia/matriz.length;
        System.out.println("El mayor de la diagonal principal es: " + mayor);
        System.out.println("La media de toda la diagonal es " + media);
         //Imprimir matriz
          for (int i = 0; i < matriz.length; i++) {
              System.out.print("[ ");
            for (int j = 0; j < matriz.length-1; j++) {
                System.out.print(matriz[i][j] + " , ");
            }
              System.out.println(matriz[i][matriz[i].length-1] + " ] ");
        }
    }

}
