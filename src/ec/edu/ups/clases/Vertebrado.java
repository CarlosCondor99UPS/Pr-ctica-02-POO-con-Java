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
public abstract class Vertebrado extends Animal{
    public int numeroHuesos;
    public String esqueleto;
    public String sangre;
    public String tejido;

    public Vertebrado(int numeroHuesos, String esqueleto, String sangre, String tejido, String nombre, int edad, int peso, String tipoAlimentacion) {
        super(nombre, edad, peso, tipoAlimentacion);
        this.numeroHuesos = numeroHuesos;
        this.esqueleto = esqueleto;
        this.sangre = sangre;
        this.tejido = tejido;
    }

    
    public int getNumeroHuesos() {
        return numeroHuesos;
    }

    public void setNumeroHuesos(int numeroHuesos) {
        this.numeroHuesos = numeroHuesos;
    }

    public String getEsqueleto() {
        return esqueleto;
    }

    public void setEsqueleto(String esqueleto) {
        this.esqueleto = esqueleto;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public String getTejido() {
        return tejido;
    }

    public void setTejido(String tejido) {
        this.tejido = tejido;
    }

    @Override
    public String toString() {
        return "Vertebrado{" + "numeroHuesos=" + numeroHuesos + ", esqueleto=" + esqueleto + ", sangre=" + sangre + ", tejido=" + tejido + '}';
    }
    
    public abstract void crecerColumnaVertebral ();
    
}
