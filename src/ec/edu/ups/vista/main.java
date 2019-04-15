/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.clases.Pez;
import ec.edu.ups.controladores.ControladorPez;
import java.util.Scanner;

/**
 *
 * @author tians
 */
public class main {
 static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       
        int op = 0, op2 = 0;
        do {
            
            
            System.out.println("******* MENU ********");
            System.out.println("** 1. CRUD Pez");
            System.out.println("** 2. CRUD Ave");
            System.out.println("** 3. CRUD Artropodo");
            System.out.println("** 4. CRUD Metazoo");
            System.out.println("** 5. Salir");
            System.out.println("*********************");
            op = sc.nextInt();
            ControladorPez controladorPez=new ControladorPez();
            if (op == 1) {
                System.out.println("****** CRUD PEZ *******");
                mostrarCrud();
                op2=sc.nextInt();
                switch(op2){
                    case 1:
                        System.out.println("** Crear Pez **");
                        String[] animal1=new String[2];
                        animal1=crearAnimal1();
                        int[] animal2=new int[3];
                        animal2=crearAnimal2();
                        int numeroHuesos=crearVertebrado1();
                        String[] vertebrado = new String[3];
                        vertebrado=crearVertebrado2();
                        System.out.println("** Ingrese el agua");
                        String agua=sc.next();
                        System.out.println("** Ingrese la aleta(true/false)");
                        boolean aleta=sc.nextBoolean();
                        System.out.println("** Ingrese la mandibula(true/false)");
                        boolean mandibula=sc.nextBoolean();
                        System.out.println("** Ingrese el camuflaje(true/false)");
                        boolean camuflaje=sc.nextBoolean();
                        Pez objeto=new Pez(agua, aleta, mandibula, camuflaje, numeroHuesos, vertebrado[0], vertebrado[1], vertebrado[2], animal2[0], animal1[0], animal2[1], animal2[2], animal1[1]);
                        controladorPez.guardar(objeto);
                        
                        break;
                    case 2:
                        System.out.println("***** Leer Pez *****");
                        System.out.println("** Ingrese el codigo del pez");
                        int codigo=sc.nextInt();
                        System.out.println(controladorPez.read(codigo));
                        
                        break;
                }
            }
        } while (op != 5);
    }

    public static void mostrarCrud() {
        System.out.println("** 1. Crear");
        System.out.println("** 2. Leer");
        System.out.println("** 3. Actualizar");
        System.out.println("** 4. Borrar");
        System.out.println("** 6. Regresar");
        System.out.println("************************");
    }
    
    public static String[] crearAnimal1(){
        String [] animal=new String[2];
        System.out.println("** Ingrese el nombre");
        animal[0]=sc.next();
        System.out.println("** Ingrese el tipo de Alimentacion");
        animal[1]=sc.next();
        return animal;
    }
    
    public static int[] crearAnimal2(){
        int[] animal=new int[3];
        System.out.println("** Ingrese el codigo");
        animal[0]=sc.nextInt();
        System.out.println("** Ingrese la edad");
        animal[1]=sc.nextInt();
        System.out.println("** Ingrese el peso");
        animal[2]=sc.nextInt();
        return animal;
    }
    
    public static int crearVertebrado1(){
        System.out.println("** Ingrese el numero de huesos");
        int numeroHuesos=sc.nextInt();
        return numeroHuesos;
    }
    
    public static String[] crearVertebrado2(){
        String[] vertebrado=new String[3];
        System.out.println("** Ingrese el esqueleto");
        vertebrado[0]=sc.next();
        System.out.println("** Ingrese la sangre");
        vertebrado[1]=sc.next();
        System.out.println("** Ingrese tejido");
        vertebrado[2]=sc.next();
        return vertebrado;
    }
}
