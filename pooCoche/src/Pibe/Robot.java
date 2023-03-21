/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pibe;

/**
 *
 * @author EPIKO
 */
public class Robot {

    private int energia; //entre 0 y 100
    public String nombre;
    boolean encendido;

    public Robot(String nombresito) {
        this.energia = 100;
        this.encendido = false;
        this.nombre = nombresito;
    }
    public String toString(){
        String res;
        res="ROBOT ( energia = " + this.energia + " nombre = " + this.nombre + " estado =  " + this.encendido + ")";
        return res;
    }
    public int getEnergia(){
        return this.energia;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEnergia( int newenergia){
        if (newenergia <= 0) {
            this.energia=0;
        }else{
        this.energia=newenergia;
        }
    }
    public void setNombre(String newname){
        this.nombre=newname;
    }
}
