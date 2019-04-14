/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;

import ec.edu.ups.clases.Animal;
import ec.edu.ups.clases.Artropodo;
import ec.edu.ups.clases.Ave;
import ec.edu.ups.clases.Metazoo;
import ec.edu.ups.clases.Pez;
import java.util.ArrayList;

/**
 *
 * @author tians
 */
public class prueba {
    public static void main(String[] args) {
        
         
        ArrayList<Animal> lista=new ArrayList<>();
        Ave anonimo=new Ave(4, true, "Curvado", 80, 35, "Interno", "Caliente",
                            "Vertebras", "Condor", 5, 80, "Carnivoro");
        Pez anonimo2=new Pez("Salada", true, true, false, 150, "Interno", "Fria", "Vertebrados y cartilagos",
                            "Pez espada", 5, 250, "Carnivoro");
        Metazoo anonimo3=new Metazoo(true, "Bilateral", "Mojada con anillos", false, false, false, true, false,
                            "Guasno de Agua", 1, 3, "Carniboros");
        Artropodo anonimo4=new Artropodo("Crustaceo", true, true, false, true, true, true, false, "Cangrejo",
                            2, 35, "Omniviparos");
        
        lista.add(anonimo);
        lista.add(anonimo2);
        lista.add(anonimo3);
        lista.add(anonimo4);
        
        for (Animal animal : lista) {
            if(animal instanceof Ave){
                Ave temp = (Ave) animal;   
                System.out.println(temp);
            }else if( animal instanceof Pez){
                Pez temp = (Pez) animal;
                System.out.println(temp);
            }else if (animal instanceof Artropodo){
                Artropodo temp = (Artropodo) animal;
                System.out.println(temp);
            }else if (animal instanceof Metazoo){
                Metazoo temp = (Metazoo) animal;
                System.out.println(temp);
            }
        }
        
        
        
        
    }
 
}
