
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


public class vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        coche lambo=new coche(3, 1.20, 2.20, "Verde" );
        lambo.parar();
        lambo.arrancar();
        lambo.arrancar();
        lambo.pintar("Vinilo de penes");
        System.out.println(lambo);
        
    }

}
