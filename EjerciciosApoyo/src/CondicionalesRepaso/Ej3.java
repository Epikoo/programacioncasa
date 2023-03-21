/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import java.util.Scanner;

public class Ej3 {

    /**
     * Ejercicio3
     */
    public static void main(String[] args) {
        int sueldoestandar, sueldoextra, horas, sueldotot;
        Scanner t = new Scanner(System.in);
        System.out.println("Introduzca el numero de horas trabajadas este mes ");
        horas = t.nextInt();
        t.close();
        //horas normales
        if (horas < 0) {
            System.out.println("Error las horas no las puedes deber las tienes que currar ");
        } else {
            if (horas <= 40) {
                sueldoestandar = horas * 12;
                sueldotot = sueldoestandar;
            } else {
                sueldoestandar = 40 * 12;
                sueldoextra = (horas - 40) * 16;
                sueldotot = sueldoestandar + sueldoextra;
            }
            System.out.println("El sueldo del mes es de " + sueldotot);
        }
    }

}
