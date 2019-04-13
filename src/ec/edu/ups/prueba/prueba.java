/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;

import ec.edu.ups.clases.Animal;
import ec.edu.ups.clases.Ave;
import ec.edu.ups.clases.Pez;
import java.util.ArrayList;

/**
 *
 * @author tians
 */
public class prueba {
    public static void main(String[] args) {
        
         
        ArrayList<Animal> lista=new ArrayList<>();
        Ave condor=new Ave(4, true, "Curvado", 80, 35, "Interno", "Caliente",
                            "Vertebras", "Condor", 5, 80, "Carnivoro");
        Pez espada=new Pez("Salada", true, true, false, 150, "Interno", "Fria", "Vertebrados y cartilagos",
                "Pez espada", 5, 250, "Carnivoro");
        
        
        
    }
 
}
