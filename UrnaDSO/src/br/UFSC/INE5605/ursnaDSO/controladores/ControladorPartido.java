/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.ursnaDSO.controladores;

import br.UFSC.INE5605.ursnaDSO.entidades.PartidoPolitico;
import java.util.ArrayList;

/**
 *
 * @author Ivo Guilherme
 */
public class ControladorPartido {
    
    private ArrayList<PartidoPolitico>partidos;
    
    public ControladorPartido(){
        this.partidos = new ArrayList();
    }
    
    public ArrayList<PartidoPolitico> getPartidos(){
        return partidos;
    }
    
    public PartidoPolitico incluiPartidoPolitico (String partido){
        PartidoPolitico partidoPolitico = new PartidoPolitico(partido);
        if(!partidos.contains(partidoPolitico)){
            partidos.add(partidoPolitico);
            System.out.println("Partido Adicionado com Sucesso");
            return partidoPolitico;
        } else {
            System.out.println("Partido Existente");
            return null;
        }  
    }
    
}
