/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.ursnaDSO.controladores;

import br.UFSC.INE5605.ursnaDSO.entidades.Eleitor;
import br.UFSC.INE5605.ursnaDSO.telas.TelaEleitor;
import java.util.ArrayList;

/**
 *
 * @author Ismael
 */
public class ControladorEleitor {

    private ArrayList<Eleitor> eleitores;
    private TelaEleitor telaEleitor;

    public ControladorEleitor() {
        this.eleitores = new ArrayList();
        this.telaEleitor = new TelaEleitor();
    }
    
    
    
    //public void editaEleitor(Eleitor e)
    
    public Eleitor findEleitorByTitulo(int titulo){
        Eleitor a = null;
        for(Eleitor e : eleitores){
            if(e.getTituloEleitoral() == titulo){
                a = e;
            }      
        }
        return a;
    }
    
    
    public void incluiEleitor(Eleitor e){
        this.eleitores.add(e);//TODO tratar exceções
    }
    
    public void excluirEleitor(Eleitor e){
        this.eleitores.remove(e);//TODO tratar exceções
    }
    
    public void exibeEleitores(){
        
    }
    
}
