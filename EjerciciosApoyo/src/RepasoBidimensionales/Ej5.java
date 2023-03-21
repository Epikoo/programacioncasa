/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package RepasoBidimensionales;

import java.util.Scanner;


public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        final int N = 5;
        int matriz[][] = new int[N][N], mayor=0, primerafila=-1, primeracolumna=-1;

        //Cargar matriz y sacar mayor
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) ((Math.random() * 10) + 1);
                if (matriz[i][j]>mayor) {
                    mayor=matriz[i][j];
                }
            }
        }
        System.out.println("La raiz a estudiar es: ");
        //Imprimir matriz
          for (int i = 0; i < matriz.length; i++) {
              System.out.print("[ ");
            for (int j = 0; j < matriz.length-1; j++) {
                System.out.print(matriz[i][j] + " , ");
            }
              System.out.println(matriz[i][matriz[i].length-1] + " ] ");
        }
          
          //primera posi y lista de las posiciones
          
         System.out.println("El mayor es " + mayor + " las posiciones donde se repite son: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j]==mayor) {
                    System.out.print("[" + i + "]  [" + j + "]   //"); 
                    if (primerafila==-1) {
                        primerafila=i;
                        primeracolumna=j;
                    }
                }
            }
        }
        System.out.println("");
        System.out.println("La primera posicion donde aparece es: [" + primerafila + "]  [" + primeracolumna + "]   " );
    }

}
