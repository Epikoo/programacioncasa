/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RepasoBidimensionales;

import java.util.Scanner;

public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int n, array[][];
        do {
            System.out.println("Introduzca el numero de filas de la matriz");
            n = t.nextInt();
            if (n < 3 || n > 5) {
                System.out.println("Error introduzca un valor entre 3 y 5");
            }
        } while (n < 3 || n > 5);
        array = new int[n][n];
        //Cargar matriz
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("Introduzca el valor");
                array[i][j]=t.nextInt();
            }
        }
        //Imprimir matriz
          for (int i = 0; i < array.length; i++) {
              System.out.print("[ ");
            for (int j = 0; j < array.length-1; j++) {
                System.out.print(array[i][j] + " , ");
            }
              System.out.println(array[i][array[i].length-1] + " ] ");
        }
    }
}
