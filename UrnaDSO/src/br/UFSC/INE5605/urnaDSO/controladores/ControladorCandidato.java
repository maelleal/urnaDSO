/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.urnaDSO.controladores;


import br.UFSC.INE5605.urnaDSO.interfaces.ICandidato;
import br.UFSC.INE5605.urnaDSO.entidades.Cargo;
import br.UFSC.INE5605.urnaDSO.entidades.Candidato;
import br.UFSC.INE5605.urnaDSO.entidades.PartidoPolitico;
import br.UFSC.INE5605.urnaDSO.telas.TelaCandidato;
import java.util.ArrayList;

/**
 *
 * @author Ivo Guilherme
 */
public class ControladorCandidato implements ICandidato {
    private TelaCandidato telaCandidato;
    private ArrayList<Candidato>deputados;
    private ArrayList<Candidato>governadores;

    public ControladorCandidato() {
        this.deputados = new ArrayList();
        this.governadores = new ArrayList();
        this.telaCandidato = new TelaCandidato();
    }
    
    public ArrayList<Candidato> getDeputados(){
        return deputados;
    }
    
    public ArrayList<Candidato> getGovernadores(){
        return governadores;
    }
    public Candidato incluiCandidato (Cargo cargo, PartidoPolitico partido, int numeroCandidato, String nome){
        Candidato candidato = new Candidato(cargo, partido, numeroCandidato, nome);
        if (cargo == cargo.DEPUTADO) {
            if(!deputados.contains(candidato)) {
                deputados.add(candidato);
                telaCandidato.adicionaDeputado();
                return candidato;
            } else {
            telaCandidato.candidatoExistente();
            return null; 
        } else {
            if(!governadores.contains(candidato)) {
            governadores.add(candidato);
           telaCandidato.adicionaGovernador();
            return candidato;
            }
            telaCandidato.candidatoExistente();
            return null; 
        }        
    }
    
}