/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.urnaDSO.entidades;
import br.UFSC.INE5605.urnaDSO.entidades.CARGO;

/**
 *
 * @author Ismael
 */
public class Voto {
    
    private Candidato candidato;
    private Cargo cargo;
 
    

    public Voto(Candidato candidato, CARGO cargo) {
        this.candidato = candidato;
        this.cargo = cargo;
       
    }

    public Voto() {
        
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public CARGO getCargo() {
        return cargo;
    }

    public void setCargo(CARGO cargo) {
        this.cargo = cargo;
    }

    
    
    
}
