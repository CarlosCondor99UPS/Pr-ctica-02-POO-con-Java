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
public class Artropodo extends Invertebrado {
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
        return "Artropodo{" + "forma=" + forma + ", apendice=" + apendice + ", cabeza=" + cabeza + ", poro=" + poro + '}';
    }
    
    
}
