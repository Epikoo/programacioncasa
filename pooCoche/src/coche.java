
import com.sun.source.doctree.ReturnTree;
import java.lang.invoke.LambdaMetafactory;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author EPIKO
 */
public class coche {

    private Scanner t = new Scanner(System.in);
    private String color;
    private int puertas, ruedas, gasolina, l;
    private double altura, anchura;
    private boolean arrancado, check;

    public coche(int puertas, double altura, double anchura, String color) {

        this.puertas = puertas;
        this.altura = altura;
        this.anchura = anchura;
        this.color = color;
        this.ruedas = 4;
        this.arrancado = false;
        this.gasolina = 50;
        this.l = l;
        this.check=false;

    }

   /* public String toString() {
        String res = "El color del coche es " + color + "\n";
        res += "El coche tiene  " + puertas + " puertas \n";
        res += "El coche mide  " + altura + "cm de alto \n";
        res += "El coche mide  " + anchura + "cm de ancho \n";
        res += "El coche tiene  " + ruedas + " ruedas \n";
        return res;
    }*/

    @Override
    public String toString() {
        return "{" + "color=" + color + ", puertas=" + puertas + ", ruedas=" + ruedas + ", altura=" + altura + ", anchura=" + anchura + '}';
    }
    

    public void arrancar() {
        chequear();
        if (chequear()) {
            System.out.println("El coche no se puede arrancar de nuevo");      
        } else {
            this.gasolina -= 5;
            System.out.println("El coche se ha arrancado //Fuel= " + this.gasolina);
            this.arrancado = true;
        }
    }

    public void parar() {
        if (this.arrancado) {
            System.out.println("El coche se ha parado //Fuel= " + this.gasolina);
            this.arrancado = false;
        } else {
            System.out.println("El coche ya estaba apagado");
        }
    }

    public void desplazarse() {
        if (!arrancado) {
            System.out.println("Para moverse hay que encender el coche");
        } else {
            this.gasolina -= 20;
            System.out.println("El coche esta moviendose //Fuel= " + this.gasolina);
        }
    }

    public void repostar(int l) {
        if (arrancado) {
            System.out.println("Debe apagar el coche para repostar");
        } else {
            if (l + this.gasolina > 50) {
                System.out.println("La gasolina se esta callendo has despediciado " + ((l + this.gasolina) - 50) + " Litros");
                this.gasolina = 50;
            } else {
                this.gasolina += l;
                System.out.println("Ha repostado " + l + " litros // F=" + this.gasolina);
            }
        }
    }
    public Boolean chequear(){
        if (arrancado) {
            return true;
        }else{
            return false;
        }
    }
    public void pintar(String color2){
        this.color=color2;
        System.out.println("El coche ha sido pintado satisfactoriamente de color " + color2);
    }
    
}
