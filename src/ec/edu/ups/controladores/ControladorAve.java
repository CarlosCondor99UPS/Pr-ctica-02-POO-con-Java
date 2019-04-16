/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Ave;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tians
 */
public class ControladorAve {
    private List<Ave> aves= new ArrayList<>();;

    public void ControladorPez() {
        aves = new ArrayList<>();
    }

    public void guardar(Ave ojeto) {
        aves.add(ojeto);
    }
    
    public Ave read(int codigo){
        for (Ave objeto : this.aves){
            if (objeto.getCodigo()==codigo){
                return objeto;
            }
        }
        return null;
    }
    
    public void update (Ave objeto){
        for (int i=0;i<aves.size();i++){
            Ave elemento=aves.get(i);
            if (elemento.getCodigo()==objeto.getCodigo()){
                aves.set(i, objeto);
                break;
            }
        }
    }
    
    public void delete(Ave objeto){
        for (int i=0;i<aves.size();i++){
            Ave elemento=aves.get(i);
            if (elemento.getCodigo()==objeto.getCodigo()){
                aves.remove(i);
                break;
            }
        }
    }
}
