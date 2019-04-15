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
 * @version 8.2
 * @since 2019
 */
public class prueba {

    //Metodos main para la ejecucion del programa
    public static void main(String[] args) {

        //Creacion de una lista de clase Animal
        ArrayList<Animal> lista = new ArrayList<>();
        //Creacion de un objeto de Ave
        Ave anonimo = new Ave(4, true, "Curvado", 80, 35, "Interno", "Caliente",
                "Vertebras", "Condor", 5, 80, "Carnivoro");
        //Creacion de un objeto de Pez
        Pez anonimo2 = new Pez("Salada", true, true, false, 150, "Interno", "Fria", "Vertebrados y cartilagos",
                "Pez espada", 5, 250, "Carnivoro");
        //Creacion de un objeto de Metazoo
        Metazoo anonimo3 = new Metazoo(true, "Bilateral", "Mojada con anillos", false, false, false, true, false,
                "Guasno de Agua", 1, 3, "Carniboros");
        //Creacion de un objeto de Artropodo
        Artropodo anonimo4 = new Artropodo("Crustaceo", true, true, false, true, true, true, false, "Cangrejo",
                2, 35, "Omniviparos");

        //Llenar la lista de animales
        lista.add(anonimo);
        lista.add(anonimo2);
        lista.add(anonimo3);
        lista.add(anonimo4);

        //DowncastingDown
        for (Animal animal : lista) {
            if (animal instanceof Ave) {
                Ave temp = (Ave) animal;
                //Impresion del objeto
                System.out.println(temp);
                //Impresion de los metodos Abstractos
                temp.comer();
                temp.crecerColumnaVertebral();
                temp.dormir();
            } else if (animal instanceof Pez) {
                Pez temp = (Pez) animal;
                //Impresion del objeto
                System.out.println(temp);
                //Impresion de los metodos Abstractos
                temp.comer();
                temp.crecerColumnaVertebral();
                temp.dormir();
            } else if (animal instanceof Artropodo) {
                Artropodo temp = (Artropodo) animal;
                //Impresion del objeto
                System.out.println(temp);
                //Impresion de los metodos Abstractos
                temp.comer();
                temp.multiplicarCelulas();
                temp.dormir();
            } else if (animal instanceof Metazoo) {
                Metazoo temp = (Metazoo) animal;
                //Impresion del objeto
                System.out.println(temp);
                //Impresion de los metodos Abstractos
                temp.comer();
                temp.multiplicarCelulas();
                temp.dormir();
            }
        }

    }

}
