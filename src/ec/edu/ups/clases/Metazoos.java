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
public class Metazoos extends Invertebrado{
    private boolean cuerpoBlando;
    private String simetria;
    private String piel;
    private boolean antenas;

    public Metazoos(boolean cuerpoBlando, String simetria, String piel, boolean antenas, boolean proteccionCorporal, boolean excepcion, boolean movilidad, boolean venenoso, String nombre, int edad, int peso, String tipoAlimentacion) {
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
        return "Metazoos{" + "cuerpoBlando=" + cuerpoBlando + ", simetria=" + simetria + ", piel=" + piel + ", antenas=" + antenas + '}';
    }

    
    
    
}
