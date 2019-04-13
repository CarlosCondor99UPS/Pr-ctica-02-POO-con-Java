/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author tians
 */
public class Ave extends Vertebrado{
    private int numeroAlas;
    private boolean volador;
    private String formaPico;
    private int campoVision;

    public Ave(int numeroAlas, boolean volador, String formaPico, int campoVision, int numeroHuesos, String esqueleto, String sangre, String tejido, String nombre, int edad, int peso, String tipoAlimentacion) {
        super(numeroHuesos, esqueleto, sangre, tejido, nombre, edad, peso, tipoAlimentacion);
        this.numeroAlas = numeroAlas;
        this.volador = volador;
        this.formaPico = formaPico;
        this.campoVision = campoVision;
    }

    

    public int getNumeroAlas() {
        return numeroAlas;
    }

    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }

    public boolean isVolador() {
        return volador;
    }

    public void setVolador(boolean volador) {
        this.volador = volador;
    }

    public String getFormaPico() {
        return formaPico;
    }

    public void setFormaPico(String formaPico) {
        this.formaPico = formaPico;
    }

    public int getCampoVision() {
        return campoVision;
    }

    public void setCampoVision(int campoVision) {
        this.campoVision = campoVision;
    }

    @Override
    public String toString() {
        return "Ave{" + "numeroAlas=" + numeroAlas + ", volador=" + volador + ", formaPico=" + formaPico + ", campoVision=" + campoVision + '}';
    }
    
    
}
