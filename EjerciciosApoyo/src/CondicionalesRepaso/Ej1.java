/*
Ejercicio1
 */
package practica1;

import java.util.Scanner;

public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int numh, numm;
        //numh es para humano y numm es para maquina
        System.out.println("Introduzca el numero con el que competiras ");
        numh = t.nextInt();
        if (numh < 10 || numh > 30) {
            System.out.println("ERROR EL NUMERO DEBE ESTAR ENTRE 10 y 30");
        } else {
            numm = (int) (Math.random() * (50 - 10 + 1) + 10);
            System.out.println("La maquina ha sacado un: " + numm);
            if (numh > numm) {
                System.out.println("Has ganado");

            } else if (numh == numm) {
                System.out.println("Hay empate");
            } else {

                System.out.println("La maquina gana");
            }

        }
        t.close();
    }

}
