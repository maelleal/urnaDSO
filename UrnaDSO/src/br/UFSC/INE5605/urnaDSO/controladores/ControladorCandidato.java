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
public class ControladorCandidato{
    private TelaCandidato telaCandidato;
    private ArrayList<Candidato>deputados;
    private ArrayList<Candidato>governadores;
    private ControladorCadastro ctrlCadastro;
   

    public ControladorCandidato(ControladorCadastro ctrlCadastro) {
        this.deputados = new ArrayList();
        this.governadores = new ArrayList();
        this.telaCandidato = new TelaCandidato(this);
        this.ctrlCadastro = ctrlCadastro;
    
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
                telaCandidato.incluiDeputado();
                return candidato;
            } else {
                telaCandidato.candidatoExistente();
                return null; 
            }
        } else {
            if(!governadores.contains(candidato)) {
            governadores.add(candidato);
           telaCandidato.incluiGovernador();
            return candidato;
            }
            telaCandidato.candidatoExistente();
            return null; 
        }        
    }
    public void excluiCandidato (Candidato candidato){
        candidato.getNome();
        if(deputados.contains(this)){
            deputados.remove(this);
            telaCandidato.excluiDeputado();            
        } else if(governadores.contains(this)) {
            governadores.remove(this);
            telaCandidato.excluiGovernador();
        } else {
            telaCandidato.candidatoInexistente();
        }
    }
    
    public Candidato encontraDeputadoPeloNumero (int numeroCandidato){
        for (int i = 1; i < deputados.size(); i++) {
            Candidato candidato = deputados.get(i);
            if (numeroCandidato == candidato.getNumeroCandidato()) {
                return candidato;
            } 
        }
        return null;
    }

    void incluiCandidato() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}