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
import br.UFSC.INE5605.urnaDSO.telas.TelaCadastro;
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
    private ControladorPrincipal ctrlPrincipal;
    private TelaCadastro telaCadastro;
    
   
   
  
   

    public ControladorCandidato(ControladorCadastro ctrlCadastro) {
        this.ctrlPrincipal = ctrlPrincipal;
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
    public void incluiCandidato(){
        telaCandidato.exibeCadastroCandidato();
        
    }
    
    public void cadastraCandidato(String nome, String cargo, String partido, int numeroCandidato) {
       if(cargo.equals("deputado")){
           Candidato deputado = new Candidato(nome, cargo, partido, numeroCandidato);
           deputados.add(deputado);
           telaCandidato.incluiDeputado();
           telaCadastro.exibeMenuCadastro();
       }else{
           Candidato governador = new Candidato(nome, cargo, partido, numeroCandidato);
           governadores.add(governador);
           telaCandidato.incluiGovernador();
       }
    }
    
    /*
        try {
            while (candidato.getNumeroCandidato() < 01 || candidato.getNumeroCandidato() > 98 ) {            
            Candidato candidato = new Candidato(candidato.getCargo(), candidato.getPartido(), 
                candidato.getNumeroCandidato(), candidato.getNome());
        
            if (candidato.getCargo(Cargo.DEPUTADO)) { // Corrigir lógica
                if(!deputados.contains(candidato)) {
                    deputados.add(candidato);
                    telaCandidato.incluiDeputado();
                } else {
                    telaCandidato.candidatoExistente();
                }
            } else {
                if(!governadores.contains(candidato)) {
                governadores.add(candidato);
                telaCandidato.incluiGovernador();
                }
                telaCandidato.candidatoExistente();
            }
            
            }
            
        } catch (Exception e) {
            
        }
        
                
    }
    public void excluiCandidato (Candidato candidato){
        candidato.getNome();
        if(deputados.contains(candidato)){
            deputados.remove(candidato);
            telaCandidato.excluiDeputado();            
        } else if(governadores.contains(candidato)) {
            governadores.remove(candidato);
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
    public Candidato encontraGovernadorPeloNumero (int numeroCandidato){
        for (int i = 1; i < governadores.size(); i++) {
            Candidato candidato = governadores.get(i);
            if (numeroCandidato == candidato.getNumeroCandidato()) {
                return candidato;
            } 
        }
        return null;
    }
    */
    
}