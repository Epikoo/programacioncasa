/*
 Ejercicio2
 */
package practica1;

import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {
        int nota1, nota2, nota3, media;
        boolean notasbien = true;
        Scanner t = new Scanner(System.in);
        System.out.println("Introduzca la nota 1");
        nota1 = t.nextInt();
        System.out.println("Introduzca la nota 2");
        nota2 = t.nextInt();
        System.out.println("Introduzca la nota 3");
        nota3 = t.nextInt();
        t.close();

        if (nota1 < 0 || nota1 > 10) {
            System.out.println("ERROR La nota 1 no es corecta " + nota1);
            notasbien = false;
        }
        if (nota2 < 0 || nota2 > 10) {
            System.out.println("ERROR La nota 2 no es corecta " + nota2);
            notasbien = false;
        }
        if (nota3 < 0 || nota3 > 10) {
            System.out.println("ERROR La nota 3 no es corecta " + nota3);
            notasbien = false;
        }
        if (notasbien) {
            media = (nota1 + nota2 + nota3) / 3;
            if (media <= 4) {
                System.out.println("Su media de " + media + " equivale a insuficiente");
            } else if (media <= 6) {
                System.out.println("Su media de " + media + " equivale a suficiente");
            } else if (media <= 8) {
                System.out.println("Su media de " + media + " equivale a notable");
            } else {
                System.out.println("Su media de " + media + " equivale a sobresaliente");

            }

        }

    }

}
