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
public class Animal {
    private String nombre;
    private int edad;
    private int peso;
    private String tipoAlimentacion;

    public Animal(String nombre, int edad, int peso, String tipoAlimentacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", tipoAlimentacion=" + tipoAlimentacion + '}';
    }
    
    
    
}
