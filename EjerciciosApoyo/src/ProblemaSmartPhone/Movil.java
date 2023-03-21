
package ProblemaSmartPhone;

import java.security.AlgorithmParameterGeneratorSpi;


public class Movil {
       
    private int ram;
    private String marca, modelo;
    private boolean encedido=false;
    private double pulg, disco;
    private final double GRAMOS=133.3, CAMARA=12;
    
    public void setPulg(double pulg) {
        this.pulg = pulg;
    }

    public void setDisco(double disco) {
        this.disco = disco;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setEncedido(boolean encedido) {
        this.encedido = encedido;
    }
    

    public double getPulg() {
        return pulg;
    }

    public double getDisco() {
        return disco;
    }

    public double getGRAMOS() {
        return GRAMOS;
    }

    public double getCAMARA() {
        return CAMARA;
    }

    public int getRam() {
        return ram;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean getEncedido() {
        return encedido;
    }
    
}
