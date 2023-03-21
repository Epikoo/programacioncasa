package ProblemaSmartPhone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Movil m1 = new Movil();
        Scanner t = new Scanner(System.in);
        System.out.println("Introduzca la marca de su dispositivo ");
        m1.setMarca(t.nextLine());
        System.out.println("Introduzca el modelo de su dispositivo ");
        m1.setModelo(t.nextLine());
        System.out.println("Introduzca las pulgadas de su dispositivo ");
        m1.setPulg(t.nextDouble());
        System.out.println("Introduzca la memoria RAM de su dispositivo ");
        m1.setRam(t.nextInt());
        System.out.println("Introduzca la memoria de su Disco duro de su dispositivo ");
        m1.setDisco(t.nextDouble());
        boolean e = m1.getEncedido(), w = true, general = true;
        while (general) {
            while (!e && w) {
                //Entraria solo si el Movil esta off
                System.out.println("Apagado !! Si quiere encender pulse 1 // Si quiere salir del programa pulse 8 ");
                int i = t.nextInt();
                if (i == 1) {
                    System.out.println("la marca de su dispositivo es:" + m1.getMarca());
                    System.out.println("la modelo de su dispositivo es:" + m1.getModelo());
                    System.out.println("la espacio de su dispositivo es:" + m1.getDisco());
                    m1.setEncedido(true);
                    w = false;
                } else if (i == 8) {
                    w = false;
                    general = false;
                }
            }
            e = m1.getEncedido();
            while (e && !w) {
                //solo entraria si esta encendido
                System.out.println("Encendido!!  Para apagar pulse 0  // Para salir del programa pulse 8");
                int i = t.nextInt();
                if (i == 0) {
                    System.out.println("Apagando Sistemas...");
                    m1.setEncedido(false);
                    w = true;

                } else if (i == 8) {
                    w = true;
                    general = false;
                }
            }

        }

    }

}
