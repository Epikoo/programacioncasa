/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RepasoBidimensionales;

import java.util.Scanner;

public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int matriz[][], n, m, mayores = 0, menores=0, iguales=0;
        //introducir filas y columnas con controlador
        do {
            System.out.println("Introduzca un valor positivo para el numero de filas ");
            n = t.nextInt();
        } while (n < 1);
        do {
            System.out.println("Introduzca un valor positivo para el numero de columnas ");
            m = t.nextInt();
        } while (m < 1);
        matriz = new int[n][m];
        //Cargar matriz y comprobar el mayor
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Introduzca valor");
                matriz[i][j] = t.nextInt();
                if (matriz[i][j] > 0) {
                    mayores++;
                }else if (matriz[i][j] < 0) {
                    menores++;
                }else{
                    iguales++;
                }
            }
        }
        System.out.println("Los mayores a 0 son: " + mayores);
        System.out.println("Los menores a 0 son: " + menores);
        System.out.println("Los iguales a 0 son: " + iguales);
      
 
    }

}
