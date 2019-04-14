/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaz.Interface;

/**
 *
 * @author tians
 */
public class Ave extends Vertebrado implements Interface{
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
        return "Animal: "+"\n\tNombre: "+super.getNombre()+"\n\tEdad: "+super.getEdad()+"\n\tPeso: "+super.getPeso() +"\n\tAlimentacion: "+super.getTipoAlimentacion()+"\n"
               +"\tVertebrado: "+"\n\t\t\tEsqueleto: "+super.getEsqueleto() +"\n\t\t\tSangre: "+super.getSangre() +"\n\t\t\tTejido: "+super.getTejido()+"\n\t\t\tHuesos: "+super.getNumeroHuesos()+"\n"
               +"\t\tAve:"+ "\n\t\t\tAlas: " + numeroAlas + "\n\t\t\tVolador: " + volador + "\n\t\t\tForma Pico: " + formaPico + "\n\t\t\tCampo Vision(grados): " + campoVision +"\n";
        
    }

        
    public void cambiarPlumas () {
        
    }
    
    public void volar () {
        
    }
    
    public void picotear () {
        
    }

    @Override
    public void comer() {
        System.out.println("El ave de nombre "+super.getNombre()+", edad: "+super.getEdad()+", peso: "+super.getPeso() +", alimentacion: "+super.getTipoAlimentacion()
                +" esta comiendo");
    }


    @Override
    public void dormir() {
        System.out.println("El ave de nombre "+super.getNombre()+", edad: "+super.getEdad()+", peso: "+super.getPeso() +", alimentacion: "+super.getTipoAlimentacion()
                +" esta durmiendo");
    }

    @Override
    public void crecerColumnaVertebral() {
        System.out.println("El ave de nombre "+super.getNombre()+", edad: "+super.getEdad()+", peso: "+super.getPeso() +", alimentacion: "+super.getTipoAlimentacion()
                +" le crece la columna vertebral");
    }
}
