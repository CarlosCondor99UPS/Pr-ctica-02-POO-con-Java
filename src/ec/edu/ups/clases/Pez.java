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
public class Pez extends Vertebrado {
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
        return "Pez{" + "agua=" + agua + ", aleta=" + aleta + ", mandibula=" + mandibula + ", camuflaje=" + camuflaje + '}';
    }
    
    
}
