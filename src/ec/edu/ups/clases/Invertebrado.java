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
public class Invertebrado extends Animal{
    private boolean proteccionCorporal;
    private boolean excepcion;
    private boolean movilidad;
    private boolean venenoso;

    public Invertebrado(boolean proteccionCorporal, boolean excepcion, boolean movilidad, boolean venenoso, String nombre, int edad, int peso, String tipoAlimentacion) {
        super(nombre, edad, peso, tipoAlimentacion);
        this.proteccionCorporal = proteccionCorporal;
        this.excepcion = excepcion;
        this.movilidad = movilidad;
        this.venenoso = venenoso;
    }

    public boolean isProteccionCorporal() {
        return proteccionCorporal;
    }

    public void setProteccionCorporal(boolean proteccionCorporal) {
        this.proteccionCorporal = proteccionCorporal;
    }

    public boolean isExcepcion() {
        return excepcion;
    }

    public void setExcepcion(boolean excepcion) {
        this.excepcion = excepcion;
    }

    public boolean isMovilidad() {
        return movilidad;
    }

    public void setMovilidad(boolean movilidad) {
        this.movilidad = movilidad;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    @Override
    public String toString() {
        return "Invertebrado{" + "proteccionCorporal=" + proteccionCorporal + ", excepcion=" + excepcion + ", movilidad=" + movilidad + ", venenoso=" + venenoso + '}';
    }
    
    
    
}
