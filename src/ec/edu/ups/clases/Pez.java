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
public class Pez extends Vertebrado implements Interface{
    private String agua;
    private boolean aleta;
    private boolean mandibula;
    private boolean camuflaje;

    public Pez(String agua, boolean aleta, boolean mandibula, boolean camuflaje, int numeroHuesos, String esqueleto, String sangre, String tejido, String nombre, int edad, int peso, String tipoAlimentacion) {
        super(numeroHuesos, esqueleto, sangre, tejido, nombre, edad, peso, tipoAlimentacion);
        this.agua = agua;
        this.aleta = aleta;
        this.mandibula = mandibula;
        this.camuflaje = camuflaje;
    }

    

    public String getAgua() {
        return agua;
    }

    public void setAgua(String agua) {
        this.agua = agua;
    }

    public boolean isAleta() {
        return aleta;
    }

    public void setAleta(boolean aleta) {
        this.aleta = aleta;
    }

    public boolean isMandibula() {
        return mandibula;
    }

    public void setMandibula(boolean mandibula) {
        this.mandibula = mandibula;
    }

    public boolean isCamuflaje() {
        return camuflaje;
    }

    public void setCamuflaje(boolean camuflaje) {
        this.camuflaje = camuflaje;
    }

    @Override
    public String toString() {
        return "Animal: "+"\n\tNombre: "+super.getNombre()+"\n\tEdad: "+super.getEdad()+"\n\tPeso: "+super.getPeso() +"\n\tAlimentacion: "+super.getTipoAlimentacion()+"\n"
               +"\tVertebrado: "+"\n\t\t\tEsqueleto: "+super.getEsqueleto() +"\n\t\t\tSangre: "+super.getSangre() +"\n\t\t\tTejido: "+super.getTejido()+"\n\t\t\tHuesos: "+super.getNumeroHuesos()+"\n"
               +"\t\tPez:"+ "\n\t\t\tAgua: " + agua + "\n\t\t\tAleta: " + aleta + "\n\t\t\tMandibula: " + mandibula + "\n\t\t\tcamuflaje: " + camuflaje +"\n";
    }
    
    public void ponerHuevos () {
        
    }
    
    public void nadar () {
        
    }
    
    public void camuflarse () {
        
    }

    @Override
    public void comer() {
        System.out.println("El pez de nombre "+super.getNombre()+", edad: "+super.getEdad()+", peso: "+super.getPeso() +", alimentacion: "+super.getTipoAlimentacion()
                +" esta comiendo");
    }


    @Override
    public void dormir() {
        System.out.println("El pez de nombre "+super.getNombre()+", edad: "+super.getEdad()+", peso: "+super.getPeso() +", alimentacion: "+super.getTipoAlimentacion()
                +" esta durmiendo");
    }

    @Override
    public void crecerColumnaVertebral() {
        System.out.println("El pez de nombre "+super.getNombre()+", edad: "+super.getEdad()+", peso: "+super.getPeso() +", alimentacion: "+super.getTipoAlimentacion()
                +" le crece la columna vertebral");
    }
    
}
