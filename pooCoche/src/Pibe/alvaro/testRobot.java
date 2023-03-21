/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Pibe.alvaro;

import Pibe.Robot;
import java.util.Scanner;


public class testRobot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        Robot nacho=new Robot("Matzinger");
        System.out.println(nacho);
        System.out.println("Introduzca el nuevo nombre del robot");
        nacho.setNombre(t.next());
        nacho.setEnergia(-5);
        //nacho.encendido=true;
        System.out.println("La energia  es : " + nacho.getEnergia());
        //si queremos cambiar la variable para trabajar con ella sin modificar la inicial lo almacenamos en una variable aux
        int gastoenergia=nacho.getEnergia();
        gastoenergia-=3;
        System.out.println(gastoenergia);
        System.out.println(nacho);
       
    }
    
    

}
