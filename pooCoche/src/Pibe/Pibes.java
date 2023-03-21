/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pibe;

/**
 *
 * @author EPIKO
 */
public class Pibes {

    public String nombre;
    private int vidas;
    double ptsEsfuerzo;
    int ptsHambre;
    boolean vivo;
    private final double Max_Esfuezo = 10;
    final int Max_Hambre = 3;
    
    public Pibes(String nombresito){
        this.vivo=true;
        this.vidas=7;
        this.nombre=nombresito;
        this.ptsEsfuerzo=Max_Esfuezo;
        this.ptsHambre=Max_Hambre;
    }
}
