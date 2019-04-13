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
public class Metazoo extends Invertebrado implements Interface{
    private boolean cuerpoBlando;
    private String simetria;
    private String piel;
    private boolean antenas;

    public Metazoo(boolean cuerpoBlando, String simetria, String piel, boolean antenas, boolean proteccionCorporal, boolean excepcion, boolean movilidad, boolean venenoso, String nombre, int edad, int peso, String tipoAlimentacion) {
        super(proteccionCorporal, excepcion, movilidad, venenoso, nombre, edad, peso, tipoAlimentacion);
        this.cuerpoBlando = cuerpoBlando;
        this.simetria = simetria;
        this.piel = piel;
        this.antenas = antenas;
    }

    public boolean isCuerpoBlando() {
        return cuerpoBlando;
    }

    public void setCuerpoBlando(boolean cuerpoBlando) {
        this.cuerpoBlando = cuerpoBlando;
    }

    public String getSimetria() {
        return simetria;
    }

    public void setSimetria(String simetria) {
        this.simetria = simetria;
    }

    public String getPiel() {
        return piel;
    }

    public void setPiel(String piel) {
        this.piel = piel;
    }

    public boolean isAntenas() {
        return antenas;
    }

    public void setAntenas(boolean antenas) {
        this.antenas = antenas;
    }

    @Override
    public String toString() {
        return "Metazoo: " +"\n\tNombre: "+super.getNombre()+"\n\tEdad: "+super.getEdad()+"\n\tPeso: "+super.getPeso() +"\n\tAlimentacion: "+super.getTipoAlimentacion()
                +"\n\tProteccion Corporal: "+super.isProteccionCorporal()+"\n\tExcepcion: "+super.isExcepcion()+"\n\tMovilidad: "+super.isMovilidad()+"\n\tVenenoso: "+super.isVenenoso()
                + "\n\tCuerpo Blando: " + cuerpoBlando + "\n\tSimetria: " + simetria + "\n\tPiel: " + piel + "\n\tAntenas: " + antenas ;
    }

    public void arrastrarse () {
        
    }
    
    public void descomponer () {
        
    }
    
    public void rastrear () {
        
    }

    @Override
    public void comer() {
        System.out.println("El Metazoo de nombre "+super.getNombre()+", edad: "+super.getEdad()+", peso: "+super.getPeso() +", alimentacion: "+super.getTipoAlimentacion()
                +" esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El Metazoo de nombre "+super.getNombre()+", edad: "+super.getEdad()+", peso: "+super.getPeso() +", alimentacion: "+super.getTipoAlimentacion()
                +" esta comiendo");
    }
    
}
