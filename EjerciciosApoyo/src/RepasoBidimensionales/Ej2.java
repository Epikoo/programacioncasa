/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RepasoBidimensionales;

import java.util.Scanner;

public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        final int N = 5;
        int matriz[][] = new int[N][N];

        //Cargar matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) ((Math.random() * 25) + 1);
            }
        }
        
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
