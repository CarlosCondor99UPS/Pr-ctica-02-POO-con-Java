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
public class Artropodo extends Invertebrado implements Interface {
    private String forma;
    private boolean apendice;
    private boolean cabeza;
    private boolean poro;

    public Artropodo(String forma, boolean apendice, boolean cabeza, boolean poro, boolean proteccionCorporal, boolean excepcion, boolean movilidad, boolean venenoso, String nombre, int edad, int peso, String tipoAlimentacion) {
        super(proteccionCorporal, excepcion, movilidad, venenoso, nombre, edad, peso, tipoAlimentacion);
        this.forma = forma;
        this.apendice = apendice;
        this.cabeza = cabeza;
        this.poro = poro;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public boolean isApendice() {
        return apendice;
    }

    public void setApendice(boolean apendice) {
        this.apendice = apendice;
    }

    public boolean isCabeza() {
        return cabeza;
    }

    public void setCabeza(boolean cabeza) {
        this.cabeza = cabeza;
    }

    public boolean isPoro() {
        return poro;
    }

    public void setPoro(boolean poro) {
        this.poro = poro;
    }

    @Override
    public String toString() {
        return "Artropodo: " +"\n\tNombre: "+super.getNombre()+"\n\tEdad: "+super.getEdad()+"\n\tPeso: "+super.getPeso() +"\n\tAlimentacion: "+super.getTipoAlimentacion()
                +"\n\tProteccion Corporal: "+super.isProteccionCorporal()+"\n\tExcepcion: "+super.isExcepcion()+"\n\tMovilidad: "+super.isMovilidad()+"\n\tVeneso"+super.isVenenoso()
                + "\n\tForma: " + forma + "\n\tApendice: " + apendice + "\n\tCabeza: " + cabeza + "\n\tPoro: " + poro;
    }
    
    public void picar () {
        
    }
    
    public void trepar () {
        
    }
    
    public void atacar () {
        
    }

    @Override
    public void comer() {
        System.out.println("El Artropodo de nombre "+super.getNombre()+", edad: "+super.getEdad()+", peso: "+super.getPeso() +", alimentacion: "+super.getTipoAlimentacion()
                +" esta comiendo");
    }


    @Override
    public void dormir() {
        System.out.println("El Artropodo de nombre "+super.getNombre()+", edad: "+super.getEdad()+", peso: "+super.getPeso() +", alimentacion: "+super.getTipoAlimentacion()
                +" esta durmiendo");
    }
    
}
