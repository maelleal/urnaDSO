/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.urnaDSO.controladores;


import br.UFSC.INE5605.urnaDSO.interfaces.ICandidato;
import br.UFSC.INE5605.urnaDSO.entidades.CARGO;
import br.UFSC.INE5605.urnaDSO.entidades.Candidato;
import br.UFSC.INE5605.urnaDSO.entidades.PartidoPolitico;
import java.util.ArrayList;

/**
 *
 * @author Ivo Guilherme
 */
public class ControladorCandidato implements ICandidato {

    private ArrayList<Candidato>deputados;
    private ArrayList<Candidato>governadores;

    public ControladorCandidato() {
        this.deputados = new ArrayList();
        this.governadores = new ArrayList();
    }
    
    public ArrayList<Candidato> getDeputados(){
        return deputados;
    }
    
    public ArrayList<Candidato> getGovernadores(){
        return governadores;
    }
    public Candidato incluiCandidato (CARGO cargo, PartidoPolitico partido, int numeroCandidato, String nome){
        Candidato candidato = new Candidato(cargo, partido, numeroCandidato, nome);
        if(!deputados.contains(candidato)) {
            deputados.add(candidato);
            System.out.println("Candidato a Deputado Adcicionado com Sucesso");
            return candidato;
        } else {
            System.out.println("Candidato Existente");
            return null; 
        }        
    }
    
}