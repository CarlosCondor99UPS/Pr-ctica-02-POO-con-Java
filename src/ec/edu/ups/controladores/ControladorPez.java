/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Pez;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tians
 */
public class ControladorPez {

    private List<Pez> peces;

    public void ControladorPez() {
        this.peces = new ArrayList<>();
    }

    public void guardar(Pez ojeto) {
        this.peces = new ArrayList<>();
        peces.add(ojeto);
    }
    
    public Pez read(int codigo){
        this.peces = new ArrayList<>();
        for (Pez objeto : this.peces){
            if (objeto.getCodigo()==codigo){
                return objeto;
            }
        }
        return null;
    }
    
    public void update (Pez objeto){
        for (int i=0;i<peces.size();i++){
            Pez elemento=peces.get(i);
            if (elemento.getCodigo()==objeto.getCodigo()){
                peces.set(i, objeto);
                break;
            }
        }
    }
    
    public void delete(Pez objeto){
        for (int i=0;i<peces.size();i++){
            Pez elemento=peces.get(i);
            if (elemento.getCodigo()==objeto.getCodigo()){
                peces.remove(i);
                break;
            }
        }
    }

}
